package com.example.wfc;

import java.util.ArrayList;

public class BookingSystem {
    private ArrayList<Lesson> lessonsDbArray;
    private ArrayList<Customer> customersDbArray;
    private ArrayList<Booking> bookingsDbArray;

    public BookingSystem() {
        lessonsDbArray = new ArrayList<>();
        customersDbArray = new ArrayList<>();
        bookingsDbArray = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookingsDbArray;
    }

    public ArrayList<Customer> getCustomers() {
        return customersDbArray;
    }

    public ArrayList<Lesson> getLessons() {
        return lessonsDbArray;
    }


//    Function to add a customer
    public void addCustomer(Customer customer){
        customersDbArray.add(customer);
    }

//    Function to add a Lesson
    public void addLesson(Lesson lesson){
        lessonsDbArray.add(lesson);
    }
}
