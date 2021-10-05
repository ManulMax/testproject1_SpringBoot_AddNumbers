package com.example.addnumbers.services;

import org.springframework.stereotype.Service;

@Service
public class AddNumberServices{
    public int getAdd(int num1,int num2){
        return num1+num2;
    }
}
