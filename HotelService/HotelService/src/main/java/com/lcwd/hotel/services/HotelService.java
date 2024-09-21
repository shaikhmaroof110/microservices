package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;


public interface HotelService {

    // Create
    Hotel Create (Hotel hotel);

    // get All
    List<Hotel> getAll();


    <Hotel> Object get(String id);


}
