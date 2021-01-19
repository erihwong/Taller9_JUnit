/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author erick
 */
public class VideoGameRentalTest {
    Ps3Game littleBigPlanet = new Ps3Game("Little Big Planet");
    Xbox360Game fable2 = new Xbox360Game("Fable 2");
    WiiGame superSmashBrosBrawl = new WiiGame("Super Smash Bros. Brawl");
    
    public VideoGameRentalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = new VideoGameRental(littleBigPlanet, 1, false);
        int expResult = 1;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = new VideoGameRental(fable2, 1, false);
        Object expResult = fable2;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = new VideoGameRental(fable2, 1, false);
        double expResult = 3.5;
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = new VideoGameRental(fable2, 1, false);
        int expResult = 2;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
