---

# Weekend Fitness Club (WFC) Booking System

## Project Overview
This project is a Java-based booking system developed for the Weekend Fitness Club (WFC) as part of coursework. The system manages bookings for various fitness lessons offered by the club, such as Yoga, Spin, Pilates, CrossFit, and Boxing. Users can book lessons, update or cancel their bookings, attend lessons, and provide ratings. The system also generates monthly reports.

## Features
- **User Authentication**: Validates users based on a pre-defined list.
- **Booking Lessons**: Allows users to book lessons by day or fitness type.
- **Update Bookings**: Users can change or cancel their existing bookings.
- **Attend Lessons**: Users can mark their attendance and rate the lessons they attended.
- **Monthly Reports**: Generates reports for lessons and identifies the most profitable fitness type.

## System Design
The system uses object-oriented principles and consists of several classes:
- **MainMenu**: Controls the main menu options and user inputs.
- **Lesson**: Represents a fitness lesson, including details like type, day, weekend, price, capacity, and bookings.
- **Customer**: Represents a customer, with name and email attributes.
- **Booking**: Represents a booking, linking a customer to a lesson.
- **Tester**: Initializes the system with sample data and starts the application.
- **BookingSystem**: Contains the backend logic for booking, updating, and reporting.

## Database
The system uses a simple in-memory database initialized with sample data for customers and lessons. No external database is required.

## Usage
1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/WFC-Booking-System.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd WFC-Booking-System
   ```
3. **Compile the Java files**:
   ```bash
   javac *.java
   ```
4. **Run the application**:
   ```bash
   java Tester
   ```

## Assumptions and Limitations
- The system assumes valid user inputs.
- Limited to a command-line interface.
- Only five pre-defined customers and four weekends.
- No authentication or authorization mechanisms.

## Testing
Unit tests are provided to ensure the functionality of the `Lesson` class. The tests cover the constructor, booking capacity, and booking list management.
