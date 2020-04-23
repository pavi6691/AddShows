package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Show;
import com.example.repositories.ShowRepository;

@Service
public class ShowServices {

	@Autowired
	ShowRepository showRepo;

	public String addShow(Show show) throws DatabaseException {
		System.out.println(show.getShowStartDateTime());
		try {
			Optional<Show> s = showRepo.findById(Long.parseLong(String.valueOf(show.getShowId())));
			if (!s.isPresent()) {
				showRepo.save(show);
				return "Show Added Successfully to dataBase";
			} else {
				return "Show Already exists in DataBase";
			}
		} catch (Exception e) {
			throw new DatabaseException("Error Adding Show! " + e.getMessage());
		}
	}
}
