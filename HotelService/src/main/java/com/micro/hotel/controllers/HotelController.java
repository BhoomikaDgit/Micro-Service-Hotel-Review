package com.micro.hotel.controllers;

import com.micro.hotel.HotelService.entites.Hotel;
import com.micro.hotel.HotelService.services.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelSrvice;
    //create
 @PostMapping
public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
return ResponseEntity.status(HttpStatus.CREATED).body(hotelSrvice.create(hotel));
}
    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> createHotel(@PathVariable String  hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelSrvice.get(hotelId));
    }
    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
     return ResponseEntity.ok(hotelSrvice.getAll());
    }
}
