import com.example.wfc.Customer;
import com.example.wfc.Lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Weekend Fitness Club!");

        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer("John Smith", "john@gmail.com");
        Customer customer2 = new Customer("Sarah Johnson", "sarah@gmail.com");
        Customer customer3 = new Customer("Mark Davis", "mark@gmail.com");
        Customer customer4 = new Customer("Emily Brown", "emily@gmail.com");
        Customer customer5 = new Customer("David Lee", "david@gmail.com");

//        customer1.viewCustomer();
//        customer2.viewCustomer();
//        customer3.viewCustomer();
//        customer4.viewCustomer();
//        customer5.viewCustomer();

//        Lesson yogaSaturday1 = new Lesson("Yoga", "Saturday", "Weekend 1", 5);
//        Lesson spinSaturday1 = new Lesson("Spin", "Saturday", "Weekend 1", 5);
//        Lesson zumbaSaturday1 = new Lesson("Zumba", "Saturday", "Weekend 1", 5);
//        Lesson kickboxingSaturday1 = new Lesson("Kickboxing", "Saturday", "Weekend 1", 5);
//
//        Lesson yogaSunday1 = new Lesson("Yoga", "Sunday", "Weekend 1", 5);
//        Lesson spinSunday1 = new Lesson("Spin", "Sunday", "Weekend 1", 5);
//        Lesson zumbaSunday1 = new Lesson("Zumba", "Sunday", "Weekend 1", 5);
//        Lesson kickboxingSunday1 = new Lesson("Kickboxing", "Sunday", "Weekend 1", 5);
//
//        Lesson yogaSaturday2 = new Lesson("Yoga", "Saturday", "Weekend 2", 5);
//        Lesson spinSaturday2 = new Lesson("Spin", "Saturday", "Weekend 2", 5);
//        Lesson pilatesSaturday2 = new Lesson("Pilates", "Saturday", "Weekend 2", 5);
//        Lesson boxingSaturday2 = new Lesson("Boxing", "Saturday", "Weekend 2", 5);
//
//        Lesson yogaSunday2 = new Lesson("Yoga", "Sunday", "Weekend 2", 5);
//        Lesson spinSunday2 = new Lesson("Spin", "Sunday", "Weekend 2", 5);
//        Lesson pilatesSunday2 = new Lesson("Pilates", "Sunday", "Weekend 2", 5);
//        Lesson boxingSunday2 = new Lesson("Boxing", "Sunday", "Weekend 2", 5);
//
//        Lesson yogaSaturday3 = new Lesson("Yoga", "Saturday", "Weekend 3", 5);
//        Lesson spinSaturday3 = new Lesson("Spin", "Saturday", "Weekend 3", 5);
//        Lesson danceSaturday3 = new Lesson("Dance", "Saturday", "Weekend 3", 5);
//        Lesson strengthSaturday3 = new Lesson("Strength Training", "Saturday", "Weekend 3", 5);
//
//        Lesson yogaSunday3 = new Lesson("Yoga", "Sunday", "Weekend 3", 5);
//        Lesson spinSunday3 = new Lesson("Spin", "Sunday", "Weekend 3", 5);
//        Lesson danceSunday3 = new Lesson("Dance", "Sunday", "Weekend 3", 5);
//        Lesson strengthSunday3 = new Lesson("Strength Training", "Sunday", "Weekend 3", 5);
//
//        Lesson yogaSaturday4 = new Lesson("Yoga", "Saturday", "Weekend 4", 5);
//        Lesson spinSaturday4 = new Lesson("Spin", "Saturday", "Weekend 4", 5);
//        Lesson barreSaturday4 = new Lesson("Barre", "Saturday", "Weekend 4", 5);
//        Lesson cardioSaturday4 = new Lesson("Cardio", "Saturday", "Weekend 4", 5);
//
//        Lesson yogaSunday4 = new Lesson("Yoga", "Sunday", "Weekend 4", 5);
//        Lesson spinSunday4 = new Lesson("Spin", "Sunday", "Weekend 4", 5);
//        Lesson barreSunday4 = new Lesson("Barre", "Sunday", "Weekend 4", 5);
//        Lesson cardioSunday4 = new Lesson("Cardio", "Sunday", "Weekend 4", 5);



        Lesson[] lessons = new Lesson[32];

        lessons[0] = new Lesson("Yoga", "Saturday", "Weekend 1", 5);
        lessons[1] = new Lesson("Pilates", "Saturday", "Weekend 1", 5);
        lessons[2] = new Lesson("Zumba", "Saturday", "Weekend 1", 5);
        lessons[3] = new Lesson("CrossFit", "Saturday", "Weekend 1", 5);
        lessons[4] = new Lesson("Spin", "Sunday", "Weekend 1", 5);
        lessons[5] = new Lesson("Boxing", "Sunday", "Weekend 1", 5);
        lessons[6] = new Lesson("Bootcamp", "Sunday", "Weekend 1", 5);
        lessons[7] = new Lesson("Swimming", "Sunday", "Weekend 1", 5);
        lessons[8] = new Lesson("Yoga", "Saturday", "Weekend 2", 5);
        lessons[9] = new Lesson("Pilates", "Saturday", "Weekend 2", 5);
        lessons[10] = new Lesson("Zumba", "Saturday", "Weekend 2", 5);
        lessons[11] = new Lesson("CrossFit", "Saturday", "Weekend 2", 5);
        lessons[12] = new Lesson("Spin", "Sunday", "Weekend 2", 5);
        lessons[13] = new Lesson("Boxing", "Sunday", "Weekend 2", 5);
        lessons[14] = new Lesson("Bootcamp", "Sunday", "Weekend 2", 5);
        lessons[15] = new Lesson("Swimming", "Sunday", "Weekend 2", 5);
        lessons[16] = new Lesson("Yoga", "Saturday", "Weekend 3", 5);
        lessons[17] = new Lesson("Pilates", "Saturday", "Weekend 3", 5);
        lessons[18] = new Lesson("Zumba", "Saturday", "Weekend 3", 5);
        lessons[19] = new Lesson("CrossFit", "Saturday", "Weekend 3", 5);
        lessons[20] = new Lesson("Spin", "Sunday", "Weekend 3", 5);
        lessons[21] = new Lesson("Boxing", "Sunday", "Weekend 3", 5);
        lessons[22] = new Lesson("Bootcamp", "Sunday", "Weekend 3", 5);
        lessons[23] = new Lesson("Swimming", "Sunday", "Weekend 3", 5);
        lessons[24] = new Lesson("Yoga", "Saturday", "Weekend 4", 5);
        lessons[25] = new Lesson("Pilates", "Saturday", "Weekend 4", 5);
        lessons[26] = new Lesson("Zumba", "Saturday", "Weekend 4", 5);
        lessons[27] = new Lesson("CrossFit", "Saturday", "Weekend 4", 5);
        lessons[28] = new Lesson("Spin", "Sunday", "Weekend 4", 5);
        lessons[29] = new Lesson("Yoga", "Saturday", "Weekend 4", 5);
        lessons[30] = new Lesson("Pilates", "Saturday", "Weekend 4", 5);
        lessons[31] = new Lesson("Zumba", "Saturday", "Weekend 4", 5);



        System.out.println("Please select any option:\n");
        System.out.println("1. View lessons by day\n");
        System.out.println("2. View lessons by fitness type\n");
        System.out.println("3. Write a Review\n");
        System.out.println("4. View Report\n");
        int customerChoice = scanner.nextInt();

        switch (customerChoice){
            case 1:
                for (Lesson lesson : lessons){
                    lesson.viewLessonByDay("saturday");
                }
                break;

            case 2:
                for (Lesson lesson : lessons){
                    lesson.viewLessonByFitnessType("yoga");
                }
                break;
        }





    }
}