/*
 * Created on 5 Aug 2016 ( Time 01:12:36 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.app.common.dao.entity;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persistent class for entity stored in table "users"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="users")
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="UsersEntity.countAll", query="SELECT COUNT(x) FROM UsersEntity x" )
} )
public class UsersEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long       id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="user", nullable=false, length=30)
    private String     user         ;

    @Column(name="email", length=30)
    private String     email        ;

    @Column(name="password", nullable=false, length=100)
    private String     password     ;

    @Temporal(TemporalType.DATE)
    @Column(name="create_date", nullable=false)
    private Date       createDate   ;

    @Column(name="location", nullable=false, length=40)
    private String     location     ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public UsersEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Long id ) {
        this.id = id ;
    }
    public Long getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : user ( VARCHAR ) 
    public void setUser( String user ) {
        this.user = user;
    }
    public String getUser() {
        return this.user;
    }

    //--- DATABASE MAPPING : email ( VARCHAR ) 
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    //--- DATABASE MAPPING : password ( VARCHAR ) 
    public void setPassword( String password ) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    //--- DATABASE MAPPING : create_date ( DATE ) 
    public void setCreateDate( Date createDate ) {
        this.createDate = createDate;
    }
    public Date getCreateDate() {
        return this.createDate;
    }

    //--- DATABASE MAPPING : location ( VARCHAR ) 
    public void setLocation( String location ) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(user);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(createDate);
        sb.append("|");
        sb.append(location);
        return sb.toString(); 
    } 

}
