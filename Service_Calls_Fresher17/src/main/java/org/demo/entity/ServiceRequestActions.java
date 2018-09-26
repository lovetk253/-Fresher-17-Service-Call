/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:51 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Persistent class for ServiceRequestActions entity stored in table Service_Request_Actions.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="Service_Request_Actions", catalog="db_assigment" )
public class ServiceRequestActions implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Response_ID", nullable=false)
    private Integer responseId ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Response_Datetime")
    private Date responseDatetime ;     @Column(name="Call_ID", nullable=false)
    private Integer callId ; // Foreign Key     @Column(name="Action_Code", nullable=false)
    private Integer actionCode ; // Foreign Key     @Column(name="Outcome_Code", nullable=false)
    private Integer outcomeCode ; // Foreign Key     @Column(name="Technician_ID", nullable=false)
    private Integer technicianId ; // Foreign Key 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ServiceRequestActions() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setResponseId(Integer responseId) {
        this.responseId = responseId ;
    }
	public Integer getResponseId() {
        return this.responseId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : Response_Datetime (DATETIME) 
	public void setResponseDatetime(Date responseDatetime) {this.responseDatetime = responseDatetime;}
	public Date getResponseDatetime() {return this.responseDatetime;}

	//--- DATABASE MAPPING : Call_ID (INT) 
	public void setCallId(Integer callId) {this.callId = callId;}
	public Integer getCallId() {return this.callId;}

	//--- DATABASE MAPPING : Action_Code (INT) 
	public void setActionCode(Integer actionCode) {this.actionCode = actionCode;}
	public Integer getActionCode() {return this.actionCode;}

	//--- DATABASE MAPPING : Outcome_Code (INT) 
	public void setOutcomeCode(Integer outcomeCode) {this.outcomeCode = outcomeCode;}
	public Integer getOutcomeCode() {return this.outcomeCode;}

	//--- DATABASE MAPPING : Technician_ID (INT) 
	public void setTechnicianId(Integer technicianId) {this.technicianId = technicianId;}
	public Integer getTechnicianId() {return this.technicianId;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(responseId); 
		sb.append(responseDatetime); 
		sb.append("|"); 
		sb.append(callId); 
		sb.append("|"); 
		sb.append(actionCode); 
		sb.append("|"); 
		sb.append(outcomeCode); 
		sb.append("|"); 
		sb.append(technicianId); 
        return sb.toString();
    }
}