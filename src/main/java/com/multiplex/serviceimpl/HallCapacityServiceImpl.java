package com.multiplex.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.dao.HallCapacityRepository;
import com.multiplex.entity.HallCapacity;
import com.multiplex.service.HallCapacityService;

@Service
public class HallCapacityServiceImpl implements HallCapacityService {
	@Autowired
	HallCapacityRepository hallCapacityRepo;

	@Override
	public Boolean addCapacity(HallCapacity hallcapa) {
		if (hallcapa.getHalls() != null && hallcapa.getSeatCount() != 0 && hallcapa.getSeatType() != null) {
		hallCapacityRepo.save(hallcapa);
			return true;
		} else {
			return false;
		}

	}

}
