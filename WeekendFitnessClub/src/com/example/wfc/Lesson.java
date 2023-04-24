package com.example.wfc;

import java.util.ArrayList;

public class Lesson {
    private String fitnessType;
    private String day;
    private String weekend;
    private int maxCapacity;

    private int availableCapacity;

    private ArrayList<Booking> bookingList;

    public Lesson(String fitnessType, String day, String weekend, int maxCapacity) {
        this.fitnessType = fitnessType;
        this.day = day;
        this.weekend = weekend;
        this.maxCapacity = maxCapacity;
        this.availableCapacity = maxCapacity;
        this.bookingList = new ArrayList<>();
    }

    public String getFitnessType() {
        return fitnessType;
    }

    public String getDay() {
        return day;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public String getWeekend(){
        return weekend;
    }

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }

    public boolean isBookingFull() {
        return bookingList.size() >= maxCapacity;
    }

    public void addBookingList(Booking booking){        bookingList.add(booking);
    }

    public void removeBookingList(Booking booking){
        bookingList.remove(booking);
    }

//    public void increaseAvailableCapacity(){
//        if (availableCapacity<maxCapacity){
//            this.availableCapacity = availableCapacity+1;
//        } else {
//            System.out.println("Maximum Capacity is empty");
//        }
//    }
//
//    public void reduceAvailableCapacity(){
//        if (availableCapacity>0){
//            this.availableCapacity = availableCapacity-1;
//        } else {
//            System.out.println("Maximum Capacity is empty");
//        }
//    }



    public void viewLessonByDay(String selectedDay){

        if (selectedDay.equalsIgnoreCase(getDay())){
            System.out.printf("%-10s %-10s %-10s %-10d %-10d \n", day, fitnessType, weekend, availableCapacity, maxCapacity);
        }
    }

    public void viewLessonByFitnessType(String selectedFitnessType){
        if (selectedFitnessType.equalsIgnoreCase(getFitnessType())){
            System.out.printf("%-10s %-10s %-10s %-10d %-10d \n", fitnessType, day, weekend, availableCapacity, maxCapacity);
        }
    }


}
