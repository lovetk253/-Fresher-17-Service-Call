/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:51 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import org.demo.entity.OutcomeCodes;
import java.util.List;

public interface OutcomeCodesService {

	public OutcomeCodes getOne(Integer outcomeCodes);

	public List<OutcomeCodes> findAll();

	public Boolean delete(Integer outcomeCodes);

	public OutcomeCodes create(OutcomeCodes outcomeCodes);

	public OutcomeCodes update(OutcomeCodes outcomeCodes);

	public Boolean exist(OutcomeCodes outcomeCodes);
}