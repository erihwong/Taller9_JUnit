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
 * @author Ysrael
 */
public class MovieTest {
    
    public MovieTest() {
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
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = new Movie("Lord of the Rings",Movie.REGULAR);
        int expResult = Movie.REGULAR;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = Movie.NEW_RELEASE;
        Movie instance = new Movie("Over the Moon", Movie.CHILDRENS);
        instance.setPriceCode(arg);
        assertEquals(arg, instance.getPriceCode());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
