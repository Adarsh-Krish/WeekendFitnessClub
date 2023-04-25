package com.example.wfc;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Smith", "john@gmail.com");
        Customer customer2 = new Customer("Sarah Johnson", "sarah@gmail.com");
        Customer customer3 = new Customer("Mark Davis", "mark@gmail.com");
        Customer customer4 = new Customer("Emily Brown", "emily@gmail.com");
        Customer customer5 = new Customer("David Lee", "david@gmail.com");

        Lesson[] lessons = new Lesson[32];

        lessons[0] = new Lesson("Yoga", "Saturday", "Weekend 1", 5);
        lessons[1] = new Lesson("Pilates", "Saturday", "Weekend 1", 6);
        lessons[2] = new Lesson("Boxing", "Saturday", "Weekend 1", 5);
        lessons[3] = new Lesson("CrossFit", "Saturday", "Weekend 1", 7);
        lessons[4] = new Lesson("Spin", "Sunday", "Weekend 1", 5);
        lessons[5] = new Lesson("Boxing", "Sunday", "Weekend 1", 5);
        lessons[6] = new Lesson("Yoga", "Sunday", "Weekend 1", 5);
        lessons[7] = new Lesson("Crossfit", "Sunday", "Weekend 1", 7);
        lessons[8] = new Lesson("Yoga", "Saturday", "Weekend 2", 5);
        lessons[9] = new Lesson("Pilates", "Saturday", "Weekend 2", 6);
        lessons[10] = new Lesson("Boxing", "Saturday", "Weekend 2", 5);
        lessons[11] = new Lesson("CrossFit", "Saturday", "Weekend 2", 7);
        lessons[12] = new Lesson("Spin", "Sunday", "Weekend 2", 5);
        lessons[13] = new Lesson("Boxing", "Sunday", "Weekend 2", 5);
        lessons[14] = new Lesson("Yoga", "Sunday", "Weekend 2", 5);
        lessons[15] = new Lesson("Crossfit", "Sunday", "Weekend 2", 7);
        lessons[16] = new Lesson("Yoga", "Saturday", "Weekend 3", 5);
        lessons[17] = new Lesson("Pilates", "Saturday", "Weekend 3", 6);
        lessons[18] = new Lesson("Boxing", "Saturday", "Weekend 3", 5);
        lessons[19] = new Lesson("CrossFit", "Saturday", "Weekend 3", 7);
        lessons[20] = new Lesson("Spin", "Sunday", "Weekend 3", 5);
        lessons[21] = new Lesson("Boxing", "Sunday", "Weekend 3", 5);
        lessons[22] = new Lesson("Yoga", "Sunday", "Weekend 3", 5);
        lessons[23] = new Lesson("Crossfit", "Sunday", "Weekend 3", 7);
        lessons[24] = new Lesson("Yoga", "Saturday", "Weekend 4", 5);
        lessons[25] = new Lesson("Pilates", "Saturday", "Weekend 4", 6);
        lessons[26] = new Lesson("Boxing", "Saturday", "Weekend 4", 5);
        lessons[27] = new Lesson("CrossFit", "Saturday", "Weekend 4", 7);
        lessons[28] = new Lesson("Spin", "Sunday", "Weekend 4", 5);
        lessons[29] = new Lesson("Yoga", "Saturday", "Weekend 4", 5);
        lessons[30] = new Lesson("Pilates", "Saturday", "Weekend 4", 6);
        lessons[31] = new Lesson("Boxing", "Saturday", "Weekend 4", 5);


        MainMenu mainMenu = new MainMenu(customer1, customer2, customer3, customer4, customer5, lessons);

        mainMenu.mainMenuWFC();



    }
}


























