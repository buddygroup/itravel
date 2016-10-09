package com.app.common.configuration;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
 
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
     
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       System.out.println("I am doing confifuration");
       http
       .formLogin().and()
       .authorizeRequests()
         .antMatchers("/static/views/Home.html","/static/*/*","/static/views/Home.html#/", "/static/views/Home.html#/home", "*/Home.html*/home", "/").permitAll()
         .antMatchers("/groupDetails.html").access("hasRole('ADMIN')")
         .anyRequest().authenticated().and()
         .addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class).csrf().csrfTokenRepository(csrfTokenRepository());
    }
    
    private CsrfTokenRepository csrfTokenRepository() {
    	  HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
    	  repository.setHeaderName("X-XSRF-TOKEN");
    	  return repository;
    	}
}