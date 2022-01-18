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
public class VideoGameRentalTest {
    Ps3Game littleBigPlanet;
    Xbox360Game fable2;
    WiiGame superSmashBrosBrawl;
    
    VideoGameRental bigplanetRental;
    VideoGameRental ssbrosRental;
    VideoGameRental fableRental;
    
    public VideoGameRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        littleBigPlanet = new Ps3Game("Little Big Planet");
        fable2 = new Xbox360Game("Fable 2");
        superSmashBrosBrawl = new WiiGame("Super Smash Bros. Brawl");
        bigplanetRental = new VideoGameRental(littleBigPlanet, 1, false);
        ssbrosRental = new VideoGameRental(superSmashBrosBrawl, 1, false);
        fableRental = new VideoGameRental(fable2, 1, false);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = bigplanetRental;
        int expResult = 1;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = ssbrosRental;
        Object expResult = superSmashBrosBrawl;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge of a Xbox360Game");
        VideoGameRental instance = fableRental;
        double expResult = 3.5;
        double result = instance.getCharge();
        assertEquals(expResult, result, 3.5);
        
        System.out.println("getCharge of a PS3Game");
        VideoGameRental instance2 = bigplanetRental;
        double expResult2 = 4;
        double result2 = instance2.getCharge();
        assertEquals(expResult2, result2, 4);
        
        System.out.println("getCharge of a WiiGame");
        VideoGameRental instance3 = ssbrosRental;
        double expResult3 = 3;
        double result3 = instance3.getCharge();
        assertEquals(expResult3, result3, 3);
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints of a PS3Game");
        VideoGameRental instance = bigplanetRental;
        int expResult = 2;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        
        System.out.println("getFrequentRenterPoints of a Xbox360Game");
        VideoGameRental instance2 = fableRental;
        int expResult2 = 2;
        int result2 = instance2.getFrequentRenterPoints();
        assertEquals(expResult2, result2);
        
        System.out.println("getFrequentRenterPoints of a WiiGame");
        VideoGameRental instance3 = ssbrosRental;
        int expResult3 = 1;
        int result3 = instance3.getFrequentRenterPoints();
        assertEquals(expResult3, result3);
    }
    
}
