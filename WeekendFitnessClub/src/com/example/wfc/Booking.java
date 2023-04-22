package com.example.wfc;

public class Booking {

    private Customer customer;
    private Lesson lesson;

    public Booking(Customer customer, Lesson lesson){
        this.customer = customer;
        this.lesson = lesson;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Lesson getLesson() {
        return lesson;
    }
}
