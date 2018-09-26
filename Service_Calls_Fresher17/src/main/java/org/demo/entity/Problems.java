/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:51 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Persistent class for Problems entity stored in table Problems.
 * This class is a "record entity" without JPA links.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Entity
@Table(name="Problems", catalog="db_assigment" )
public class Problems implements Serializable {

	private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Problem_Code", nullable=false)
    private Integer problemCode ; 
    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="Problem_Description", length=45)
    private String problemDescription ; 

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Problems() {
		super();
    }

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
	public void setProblemCode(Integer problemCode) {
        this.problemCode = problemCode ;
    }
	public Integer getProblemCode() {
        return this.problemCode;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
	//--- DATABASE MAPPING : Problem_Description (VARCHAR) 
	public void setProblemDescription(String problemDescription) {this.problemDescription = problemDescription;}
	public String getProblemDescription() {return this.problemDescription;}


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(problemCode); 
		sb.append(problemDescription); 
        return sb.toString();
    }
}