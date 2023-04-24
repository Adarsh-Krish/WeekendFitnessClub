package com.example.wfc;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

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

    public int getBookingIndex(String customerName, String lessonName, String lessonDay, String lessonWeekend) {
        for (int i = 0; i < bookingsDbArray.size(); i++) {
            Booking booking = bookingsDbArray.get(i);
            if (booking.getCustomer().getName().equalsIgnoreCase(customerName) && booking.getLesson().getFitnessType().equalsIgnoreCase(lessonName)
                    && booking.getLesson().getDay().equalsIgnoreCase(lessonDay) && booking.getLesson().getWeekend().equalsIgnoreCase(lessonWeekend)) {
                return i;
            }
        }
        return -1; // return -1 if the booking is not found
    }

    public void viewBookingDb(){
        if (bookingsDbArray.size() != 0){
            for (int i = 0; i < bookingsDbArray.size(); i++) {
                System.out.println("Name: "+bookingsDbArray.get(i).getCustomer().getName());
                System.out.println("Email: "+bookingsDbArray.get(i).getCustomer().getEmail());

                System.out.println("Lesson: "+bookingsDbArray.get(i).getLesson().getFitnessType());
                System.out.println("Day: "+bookingsDbArray.get(i).getLesson().getDay());
                System.out.println("Weekend: "+bookingsDbArray.get(i).getLesson().getWeekend());
                System.out.println("availableCapacity: "+bookingsDbArray.get(i).getLesson().getAvailableCapacity());
                System.out.println("rating: "+bookingsDbArray.get(i).getRating());
            }
        } else System.out.println("Nothing in array");

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
            System.out.println("Sorry. This " + lesson.getFitnessType() + " is full");
        } else {
            Booking booking = new Booking(customer, lesson);
            if (lesson.getAvailableCapacity() == 0){
                System.out.println("Sorry! No room available for this lesson");
            } else if (lesson.getAvailableCapacity() > 0) {
                lesson.addBookingList(booking);
                bookingsDbArray.add(booking);
                lessonsDbArray.add(lesson);
                System.out.println("Booking confirmed for " + customer.getName() + " on " + lesson.getDay() + " for " + lesson.getFitnessType() + ".");
            }

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

    public void changeBooking(Booking booking, Lesson newlesson){
        if (newlesson.isBookingFull()){
            System.out.println("Sorry, this lesson is already full.");
        } else if (booking.isAttended()){
            System.out.println("Sorry, you cannot change an already attended lesson.");
        } else {
            Lesson oldLesson = booking.getLesson();
            oldLesson.removeBookingList(booking);
            booking.setLesson(newlesson);
            newlesson.addBookingList(booking);
            System.out.println("Booking changed for " + booking.getCustomer().getName() + " from " + oldLesson.getDay() + " for " + oldLesson.getFitnessType() + " to " + newlesson.getDay() + " for " + newlesson.getFitnessType() + ".");
        }
    }


    public void rateLesson(Booking booking, int rating){
//        *****************************************************************************
//        *****************************************************************************
//            TRIAL:  Changing all isAttended to true
        booking.setAttended(true);
//        *****************************************************************************
//        *****************************************************************************




        if (!booking.isAttended()){
            System.out.println("You cannot rate a lesson that you have not attended.");
        } else {
            booking.setRating(rating);
            System.out.println("Thank you for your response on the lesson "+booking.getLesson().getFitnessType());
        }
    }

    public void printFinalReport() {
//        System.out.println("Lesson Report");
//        int customerInYoga = 0, customerInSpin = 0, customerInPilates = 0, customerInCrossfit = 0, customerInBoxing = 0;
//        int ratingFromDb = 0, countOfRating = 0;
//        String lessonName, lessonDay, lessonRating;
//
//        for (int i = 0; i < bookingsDbArray.size(); i++) {
//            lessonName = bookingsDbArray.get(i).getLesson().getFitnessType();
//            lessonDay = bookingsDbArray.get(i).getLesson().getDay();
////            To get rating
//            if (bookingsDbArray.get(i).getRating() > 0) {
//                ratingFromDb = ratingFromDb + bookingsDbArray.get(i).getRating();
//                countOfRating++;
//            }
//
//
////            get number of customers
//            if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Yoga")) {
//                customerInYoga++;
//            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Spin")) {
//                customerInSpin++;
//            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Pilates")) {
//                customerInPilates++;
//            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Crossfit")) {
//                customerInCrossfit++;
//            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Boxing")) {
//                customerInBoxing++;
//            }
//
//        }
    }




//            System.out.println(bookingsDbArray.get(i).getLesson().getFitnessType()+" Statistics: ");


//            System.out.print("Day: "+bookingsDbArray.get(i).getLesson().getDay()+"  "+);
//            System.out.println("Weekend: "+bookingsDbArray.get(i).getLesson().getWeekend());
//            System.out.println("maxCapacity: "+bookingsDbArray.get(i).getLesson().getMaxCapacity());
//            System.out.println("rating: "+bookingsDbArray.get(i).getRating());
//        }



//        for (Lesson lesson : lessonsDbArray) {
//            System.out.println("Lesson: " + lesson.getFitnessType() + ", Day: " + lesson.getDay());
//            System.out.println("Number of Customers: " + lesson.getBookingList().size());
//            int totalRating = 0;
//            int ratedBookings = 0;
//            for (Booking booking : lesson.getBookingList()) {
//                if (booking.getRating() > 0) {
//                    totalRating += booking.getRating();
//                    ratedBookings++;
//                }
//            }
//            if (ratedBookings > 0) {
//                double avgRating = (double) totalRating / ratedBookings;
//                System.out.println("Average Rating: " + avgRating);
//            } else {
//                System.out.println("Average Rating: N/A");
//            }
//        }
//    }

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
