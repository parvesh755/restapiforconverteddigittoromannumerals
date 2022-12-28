package com.io.digittoromannumerals.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@EnableAutoConfiguration
@RequestMapping("/api")
@RestController
public class romannumeralstodigitrest {

	 //@RequestMapping(value = "/rest/{roman}", method = RequestMethod.POST)
	 @PostMapping(value = "/{roman}")
	 public ResponseEntity<Integer> romanConvert(@RequestParam(value = "roman",required = false) String roman)
		{
		 try{		  
		 int decimal = 0;

		    String romanNumeral = roman.toUpperCase();
		    for(int x = 0;x<romanNumeral.length();x++)
		    {
		        char convertToDecimal = roman.charAt(x);

		        switch (convertToDecimal)
		        {
		        case 'M':
		            decimal += 1000;
		            break;

		        case 'D':
		            decimal += 500;
		            break;

		        case 'C':
		            decimal += 100;
		            break;

		        case 'L':
		            decimal += 50;
		            break;

		        case 'X':
		            decimal += 10;
		            break;

		        case 'V':
		            decimal += 5;
		            break;

		        case 'I':
		            decimal += 1;
		            break;
		        }
		    }
		    if (romanNumeral.contains("IV"))
		    {
		        decimal-=2;
		    }
		    if (romanNumeral.contains("IX"))
		    {
		        decimal-=2;
		    }
		    if (romanNumeral.contains("XL"))
		    {
		        decimal-=10;
		    }
		    if (romanNumeral.contains("XC"))
		    {
		        decimal-=10;
		    }
		    if (romanNumeral.contains("CD"))
		    {
		        decimal-=100;
		    }
		    if (romanNumeral.contains("CM"))
		    {
		        decimal-=100;
		    }
		 
		 // return decimal;
		    return new ResponseEntity<>(decimal, HttpStatus.OK);
		}
		
		 catch (Exception e) {
			 
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		}

	
	
}
