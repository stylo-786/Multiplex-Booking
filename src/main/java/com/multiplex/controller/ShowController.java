package com.multiplex.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.dto.ShowsDTO;
import com.multiplex.dtotoentity.ShowsDtoToEntity;
import com.multiplex.entity.Shows;
import com.multiplex.exception.ShowException;
import com.multiplex.service.ShowService;
@RestController

public class ShowController {
	@Autowired
	ShowService showservice;
	@Autowired
	ShowsDtoToEntity showsDtoToEntity;
	@CrossOrigin
	@PostMapping(value = "/addshow")
	public Shows addMovie(@RequestBody ShowsDTO shows) {
		return showservice.addShow(showsDtoToEntity.convertShowsDtoToEntity(shows));
	}
	
	@GetMapping("/showById/{showId}")
	public Shows getshowById(@PathVariable Integer showId) {
	Shows show = showservice.getShowId(showId);
		if (show != null) {
			return show;
		} else {
			throw new ShowException();
		}
	}
	@CrossOrigin
	@GetMapping("/getAllShows")
	public List<Shows> getAllShows() {
		List<Shows> shows = showservice.getAllShows();
			if (shows != null) {
				return shows;
			} else {
				throw new ShowException();
			}
		}
	

}
