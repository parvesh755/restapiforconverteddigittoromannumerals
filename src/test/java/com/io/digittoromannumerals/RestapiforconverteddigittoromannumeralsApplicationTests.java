package com.io.digittoromannumerals;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class RestapiforconverteddigittoromannumeralsApplicationTests {


	public RestapiforconverteddigittoromannumeralsApplicationTests() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testReturn1() {
	    int actual = romannumeralstodigit.romanConvert("I");
	    int expected = 1;
	    assertEquals(expected, actual);
	}
	@Test
	public void testReturn5() {
	    int actual = romannumeralstodigit.romanConvert("V");
	    int expected =5 ;
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn2() {
	    int actual = romannumeralstodigit.romanConvert("II");
	    int expected = 2;
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn4() {
	    int actual = romannumeralstodigit.romanConvert("IV");
	    int expected = 4;
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn399() {
	    int actual = romannumeralstodigit.romanConvert("CCCXCIX");
	    int expected = 399;
	    assertEquals(expected, actual);
	}

	@Test
	public void testReturn3992() {
	    int actual = romannumeralstodigit.romanConvert("MMMCMXCII");
	    int expected = 3992;
	    assertEquals(expected, actual);
	}

	@Test
    public void threeThousandNineHundredAndNinetyNine() {
		int actual = romannumeralstodigit.romanConvert("MMMCMXCIX");
	    int expected = 3999;
	    assertEquals(expected, actual);
		
        
    }
	
	

	
    @Test
    public void oneThousand() {
    	String actual = digittoromannumerals.IntegerToRomanNumeral(1000);
	    String expected = "M";
	    assertEquals(expected, actual);
    	
    	
    }

    
    @Test
    public void nineHundred() {
        String actual = digittoromannumerals.IntegerToRomanNumeral(900);
    	
	    String expected = "CM";
	    assertEquals(expected, actual);
    	
    }

   

    @Test
    public void ninety() {
    	String actual = digittoromannumerals.IntegerToRomanNumeral(90);
    	
	    String expected = "XC";
	    assertEquals(expected, actual);
    	
 }

    @Test
    public void eightyNine() {
    	String actual = digittoromannumerals.IntegerToRomanNumeral(89);
    	
	    String expected = "LXXXIX";
	    assertEquals(expected, actual);
      
    }

	}
