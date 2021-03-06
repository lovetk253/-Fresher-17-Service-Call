/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:15:50 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.Actions;
import org.demo.repository.ActionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ActionsServiceImpl implements ActionsService {

	@Autowired
	private ActionsRepository actionsRepository;

	@Override
	public Actions getOne(Integer actionCode) {
		return actionsRepository.getOne(actionCode);
	}

	@Override
	public Boolean delete(Integer actionCode) {
		if (actionsRepository.getOne(actionCode) != null) {
			actionsRepository.deleteById(actionCode);
			return true;
		}
		return false;
	}

	@Override
	public Actions create(Actions actions) {
		return actionsRepository.save(actions);
	}

	@Override
	public Actions update(Actions actionsToUpdate) {
		Actions actions = actionsRepository.getOne(actionsToUpdate.getActionCode());

		if (actionsToUpdate.getActionDescription() != null) {

		}
		return actionsRepository.save(actions);
	}

	@Override
	public Boolean exist(Actions actions) {
		return actionsRepository.existsById(actions.getActionCode());
	}

	@Override
	public List<Actions> findAll() {
		return actionsRepository.findAll();
	}

}
