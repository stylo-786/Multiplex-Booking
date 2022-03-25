package com.multiplex.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.dao.SeatTypeRepository;
import com.multiplex.entity.SeatType;
import com.multiplex.service.SeatTypeService;

@Service
public class SeatTypeServiceImpl implements SeatTypeService {
	@Autowired
	SeatTypeRepository seatTypeRepo;

	@Override
	public Boolean addSeatType(SeatType seattype) {
		if (seattype.getSeatFare() >= 0 && !seattype.getSeatTypeDesc().isEmpty() && seattype.getSeatTypeId() != 0) {
			seatTypeRepo.save(seattype);
			return true;
		} else {
			return false;
		}
	}

}
