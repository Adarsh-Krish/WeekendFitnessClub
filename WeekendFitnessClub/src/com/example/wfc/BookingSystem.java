package com.example.wfc;

import java.awt.print.Book;
import java.util.*;

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

    public void bookLesson(Customer customer, Lesson lesson) {
        if (lesson.isBookingFull()) {
            System.out.println("Sorry. This " + lesson.getFitnessType() + " is full");
        } else {
            Booking booking = new Booking(customer, lesson);
            if (lesson.getAvailableCapacity() == 0) {
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

    public void changeBooking(Booking booking, Lesson newlesson) {
        if (newlesson.isBookingFull()) {
            System.out.println("Sorry, this lesson is already full.");
        } else if (booking.isAttended()) {
            System.out.println("Sorry, you cannot change an already attended lesson.");
        } else {
            Lesson oldLesson = booking.getLesson();
            oldLesson.removeBookingList(booking);
            booking.setLesson(newlesson);
            newlesson.addBookingList(booking);
            System.out.println("Booking changed for " + booking.getCustomer().getName() + " from " + oldLesson.getDay() + " for " + oldLesson.getFitnessType() + " to " + newlesson.getDay() + " for " + newlesson.getFitnessType() + ".");
        }
    }


    public void rateLesson(Booking booking, int rating) {


        if (!booking.isAttended()) {
            System.out.println("You cannot rate a lesson that you have not attended.");
        } else {
            booking.setRating(rating);
            System.out.println("Thank you for your response on the lesson " + booking.getLesson().getFitnessType());
        }
    }

    public void printMonthlyLessonReport(int monthNumber) {
        int totalCustomersYoga = 0, totalCustomersSpin = 0, totalCustomersPilates = 0, totalCustomersBoxing = 0, totalCustomersCrossfit = 0;

        double totalRatingYoga = 0, totalRatingSpin = 0, totalRatingPilates = 0, totalRatingBoxing = 0, totalRatingCrossfit = 0;
        double numOfLessonsYoga = 0, numOfLessonsSpin = 0, numOfLessonsPilates = 0, numOfLessonsBoxing = 0, numOfLessonsCrossfit = 0;
        System.out.println("Monthly Lesson Report for Month " + monthNumber);
        System.out.println("-------------------------------------");
        for (int i = 0; i < bookingsDbArray.size(); i++) {
            Booking booking = bookingsDbArray.get(i);
            if (booking.getLesson().getFitnessType().equalsIgnoreCase("Yoga")) {
                totalCustomersYoga++;
                totalRatingYoga += booking.getRating();
                numOfLessonsYoga++;
            } else if (booking.getLesson().getFitnessType().equalsIgnoreCase("Spin")) {
                totalCustomersSpin++;
                totalRatingSpin += booking.getRating();
                numOfLessonsSpin++;
            } else if (booking.getLesson().getFitnessType().equalsIgnoreCase("Pilates")) {
                totalCustomersPilates++;
                totalRatingPilates += booking.getRating();
                numOfLessonsPilates++;
            } else if (booking.getLesson().getFitnessType().equalsIgnoreCase("Boxing")) {
                totalCustomersBoxing++;
                totalRatingBoxing += booking.getRating();
                numOfLessonsBoxing++;
            } else if (booking.getLesson().getFitnessType().equalsIgnoreCase("Crossfit")) {
                totalCustomersCrossfit++;
                totalRatingCrossfit += booking.getRating();
                numOfLessonsCrossfit++;
            }

        }

        System.out.println("Number of customers Yoga: " + totalCustomersYoga);
        System.out.printf("Average rating Yoga: %.2f\n", (double) totalRatingYoga / numOfLessonsYoga);
        System.out.println("Number of customers Spin: " + totalCustomersSpin);
        System.out.printf("Average rating Spin: %.2f\n", (double) totalRatingSpin / numOfLessonsSpin);
        System.out.println("Number of customers Pilates: " + totalCustomersPilates);
        System.out.printf("Average rating Pilates: %.2f\n", (double) totalRatingPilates / numOfLessonsPilates);
        System.out.println("Number of customers Boxing: " + totalCustomersBoxing);
        System.out.printf("Average rating Boxing: %.2f\n", (double) totalRatingBoxing / numOfLessonsBoxing);
        System.out.println("Number of customers Crossfit: " + totalCustomersCrossfit);
        System.out.printf("Average rating Crossfit: %.2f\n", (double) totalRatingCrossfit / numOfLessonsCrossfit);
    }

    public void printChampionReport(int monthNumber) {


        HashMap<String, Integer> map = new HashMap<>();
        for (Booking booking : bookingsDbArray){
//            if (booking.getLesson().getMonth() == monthNumber){
                String fitnessType = booking.getLesson().getFitnessType();
                if (map.containsKey(fitnessType)){
                    int income = map.get(fitnessType);
                    income += booking.getLesson().getPrice();
                    map.put(fitnessType, income);
                } else {
                    map.put(fitnessType, booking.getLesson().getPrice());
                }
//            }
        }
        int maxIncome = 0;
        String championFitnessType = "";
        for (String key : map.keySet()){
            if (map.get(key) > maxIncome){
                maxIncome = map.get(key);
                championFitnessType = key;
            }
        }
        System.out.println("Champion is "+championFitnessType);

    }

}

