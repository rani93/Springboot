package com.resttemplate.hotel.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resttemplate.hotel.exceptions.HotelNotFoundException;
import com.resttemplate.hotel.model.Hotel;
import com.resttemplate.hotel.service.HotelService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired 
	HotelService hotelService;
	
	@PostMapping("/create")
	public void createHotel(@Valid @RequestBody Hotel hotel, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			throw new RuntimeException("Request Not Valid please enter valid form");
		}
		hotelService.createHotel(hotel);
	} 
	
	@GetMapping("/id/{id}")
	public Hotel getHotelById(@PathVariable String id)
	{
		if(ObjectUtils.isEmpty(hotelService.getHotelById(id))){
			throw new HotelNotFoundException("Hotel not found for id: "+id);
		}
		return hotelService.getHotelById(id);
	}
	
	@GetMapping("/getAll")
	public List<Hotel> getAllHotels()
	{
		return hotelService.getAllHotels();
	}
	
	@DeleteMapping("/remove/id/{id}")
	public void deleteHotelById(@PathVariable String id)
	{
		hotelService.deleteHotelById(id);
		
	}
	
	@PutMapping("/update")
	public void updateHotel(@RequestBody Hotel hotel)
	{
		hotelService.updateHotel(hotel);
	}

}
