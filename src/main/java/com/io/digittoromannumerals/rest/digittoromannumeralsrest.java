package com.io.digittoromannumerals.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@EnableAutoConfiguration
@RequestMapping("/api")
@RestController
public class digittoromannumeralsrest {
	
	 @PostMapping(value = "/{input}")
	public ResponseEntity<String> IntegerToRomanNumeral(@PathVariable int input) 
	{
			
    try{				
		if (input < 1 || input > 4000)
	    
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    
		String s = "";
	    
		while (input >= 1000) {
	        s += "M";
	        input -= 1000;        }
	    
		while (input >= 900) {
	        s += "CM";
	        input -= 900;
	    }
	    while (input >= 500) {
	        s += "D";
	        input -= 500;
	    }
	    while (input >= 400) {
	        s += "CD";
	        input -= 400;
	    }
	    while (input >= 100) {
	        s += "C";
	        input -= 100;
	    }
	    while (input >= 90) {
	        s += "XC";
	        input -= 90;
	    }
	    while (input >= 50) {
	        s += "L";
	        input -= 50;
	    }
	    while (input >= 40) {
	        s += "XL";
	        input -= 40;
	    }
	    while (input >= 10) {
	        s += "X";
	        input -= 10;
	    }
	    while (input >= 9) {
	        s += "IX";
	        input -= 9;
	    }
	    while (input >= 5) {
	        s += "V";
	        input -= 5;
	    }
	    while (input >= 4) {
	        s += "IV";
	        input -= 4;
	    }
	    while (input >= 1) {
	        s += "I";
	        input -= 1;
	    }    
	    return new ResponseEntity<>(s, HttpStatus.OK);
	}
  
	 catch (Exception e) {
		 
	      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	    }
		
	}
		
	 
	 
		 
}


