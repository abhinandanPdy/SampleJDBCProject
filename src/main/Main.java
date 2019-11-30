package main;

import connection.DatabaseConnection;
import dataEntry.Entry;
import student.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        connection.startConnection();
        connection.printConnectionStatus();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        int studentID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter student year: ");
        int studentYear = scanner.nextInt();
        System.out.println("Enter student CPI: ");
        double studentCPI = scanner.nextDouble();
        Student student = new Student(studentID, studentName, studentYear, studentCPI);
        Entry entry = new Entry();
        if (entry.createNewStudentInDatabase(DatabaseConnection.getConnection(), student)) {
            System.out.println("Student Created Successfully");
        } else {
            System.out.println("Error occurred");
        }
    }
}
