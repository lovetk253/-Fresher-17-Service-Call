/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:50 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Persistent class for OutcomeCodes entity stored in table Outcome_Codes.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="Outcome_Codes", catalog="db_assigment" )
public class OutcomeCodes implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Outcome_Codes", nullable=false)
    private Integer outcomeCodes ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="Outcome_Description", length=45)
    private String outcomeDescription ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public OutcomeCodes() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setOutcomeCodes(Integer outcomeCodes) {
        this.outcomeCodes = outcomeCodes ;
    }
	public Integer getOutcomeCodes() {
        return this.outcomeCodes;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : Outcome_Description (VARCHAR) 
	public void setOutcomeDescription(String outcomeDescription) {this.outcomeDescription = outcomeDescription;}
	public String getOutcomeDescription() {return this.outcomeDescription;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(outcomeCodes); 
		sb.append(outcomeDescription); 
        return sb.toString();
    }
}