//   System.out.println("Please select any option:");
//        System.out.println("1. View lessons by day");
//        System.out.println("2. View lessons by fitness type");
//        System.out.println("3. Write a Review");
//        System.out.println("4. View Report");
//        int customerChoice = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println(customerChoice);
////        if (customerChoice==1){
////            System.out.print("Enter day (Saturday/Sunday): ");
////                String daySelected = scanner.nextLine().trim();
////                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Day", "Lesson", "Weekend",  "Spot Left", "Max. Capacity");
////                for (Lesson lesson : lessons){
////                    lesson.viewLessonByDay(daySelected);
////                }
////
////        } else if (customerChoice==2) {
////            System.out.println("Select the available Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing)");
////                String fitnessTypeSelected = scanner.nextLine().trim();
////                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Lesson", "Day", "Weekend",  "Spot Left", "Max. Capacity");
////                for (Lesson lesson : lessons){
////                    lesson.viewLessonByFitnessType(fitnessTypeSelected);
////                }
////        }
//
//        switch (customerChoice){
//            case 1:
//                System.out.print("Enter day (Saturday/Sunday): ");
//                String daySelected = scanner.nextLine().trim();
//                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Day", "Lesson", "Weekend",  "Spot Left", "Max. Capacity");
//                for (Lesson lesson : lessons){
//                    lesson.viewLessonByDay(daySelected);
//                }
//            case 2:
//                System.out.println("Select the available Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing)");
//                String fitnessTypeSelected = scanner.nextLine().trim();
//                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Lesson", "Day", "Weekend",  "Spot Left", "Max. Capacity");
//                for (Lesson lesson : lessons){
//                    lesson.viewLessonByFitnessType(fitnessTypeSelected);
//                }
//
//
//            case 3:
//                System.out.println("case 3");
//                break;
//        }
//
//
//    }
//}






//        switch (customerChoice){
//            case 1:
//                System.out.print("Enter day (Saturday/Sunday): ");
//                String daySelected = scanner.nextLine().trim();
//                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Day", "Lesson", "Weekend",  "Spot Left", "Max. Capacity");
//                for (Lesson lesson : lessons){
//                    lesson.viewLessonByDay(daySelected);
//                }
//
//            case 2:
//                System.out.println("Select the available Fitness Types (Yoga/Spin/Pilates/Crossfit/Boxing)");
//                String fitnessTypeSelected = scanner.nextLine().trim();
//                System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Lesson", "Day", "Weekend",  "Spot Left", "Max. Capacity");
//                for (Lesson lesson : lessons){
//                    lesson.viewLessonByFitnessType(fitnessTypeSelected);
//                }
//                return;
//
//
//            case 3:
//                System.out.println("case 3");
//                return;
//        }

//        bookingSystem.bookLesson(customer1, lessons[2]);
//        bookingSystem.bookLesson(customer3, lessons[20]);
//        bookingSystem.bookLesson(customer4, lessons[3]);
//        bookingSystem.bookLesson(customer2, lessons[3]);
//        bookingSystem.bookLesson(customer1, lessons[3]);

//        To cancel a booking
//        Booking unwantedBooking = bookingSystem.getBookings().get(1);
//        bookingSystem.cancelBooking(unwantedBooking);

//        To change a booking
//        Booking wrongBooking = bookingSystem.getBookings().get(1);
//        bookingSystem.changeBooking(wrongBooking, lessons[30]);

//        To rate
//        Booking rateBooking = bookingSystem.getBookings().get(0);
//        rateBooking.setAttended(true);
//        bookingSystem.rateLesson(rateBooking, 4);
//        bookingSystem.rateLesson(rateBooking, 3);
//
//        bookingSystem.printFinalReport();


//        for (Lesson lesson : lessons){
//                    if(lesson.getFitnessType()==choiceType && lesson.getDay()==choiceDay
//                            && lesson.getWeekend()==choiceWeekedn;){
//                bookingSystem.bookLesson(customer1, lesson);
//            }
//                }



//    }



//    private static void bookingMenu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n\n Select the following:");
//        System.out.println("1. Book a session");
//        System.out.println("2. Go back");
//        int choiceSelected = scanner.nextInt();
//
//
//        if (choiceSelected == 1) {
//            System.out.println("Enter your Name:");
//            String customerNameForBooking = scanner.nextLine();
//            scanner.nextLine();
//            System.out.println("Enter the Day (Saturday/Sunday)");
//            String dayForBooking = scanner.nextLine();
//            System.out.println("Enter the weekend (Weekend 1/Weekend 2/Weekend 3/Weekend 4)");
//            String weekendForBooking = scanner.nextLine();
//            System.out.println("Enter the Lesson Type (Yoga/Spin/Pilates/Crossfit/Boxing)");
//            String lessonTypeForBooking = scanner.nextLine();
//
//        } else if (choiceSelected == 2) {
//            mainMenu();
//        } else {
//            System.out.println("Invalid choice! Please start from the beginning");
//            mainMenu();
//        }
//    }
//}
