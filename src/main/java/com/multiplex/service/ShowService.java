package com.multiplex.service;

import java.util.List;

import com.multiplex.entity.Shows;

public interface ShowService {
public Shows addShow(Shows show);
public Shows getShowId(Integer showId);
public List<Shows> getAllShows();
}
