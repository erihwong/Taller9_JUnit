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
public class CustomerTest {
    Movie movieTest = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
    MovieRental mrTest = new MovieRental(movieTest, 2);
    Ps3Game littleBigPlanet = new Ps3Game("Little Big Planet");
    
    public CustomerTest() {
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
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(movieTest, 2);
        Customer instance = new Customer("Alex");
        instance.addMovieRental(arg);
        
        assertEquals(arg, instance.getMovieRentals().get(instance.getMovieRentals().size()-1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(littleBigPlanet, 1, false);
        Customer instance = new Customer("Pedro");
        instance.addVideoGameRental(arg);
        assertEquals(arg, instance.getVideoGameRental().get(instance.getVideoGameRental().size()-1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Customer");
        String expResult = "Rental Record for  Customer/nAmount owed is 0/nYou earned 0 frequent center points";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
