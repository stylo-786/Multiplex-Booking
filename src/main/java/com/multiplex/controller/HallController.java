package com.multiplex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.dto.HallDTO;
import com.multiplex.dtotoentity.HallDtoToEntity;
import com.multiplex.entity.Hall;
import com.multiplex.service.HallService;

@RestController
public class HallController {
	@Autowired
	HallService hallservce;
	@Autowired
	HallDtoToEntity hallDtoToEntity;

	@PostMapping(value = "/addhall")

	public Hall addMovie(@RequestBody HallDTO hall) {
		return hallservce.addHall(hallDtoToEntity.convertHallDtoToEntity(hall));
	}

}
