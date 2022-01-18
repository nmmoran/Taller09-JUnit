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
public class CustomerTest {
    Ps3Game littleBigPlanet;
    Xbox360Game fable2;
    WiiGame superSmashBrosBrawl;
    VideoGameRental bigplanetRental;
    VideoGameRental ssbrosRental;
    VideoGameRental fableRental;
    
    MovieRental rentOfmulan;
    
    public CustomerTest() {
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
        Movie mulan = new Movie("Mulan", Movie.CHILDRENS);
        rentOfmulan = new MovieRental(mulan, 2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = rentOfmulan;
        Customer instance = new Customer("Jeff");
        instance.addMovieRental(arg);

    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = bigplanetRental;
        Customer instance = new Customer("Nicole");
        instance.addVideoGameRental(arg);
        
    }

    
    @Test
    public void testStatementPs3GameOnly() {
        System.out.println("testStatementPs3GameOnly");
        Customer johnDoe = new Customer("John Doe");
        johnDoe.addVideoGameRental(new VideoGameRental(littleBigPlanet, 1, false));
        assertEquals("Rental Record for John Doe\n"
                + "\tLittle Big Planet\t4.0\n"
                + "Amount owed is 4.0\n"
                + "You earned 2 frequent renter points",
                johnDoe.statement());
        johnDoe.addVideoGameRental(new VideoGameRental(littleBigPlanet, 3, false));
        assertEquals("Rental Record for John Doe\n"
                + "\tLittle Big Planet\t4.0\n"
                + "\tLittle Big Planet\t4.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 4 frequent renter points",
                johnDoe.statement());
        johnDoe.addVideoGameRental(new VideoGameRental(littleBigPlanet, 5, false));
        assertEquals("Rental Record for John Doe\n"
                + "\tLittle Big Planet\t4.0\n"
                + "\tLittle Big Planet\t4.0\n"
                + "\tLittle Big Planet\t5.25\n"
                + "Amount owed is 13.25\n"
                + "You earned 6 frequent renter points",
                johnDoe.statement());
    }

    @Test
    public void testStatementWiiGameOnly() {
        System.out.println("testStatementWiiGameOnly");
        Customer johnDoeJr = new Customer("Johnny Doe, Jr.");
        johnDoeJr.addVideoGameRental(new VideoGameRental(superSmashBrosBrawl, 1, false));
        assertEquals("Rental Record for Johnny Doe, Jr.\n"
                + "\tSuper Smash Bros. Brawl\t3.0\n"
                + "Amount owed is 3.0\n"
                + "You earned 1 frequent renter points",
                johnDoeJr.statement());
        johnDoeJr.addVideoGameRental(new VideoGameRental(superSmashBrosBrawl, 3, false));
        assertEquals("Rental Record for Johnny Doe, Jr.\n"
                + "\tSuper Smash Bros. Brawl\t3.0\n"
                + "\tSuper Smash Bros. Brawl\t3.0\n"
                + "Amount owed is 6.0\n"
                + "You earned 2 frequent renter points",
                johnDoeJr.statement());
        johnDoeJr.addVideoGameRental(new VideoGameRental(superSmashBrosBrawl, 5, false));
        assertEquals("Rental Record for Johnny Doe, Jr.\n"
                + "\tSuper Smash Bros. Brawl\t3.0\n"
                + "\tSuper Smash Bros. Brawl\t3.0\n"
                + "\tSuper Smash Bros. Brawl\t4.5\n"
                + "Amount owed is 10.5\n"
                + "You earned 3 frequent renter points",
                johnDoeJr.statement());
    }

    @Test
    public void testStatementXbox360GameOnly() {
        System.out.println("testStatementXbox360GameOnly");
        Customer janeDoe = new Customer("Jane Doe");
        janeDoe.addVideoGameRental(new VideoGameRental(fable2, 1, false));
        assertEquals("Rental Record for Jane Doe\n"
                + "\tFable 2\t3.5\n"
                + "Amount owed is 3.5\n"
                + "You earned 2 frequent renter points",
                janeDoe.statement());
        janeDoe.addVideoGameRental(new VideoGameRental(fable2, 2, false));
        assertEquals("Rental Record for Jane Doe\n"
                + "\tFable 2\t3.5\n"
                + "\tFable 2\t3.5\n"
                + "Amount owed is 7.0\n"
                + "You earned 4 frequent renter points",
                janeDoe.statement());
        janeDoe.addVideoGameRental(new VideoGameRental(fable2, 4, false));
        assertEquals("Rental Record for Jane Doe\n"
                + "\tFable 2\t3.5\n"
                + "\tFable 2\t3.5\n"
                + "\tFable 2\t5.0\n"
                + "Amount owed is 12.0\n"
                + "You earned 6 frequent renter points",
                janeDoe.statement());
    }

    
}
