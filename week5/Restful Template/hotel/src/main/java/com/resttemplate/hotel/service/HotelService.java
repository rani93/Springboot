package com.resttemplate.hotel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.resttemplate.hotel.Communicator.RatingServiceCommunicator;
import com.resttemplate.hotel.exceptions.HotelNotFoundException;
import com.resttemplate.hotel.model.Hotel;

@Service
public class HotelService {

	@Autowired
	RatingServiceCommunicator ratingServiceCommunicator;

	List<Hotel> hotelList = new ArrayList<>();
	Map<String,Hotel> hotelMap= new HashMap<>();

	public void createHotel(Hotel hotel) {
		Map<String,Long> ratingMap = new HashMap<>();
		hotelList.add(hotel);
		hotelMap.put(hotel.getId(), hotel);
		ratingMap.put(hotel.getId(), hotel.getRating());
		ratingServiceCommunicator.addRating(ratingMap);
	}


	public Hotel getHotelById(String id) {
		
		if(ObjectUtils.isEmpty(hotelMap.get(id)))
		{
			throw new HotelNotFoundException("Hotel not found for id: "+id);
		}
		Hotel hotel = hotelMap.get(id);

		//rest service to fetch the rating by id
		long rating = ratingServiceCommunicator.getRating(id);
		hotel.setRating(rating);

		return hotel;
	}


	public List<Hotel> getAllHotels() {
		
		return hotelList;
	}


	public void deleteHotelById(String id) {
		Hotel hotel = getHotelById(id);
		hotelList.remove(hotel);
		hotelMap.remove(id);
	}


	public void updateHotel(Hotel updatedHotel) {
		//1. Get the previous data of the hotel
		//2. remove this old data from list
		//3. Add the updated data to the list.
		
		Hotel existingHotel= getHotelById(updatedHotel.getId());
		
		hotelList.remove(existingHotel);
		hotelList.add(updatedHotel);
		
		
		
		//4. update the previous data with new data.
		//5. Update the map with new data.
		
		hotelMap.put(updatedHotel.getId(), updatedHotel);

	}

	
	
}
