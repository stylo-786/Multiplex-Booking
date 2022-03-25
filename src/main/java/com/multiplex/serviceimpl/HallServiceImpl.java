package com.multiplex.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.dao.HallRepository;
import com.multiplex.entity.Hall;
import com.multiplex.service.HallService;
@Service
public class HallServiceImpl implements HallService {
@Autowired
HallRepository hallrepositary;
	@Override
	public Hall addHall(Hall hall) {
		return hallrepositary.save(hall);
	}

}
