package com.example.wfc;

import java.util.Scanner;

public class MainMenu {
    private Customer customer1, customer2,customer3,customer4,customer5;
    private Lesson[] lessons;
    Scanner scanner = new Scanner(System.in);
    BookingSystem bookingSystem = new BookingSystem();


    public MainMenu(Customer customer1, Customer customer2, Customer customer3, Customer customer4, Customer customer5, Lesson[] lessons) {

        this.customer1 = customer1;
        this.customer2 = customer2;
        this.customer3 = customer3;
        this.customer4 = customer4;
        this.customer5 = customer5;
        this.lessons = lessons;
    }


    public void viewMenuByDay(){
        System.out.print("Enter day (Saturday/Sunday): ");
        String daySelected = scanner.nextLine().trim();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Day", "Lesson", "Weekend", "Spot Left", "Max. Capacity");
        for (Lesson lesson : lessons) {
            lesson.viewLessonByDay(daySelected);
        }
    }

    public void viewMenuByFitnessType(){
        System.out.println("Select the available Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing)");
        String fitnessTypeSelected = scanner.nextLine().trim();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Lesson", "Day", "Weekend", "Spot Left", "Max. Capacity");
        for (Lesson lesson : lessons) {
            lesson.viewLessonByFitnessType(fitnessTypeSelected);
        }
    }

    public void bookLessonMainMenu(){
        System.out.print("Enter customer full name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter lesson name: ");
                    String lessonName = scanner.nextLine().trim();
                    System.out.print("Enter the day (Saturday/Sunday): ");
                    String lessonDay = scanner.nextLine().trim();
                    System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
                    String lessonWeekend = scanner.nextLine().trim();

                    // validate if customer and lesson are part of database
                    Customer isCustomer = null;
                    for (Customer c : new Customer[]{customer1, customer2, customer3, customer4, customer5}) {
                        if (c.getName().equalsIgnoreCase(customerName)) {
                            isCustomer = c;
                            break;
                        }
                    }

                    Lesson isLesson = null;
                    for (Lesson l : lessons) {
                        if (l.getFitnessType().equalsIgnoreCase(lessonName) && l.getDay().equalsIgnoreCase(lessonDay)
                                && l.getWeekend().equalsIgnoreCase(lessonWeekend)) {
                            isLesson = l;
                            break;
                        }
                    }

                    // book lesson if customer and lesson are valid
                    if (isCustomer != null && isLesson != null) {
                        bookingSystem.bookLesson(isCustomer, isLesson);
                    } else {
                        System.out.println("Invalid customer or lesson.");
                    }
    }

    public void cancelLessonMainMenu(){
        System.out.print("Enter customer full name: ");
                    String customerNameToCancel = scanner.nextLine();
                    System.out.print("Enter lesson name: ");
                    String lessonNameToCancel = scanner.nextLine().trim();
                    System.out.print("Enter the day (Saturday/Sunday): ");
                    String lessonDayToCancel = scanner.nextLine().trim();
                    System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
                    String lessonWeekendToCancel = scanner.nextLine().trim();
                    Lesson isLessonToCancel = null;
                    for (Lesson l : lessons) {
                        if (l.getFitnessType().equalsIgnoreCase(lessonNameToCancel) && l.getDay().equalsIgnoreCase(lessonDayToCancel)
                                && l.getWeekend().equalsIgnoreCase(lessonWeekendToCancel)) {
                            isLessonToCancel = l;
                            break;
                        }
                    }
                    if (isLessonToCancel != null) {
                        int index = bookingSystem.getBookingIndex(customerNameToCancel, lessonNameToCancel,lessonDayToCancel, lessonWeekendToCancel );
                        if (index != -1) {
                            Booking unwantedBooking = bookingSystem.getBookings().get(index);
                            bookingSystem.cancelBooking(unwantedBooking);
                        } else {
                            System.out.println("Booking not found.");
                        }
                    } else {
                        System.out.println("Invalid customer or lesson.");
                    }
    }


