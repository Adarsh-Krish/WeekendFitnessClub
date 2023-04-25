package com.example.wfc;

public class Booking {

    private Customer customer;
    private Lesson lesson;
    private boolean attended;
    private int rating;

    public Booking(Customer customer, Lesson lesson) {
        this.customer = customer;
        this.lesson = lesson;
        this.attended = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public double getAverageRating() {
        int totalRating = 0;
        int ratedBookings = 0;
        for (int i =0; i< lesson.getBookingList().size(); i++) {
            if (rating > 0) {
                totalRating += rating;
                ratedBookings++;
            }
        }
            if (ratedBookings > 0) {
                return (double) totalRating / ratedBookings;
            } else {
                return 0;
            }

    }
}
