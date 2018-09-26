/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:50 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Persistent class for Contacts entity stored in table Contacts.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="Contacts", catalog="db_assigment" )
public class Contacts implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Contact_ID", nullable=false)
    private Integer contactId ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="Contact_Name", length=45)
    private String contactName ;     @Column(name="Job_Title", length=45)
    private String jobTitle ;     @Column(name="Contact_Details", length=45)
    private String contactDetails ;     @Column(name="Customers_Customer_ID", nullable=false)
    private Integer customersCustomerId ; // Foreign Key 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Contacts() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setContactId(Integer contactId) {
        this.contactId = contactId ;
    }
	public Integer getContactId() {
        return this.contactId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : Contact_Name (VARCHAR) 
	public void setContactName(String contactName) {this.contactName = contactName;}
	public String getContactName() {return this.contactName;}

	//--- DATABASE MAPPING : Job_Title (VARCHAR) 
	public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle;}
	public String getJobTitle() {return this.jobTitle;}

	//--- DATABASE MAPPING : Contact_Details (VARCHAR) 
	public void setContactDetails(String contactDetails) {this.contactDetails = contactDetails;}
	public String getContactDetails() {return this.contactDetails;}

	//--- DATABASE MAPPING : Customers_Customer_ID (INT) 
	public void setCustomersCustomerId(Integer customersCustomerId) {this.customersCustomerId = customersCustomerId;}
	public Integer getCustomersCustomerId() {return this.customersCustomerId;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(contactId); 
		sb.append(contactName); 
		sb.append("|"); 
		sb.append(jobTitle); 
		sb.append("|"); 
		sb.append(contactDetails); 
		sb.append("|"); 
		sb.append(customersCustomerId); 
        return sb.toString();
    }
}