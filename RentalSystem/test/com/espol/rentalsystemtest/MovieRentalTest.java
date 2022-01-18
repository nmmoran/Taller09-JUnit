/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eDannX
 */
public class MovieRentalTest {
    
    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    MovieRental rentOfmulan;
    
    public MovieRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
        rentOfmulan = new MovieRental(mulan, 2);
        
    }
 
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
    
    @Test
    public void testGetTitle() {
        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
    }
    
    @Test
    public void testGetDaysRented() {
        assertEquals(2, rentOfmulan.getDaysRented());
    }

    @Test
    public void testGetMovie() {
        assertEquals(mulan, rentOfmulan.getMovie());
    }
    
}
