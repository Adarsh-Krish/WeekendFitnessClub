package com.example.wfc;

import java.util.ArrayList;

public class Lesson {
    private String fitnessType;
    private String day;
    private String weekend;
    private int maxCapacity;

    public Lesson(String name, String day, String weekend, int maxCapacity) {
        this.fitnessType = name;
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
}
