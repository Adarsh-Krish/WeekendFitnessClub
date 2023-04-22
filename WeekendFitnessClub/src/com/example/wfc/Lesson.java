package com.example.wfc;

import java.util.ArrayList;

public class Lesson {
    private String fitnessType;
    private String day;
    private String weekend;
    private int maxCapacity;

    private int availableCapacity;

    public Lesson(String fitnessType, String day, String weekend, int maxCapacity) {
        this.fitnessType = fitnessType;
        this.day = day;
        this.weekend = weekend;
        this.maxCapacity = maxCapacity;
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

    public String getWeekend(){
        return weekend;
    }

    public void reduceMaxCapacity(){
        if (maxCapacity>0){
            this.availableCapacity = maxCapacity-1;
        } else {
            System.out.println("Maximum Capacity is empty");
        }
    }

    public void increaseMaxCapacity(){
        if (maxCapacity<5){
            this.availableCapacity = maxCapacity+1;
        } else {
            System.out.println("Maximum Capacity is Full");
        }
    }

    public void viewLessonByDay(String selectedDay){
        if (selectedDay.equalsIgnoreCase(getDay())){
            System.out.printf("%-10s %-10s %-10s %-10d %-10d \n", day, fitnessType, weekend, maxCapacity, availableCapacity);
        }
    }

    public void viewLessonByFitnessType(String selectedFitnessType){
        if (selectedFitnessType.equalsIgnoreCase(getFitnessType())){
            System.out.printf("%-10s %-10s %-10s %-10d %-10d \n", fitnessType, day, weekend, maxCapacity, availableCapacity);
        }
    }

}
