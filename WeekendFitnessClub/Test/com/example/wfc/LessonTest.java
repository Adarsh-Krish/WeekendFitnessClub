package com.example.wfc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class LessonTest {
    @Test
    public void testConstructor() {
        String fitnessType = "Boxing";
        String day = "Sunday";
        String weekend = "No";
        int price = 10;

        Lesson lesson = new Lesson(fitnessType, day, weekend, price);

        assertNotNull(lesson);
        assertEquals(fitnessType, lesson.getFitnessType());
        assertEquals(day, lesson.getDay());
        assertEquals(weekend, lesson.getWeekend());
        assertEquals(price, lesson.getPrice());
    }

    @Test
    public void testIsBookingFull() {
        String fitnessType = "Boxing";
        String day = "Sunday";
        String weekend = "No";
        int price = 10;

        Lesson lesson = new Lesson(fitnessType, day, weekend, price);
        Customer customer = new Customer("Henry", "Henry@gmail.com");

        assertFalse(lesson.isBookingFull());

        // add 10 bookings
        for(int i = 0; i < 10; i++) {
            lesson.addBookingList(new Booking(customer, lesson));
        }
        assertTrue(lesson.isBookingFull());
    }

    @Test
    public void testAddBookingList() {
        String fitnessType = "Boxing";
        String day = "Sunday";
        String weekend = "No";
        int price = 10;

        Lesson lesson = new Lesson(fitnessType, day, weekend, price);
        Customer customer = new Customer("Henry", "Henry@gmail.com");
        ArrayList<Booking> bookingList = lesson.getBookingList();
        assertNotNull(bookingList);
        assertEquals(0, bookingList.size());

        lesson.addBookingList(new Booking(customer, lesson));
        assertEquals(1, bookingList.size());
    }

    @Test
    public void testRemoveBookingList() {
        String fitnessType = "Boxing";
        String day = "Sunday";
        String weekend = "No";
        int price = 10;

        Lesson lesson = new Lesson(fitnessType, day, weekend, price);
        Customer customer = new Customer("Henry", "Henry@gmail.com");

        ArrayList<Booking> bookingList = lesson.getBookingList();
        assertNotNull(bookingList);
        assertEquals(0, bookingList.size());

        Booking booking = new Booking(customer, lesson);
        lesson.addBookingList(booking);
        assertEquals(1, bookingList.size());

        lesson.removeBookingList(booking);
        assertEquals(0, bookingList.size());
    }

}