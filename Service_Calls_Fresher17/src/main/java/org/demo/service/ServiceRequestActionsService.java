/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:51 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import org.demo.entity.ServiceRequestActions;
import java.util.List;

public interface ServiceRequestActionsService {

	public ServiceRequestActions getOne(Integer responseId);

	public List<ServiceRequestActions> findAll();

	public Boolean delete(Integer responseId);

	public ServiceRequestActions create(ServiceRequestActions serviceRequestActions);

	public ServiceRequestActions update(ServiceRequestActions serviceRequestActions);

	public Boolean exist(ServiceRequestActions serviceRequestActions);
}
