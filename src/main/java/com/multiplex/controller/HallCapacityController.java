package com.multiplex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.dto.HallCapacityDTO;
import com.multiplex.dtotoentity.HallCapacityDtoToEntity;
import com.multiplex.exceptionhandler.Constants;
import com.multiplex.service.HallCapacityService;

@RestController
public class HallCapacityController {
	@Autowired
	HallCapacityService hallCapacityservice;
	@Autowired
	HallCapacityDtoToEntity hallCapacityDtoToEntity;

	@PostMapping("/addCapacity")
	public String addCapacity(@RequestBody HallCapacityDTO hallcapa) {
		boolean isAdded = hallCapacityservice.addCapacity(hallCapacityDtoToEntity.convertHallCapacityDtoToEntity(hallcapa));
		if (isAdded) {
			return Constants.SUCCESS;
		} else {
			return Constants.FAILED;
		}
	}
	

}
