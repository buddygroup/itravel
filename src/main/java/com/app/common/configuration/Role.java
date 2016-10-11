package com.app.common.configuration;
import org.springframework.security.core.GrantedAuthority;
 
public class Role implements GrantedAuthority {
 
    private static final long serialVersionUID = 1L;
    private String name;

 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String getAuthority() {
        return this.name;
    }
 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Role [name=");
        builder.append(name);
        builder.append(", privileges=");
        builder.append("]");
        return builder.toString();
    }
}