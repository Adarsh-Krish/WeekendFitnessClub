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
    public void addCustomer(Customer customer) {
        customersDbArray.add(customer);
    }

    //    Function to add a Lesson
    public void addLesson(Lesson lesson) {
        lessonsDbArray.add(lesson);
    }

    public void bookLesson(Customer customer, Lesson lesson) {
        if (lesson.isBookingFull()) {
            System.out.println("Sorry. This " + lesson.getFitnessType() + "is full");
        } else {
            Booking booking = new Booking(customer, lesson);
            lesson.addBookingList(booking);
            bookingsDbArray.add(booking);
            System.out.println("Booking confirmed for " + customer.getName() + " on " + lesson.getDay() + " for " + lesson.getFitnessType() + ".");
        }

    }


    public void cancelBooking(Booking booking) {
        if (booking.isAttended()) {
            System.out.println("Sorry, you cannot cancel an already attended lesson.");
        } else {
            Lesson lesson = booking.getLesson();
            lesson.removeBookingList(booking);
            bookingsDbArray.remove(booking);
            System.out.println("Booking cancelled for " + booking.getCustomer().getName() + " on " + lesson.getDay() + " for " + lesson.getFitnessType() + ".");

        }
    }

//    for (Booking b : bookingsDbArray) {
//        System.out.println("Customer Name:" + b.getCustomer().getName());
////            System.out.println("Customer Email:"+b.getCustomer().getEmail());
//        System.out.println("Fitness Type:" + b.getLesson().getFitnessType());
////            System.out.println("Day:"+b.getLesson().getDay());
////            System.out.println("Weekend:"+b.getLesson().getWeekend());
////            System.out.println("Available Capacity:"+b.getLesson().getAvailableCapacity());
////            System.out.println("Max Capacity:"+b.getLesson().getMaxCapacity());
//
//    }
}
