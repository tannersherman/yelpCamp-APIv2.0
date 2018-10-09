package com.yelpCamp.dao;

import com.yelpCamp.entity.Campground;
import com.yelpCamp.entity.User;

import java.util.Collection;



public interface CampgroundDao {
    Collection<Campground> getAllCampgrounds();

    Campground getCampgroundById(int id);

    void deleteCampgroundById(int id);

    void updateCampground(Campground campground);

    void insertCampground(Campground campground);
    
    void save(User user);

	User findByEmail(String email);
	
	void deleteUserById(long userId);

	void updateUser(User user);
}
