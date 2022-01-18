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
public class MovieTest {
    
    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = this.theManWhoKnewTooMuch;
        int expResult = Movie.REGULAR;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);

    }
    

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = Movie.CHILDRENS;
        Movie instance = this.mulan;
        instance.setPriceCode(arg);
        assertEquals(arg,instance.getPriceCode());

    }
    
    @Test
    public void testChangePriceCode() {
        System.out.println("getPriceCode");
        Movie instance = this.slumdogMillionaire;
        int expResult = Movie.NEW_RELEASE;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);   
        int arg = Movie.REGULAR;
        instance.setPriceCode(arg);
        assertEquals(arg, instance.getPriceCode());       
    }
    
    /*
    ejecutado cada linea de codigo
    */
    
}
