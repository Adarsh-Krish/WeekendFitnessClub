package com.example.wfc;

import java.util.Scanner;

public class MainMenu {
    private Customer customer1, customer2,customer3,customer4,customer5;
    private Lesson[] lessons;
    Scanner scanner = new Scanner(System.in);
    BookingSystem bookingSystem = new BookingSystem();

    String commonUserName;

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
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Day", "Lesson", "Weekend", "Spot Left", "Price");
        for (Lesson lesson : lessons) {
            lesson.viewLessonByDay(daySelected);
        }
    }

    public void viewMenuByFitnessType(){
        System.out.println("Select the available Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing)");
        String fitnessTypeSelected = scanner.nextLine().trim();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Lesson", "Day", "Weekend", "Spot Left", "Price");
        for (Lesson lesson : lessons) {
            lesson.viewLessonByFitnessType(fitnessTypeSelected);
        }
    }

    public void bookLessonMainMenu(){
//        System.out.print("Enter customer full name: ");
//                    String customerName = scanner.nextLine();
        System.out.print("\nEnter Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String lessonName = scanner.nextLine().trim();
        System.out.print("Enter the day (Saturday/Sunday) ");
        String lessonDay = scanner.nextLine().trim();
        System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
        String lessonWeekend = scanner.nextLine().trim();

        // validate if customer and lesson are part of database
        Customer isCustomer = null;
        for (Customer c : new Customer[]{customer1, customer2, customer3, customer4, customer5}) {
            if (c.getName().equalsIgnoreCase(commonUserName)) {
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

    public void cancelLessonMainMenu() {
        System.out.print("\nEnter Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String lessonNameToCancel = scanner.nextLine().trim();
        System.out.print("Enter the day (Saturday/Sunday) ");
        String lessonDayToCancel = scanner.nextLine().trim();
        System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4) ");
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
            int index = bookingSystem.getBookingIndex(commonUserName, lessonNameToCancel, lessonDayToCancel, lessonWeekendToCancel);
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
        System.out.print("\nEnter Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String lessonNameToChange = scanner.nextLine().trim();
        System.out.print("Enter the day (Saturday/Sunday) ");
        String lessonDayToChange = scanner.nextLine().trim();
        System.out.print("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4) ");
        String lessonWeekendToChange = scanner.nextLine().trim();
        Lesson isLessonToChange = null;
        for (Lesson l : lessons) {
            if (l.getFitnessType().equalsIgnoreCase(lessonNameToChange) && l.getDay().equalsIgnoreCase(lessonDayToChange)
                    && l.getWeekend().equalsIgnoreCase(lessonWeekendToChange)) {
                isLessonToChange = l;
                break;
            }
        }

//                    Booking new Lesson
        System.out.print("\nEnter new Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String newLessonName = scanner.nextLine().trim();
        System.out.print("Enter the new day (Saturday/Sunday) ");
        String newLessonDay = scanner.nextLine().trim();
        System.out.print("Enter the new weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4) ");
        String newLessonWeekend = scanner.nextLine().trim();


        Lesson newBookingLesson = null;
        for (Lesson l : lessons) {
            if (l.getFitnessType().equalsIgnoreCase(newLessonName) && l.getDay().equalsIgnoreCase(newLessonDay)
                    && l.getWeekend().equalsIgnoreCase(newLessonWeekend)) {
                newBookingLesson = l;
                break;
            }
        }
        if (isLessonToChange != null && newBookingLesson != null) {
            int index = bookingSystem.getBookingIndex(commonUserName, lessonNameToChange, lessonDayToChange, lessonWeekendToChange);
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
        System.out.print("\nEnter Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String lessonNameToRate = scanner.nextLine().trim();
        System.out.print("Enter which day (Saturday/Sunday) ");
        String lessonDayToRate = scanner.nextLine().trim();
        System.out.print("Enter which weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4) ");
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
            int index = bookingSystem.getBookingIndex(commonUserName, lessonNameToRate, lessonDayToRate, lessonWeekendToRate);
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

    public void attendLesson(){
        System.out.print("\nEnter Fitness Types you want to attend (Yoga/Spin/Pilates/Crossfit/Boxing) ");
        String lessonNameToAttend = scanner.nextLine().trim();
        System.out.print("Enter which day (Saturday/Sunday): ");
        String lessonDayToAttend = scanner.nextLine().trim();
        System.out.print("Enter which weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4): ");
        String lessonWeekendToAttend = scanner.nextLine().trim();

        Lesson isLessonToAttend = null;
        for (Lesson l : lessons) {
            if (l.getFitnessType().equalsIgnoreCase(lessonNameToAttend) && l.getDay().equalsIgnoreCase(lessonDayToAttend)
                    && l.getWeekend().equalsIgnoreCase(lessonWeekendToAttend)) {
                isLessonToAttend = l;
                break;
            }
        }
        if (isLessonToAttend != null) {
            int index = bookingSystem.getBookingIndex(commonUserName, lessonNameToAttend,lessonDayToAttend, lessonWeekendToAttend );
            if (index != -1) {
                bookingSystem.getBookings().get(index).setAttended(true);
                System.out.println("You have successfully completed this lesson");
            } else {
                System.out.println("Booking not found.");
            }
        } else {
            System.out.println("Invalid customer or lesson.");
        }
    }



    public void  viewMonthlyReportMainMenu() {
        bookingSystem.printMonthlyLessonReport(1);
    }

    public void  viewChampionReportMainMenu() {
        bookingSystem.printChampionReport(1);
    }






    public void bookLessonWFC(){
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions for Booking");

            System.out.println("Please select any option:");
            System.out.println("1. View lessons by day");
            System.out.println("2. View lessons by fitness type");
            System.out.println("3. Book a lesson");
            System.out.println("4. Go to main menu");
            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    viewMenuByDay();
                    break;

                case 2:
                    viewMenuByFitnessType();
                    break;

                case 3:
                    bookLessonMainMenu();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }


        }
    }

    public void updateBookingWFC(){
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions to Update Booking");

            System.out.println("Please select any option:");
            System.out.println("1. Change booking");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Go to main menu");
            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    changeLessonMainMenu();
                    break;

                case 2:
                    cancelLessonMainMenu();
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    break;
            }


        }
    }





    public void attendLessonWFC(){
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions to Attend Lesson");

            System.out.println("Please select any option:");
            System.out.println("1. Attend");
            System.out.println("2. Rate a Lesson");
            System.out.println("3. Go to main menu\n");
            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    attendLesson();
                    break;

                case 2:
                    rateLessonMainMenu();
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    break;
            }


        }
    }


    public void displayReportWFC(){
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions to View Report");

            System.out.println("Please select any option:");
            System.out.println("1. View Monthly Report");
            System.out.println("2. View Champion of the month");
            System.out.println("3. Go to main menu\n");
            int customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    viewMonthlyReportMainMenu();
                    break;

                case 2:
                    viewChampionReportMainMenu();
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                    break;
            }


        }
    }


    public void mainMenuWFC() {

        System.out.println("Please enter you full name");
        String userName = scanner.nextLine();
        Customer isCustomerInDb = null;
        for (Customer c : new Customer[]{customer1, customer2, customer3, customer4, customer5}) {
            if (c.getName().equalsIgnoreCase(userName)) {
                isCustomerInDb = c;
                break;
            }
        }
        if (isCustomerInDb != null) {
            commonUserName = userName;

            System.out.println("Hii " + commonUserName.toUpperCase() + "! Welcome to Weekend Fitness Club.\n");

            boolean exit = false;

            while (!exit) {
                System.out.println("Please select any option:");
                System.out.println("1. Booking a lesson");
                System.out.println("2. Update your booking");
                System.out.println("3. Attend a lesson");
                System.out.println("4. Display report");
                System.out.println("5. Exit WFC\n");
                int customerChoice = scanner.nextInt();
                scanner.nextLine();


                switch (customerChoice) {
                    case 1:
                        bookLessonWFC();
                        break;

                    case 2:
                        // View lessons by fitness type
                        updateBookingWFC();
                        break;

                    case 3:
                        // Book a Lesson
                        attendLessonWFC();
                        break;

                    case 4:
                        // Cancel Booking
                        displayReportWFC();
                        break;

                    case 5:
                        System.out.println("Bye. See you later.");
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 8.");
                        break;
                }

                System.out.print("Continue Main Menu (y/n)?: ");
                String continueChoice = scanner.nextLine().trim();
                if (!continueChoice.equalsIgnoreCase("y")) {
                    exit = true;
                }
            }
        } else {
            System.out.println("Sorry " + userName + " is not registered to our system.");
        }

    }

}