    public void changeLessonMainMenu() {
        System.out.print("Enter customer full name: ");
                    String customerNameToChange = scanner.nextLine();
                    System.out.print("Enter lesson name: ");
                    String lessonNameToChange = scanner.nextLine().trim();
                    System.out.print("Enter the day (Saturday/Sunday): ");
                    String lessonDayToChange = scanner.nextLine().trim();
                    System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
                    String lessonWeekendToChange = scanner.nextLine().trim();
                    Lesson isLessonToChange = null;
                    for (Lesson l : lessons) {
                        if (l.getFitnessType().equalsIgnoreCase(lessonNameToChange) && l.getDay().equalsIgnoreCase(lessonDayToChange)
                                && l.getWeekend().equalsIgnoreCase(lessonWeekendToChange)) {
                            isLessonToChange = l;
                            break;
                        }
                    }
//                        ************************************************************************
//                        ************************************************************************
//                        ************************************************************************
//                        ************************************************************************
//                    Booking new Lesson
                    System.out.print("Enter new lesson name: ");
                    String newLessonName = scanner.nextLine().trim();
                    System.out.print("Enter the new day (Saturday/Sunday): ");
                    String newLessonDay = scanner.nextLine().trim();
                    System.out.print("Enter the new weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
                    String newLessonWeekend = scanner.nextLine().trim();


                    Lesson newBookingLesson = null;
                    for (Lesson l : lessons) {
                        if (l.getFitnessType().equalsIgnoreCase(newLessonName) && l.getDay().equalsIgnoreCase(newLessonDay)
                                && l.getWeekend().equalsIgnoreCase(newLessonWeekend)) {
                            newBookingLesson = l;
                            break;
                        }
                    }


//                        ************************************************************************
//                        ************************************************************************
//                        ************************************************************************
//                        ************************************************************************
                    if (isLessonToChange != null && newBookingLesson != null) {
                        int index = bookingSystem.getBookingIndex(customerNameToChange, lessonNameToChange,lessonDayToChange, lessonWeekendToChange );
                        if (index != -1) {
                            Booking oldBooking = bookingSystem.getBookings().get(index);
                            bookingSystem.changeBooking(oldBooking, newBookingLesson);
                        } else {
                            System.out.println("Booking not found.");
                        }
                    } else {
                        System.out.println("Invalid customer or lesson.");
                    }
    }


    public void  rateLessonMainMenu() {
        System.out.print("Enter customer full name: ");
                    String customerNameToRate = scanner.nextLine();
                    System.out.print("Enter lesson name you want to rate: ");
                    String lessonNameToRate = scanner.nextLine().trim();
                    System.out.print("Enter which day (Saturday/Sunday): ");
                    String lessonDayToRate = scanner.nextLine().trim();
                    System.out.print("Enter which weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
                    String lessonWeekendToRate = scanner.nextLine().trim();
                    System.out.print("Enter rating on a scale of 1 to 5: ");
                    int ratingByCustomer = scanner.nextInt();
                    scanner.nextLine();
                    Lesson isLessonToRate = null;
                    for (Lesson l : lessons) {
                        if (l.getFitnessType().equalsIgnoreCase(lessonNameToRate) && l.getDay().equalsIgnoreCase(lessonDayToRate)
                                && l.getWeekend().equalsIgnoreCase(lessonWeekendToRate)) {
                            isLessonToRate = l;
                            break;
                        }
                    }
                    if (isLessonToRate != null) {
                        int index = bookingSystem.getBookingIndex(customerNameToRate, lessonNameToRate,lessonDayToRate, lessonWeekendToRate );
                        if (index != -1) {
                            Booking bookingToRate = bookingSystem.getBookings().get(index);
                            bookingSystem.rateLesson(bookingToRate, ratingByCustomer);
                        } else {
                            System.out.println("Booking not found.");
                        }
                    } else {
                        System.out.println("Invalid customer or lesson.");
                    }

    }


    public void  viewReportMainMenu() {
        bookingSystem.printFinalReport();
    }


    public void viewBookingDBArray(){
        bookingSystem.viewBookingDb();
    }




}
