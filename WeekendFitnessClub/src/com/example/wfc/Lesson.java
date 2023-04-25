package com.example.wfc;

import java.util.ArrayList;

public class Lesson {
    private String fitnessType;
    private String day;
    private String weekend;
    private int maxCapacity = 5;

    private int availableCapacity;
    private int price;

    private ArrayList<Booking> bookingList;

    public Lesson(String fitnessType, String day, String weekend, int price) {
        this.fitnessType = fitnessType;
        this.day = day;
        this.weekend = weekend;
        this.price = price;
        this.availableCapacity = price;
        this.bookingList = new ArrayList<>();
    }

    public String getFitnessType() {
        return fitnessType;
    }

    public String getDay() {
        return day;
    }

    public int getPrice() {
        return price;
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

    public void getTheThingsForReport(){
        String customerNumber;
        if (bookingList.contains(getFitnessType()) && bookingList.equals("Yoga")){

        }

    }

    public boolean isBookingFull() {
        return bookingList.size() >= price;
    }

    public void addBookingList(Booking booking){
        bookingList.add(booking);
        availableCapacity--;
    }

    public void removeBookingList(Booking booking){
        bookingList.remove(booking);
        availableCapacity++;

    }

//    public void increaseAvailableCapacity(){
//        if (availableCapacity<price){
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
            System.out.printf("%-10s %-10s %-10s %-10d $%-10d \n", day, fitnessType, weekend, availableCapacity, price);
        }
    }

    public void viewLessonByFitnessType(String selectedFitnessType){
        if (selectedFitnessType.equalsIgnoreCase(getFitnessType())){
            System.out.printf("%-10s %-10s %-10s %-10d $%-10d \n", fitnessType, day, weekend, availableCapacity, price);
        }
    }

//    public int getMonth(int monthNumber) {
//        if (monthNumber == 1){
//            return
//        }
//    }


//    public int getCustomerNumberFromDayAndName(String dayToFind, String nameToFind){
//
//        if (fitnessType.equalsIgnoreCase(nameToFind) && day.equalsIgnoreCase(dayToFind)) {
//                return 1;
//            } else {
//            return 0;
//
//        }
////        else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Spin")) {
////                customerInSpin++;
////            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Pilates")) {
////                customerInPilates++;
////            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Crossfit")) {
////                customerInCrossfit++;
////            } else if (bookingsDbArray.get(i).getLesson().getFitnessType().equalsIgnoreCase("Boxing")) {
////                customerInBoxing++;
////            }
//    }

}
