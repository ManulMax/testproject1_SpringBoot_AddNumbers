package com.example.addnumbers.controllers;

import com.example.addnumbers.services.AddNumberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AddNumberController {
    @Autowired
    private AddNumberServices addNumbers;

    @GetMapping(value = "/add/{num1}/{num2}")
    public int getAddition(@PathVariable int num1, @PathVariable int num2){
        return addNumbers.getAdd(num1,num2);
    }
}

