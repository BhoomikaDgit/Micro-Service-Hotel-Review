package com.micro.hotel.HotelService.services;
import com.micro.hotel.HotelService.entites.Hotel;

import java.util.List;
public interface HotelService {
    //create
    Hotel create(Hotel hotel);


    //getall
    List<Hotel> getAll();
    //get single
    Hotel get(String id);
}
