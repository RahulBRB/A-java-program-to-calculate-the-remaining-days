package com.company;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


        public class Main { public static void main(String[] args) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Name of the program: ");
            System.out.println("\"CALCULATE REMAINING DAYS\"");
            System.out.println(" ");
            System.out.println("Description: ");
            System.out.println("This program will calculate the no. of days remaining between current date (or initially put date), and final date.");
            System.out.println(" ");

            /*
            // Firstly, we have to collect user's date.
            System.out.println("Enter today\'s date: ");
            System.out.println("(In this format yyyy-mm-dd)");

            // We have to put a scanner to record the user's input.
            Scanner before = new Scanner(System.in);

            // Make these two Strings beforehand, because we will need them later.
            String dateBeforeString, dateAfterString;
            dateBeforeString = before.nextLine();

            // Now let's ask for the user's desired date.
            System.out.println("Enter last date: ");
            System.out.println("(In this format yyyy-mm-dd)");

            // Again, we will need a new scanner for last date.
            Scanner after = new Scanner(System.in);
            dateAfterString = after.nextLine();
            */


            System.out.println("Enter current year: (in yyyy format)");
            Scanner yearIn = new Scanner(System.in);
            int year;
            year = yearIn.nextInt();

            System.out.println("Enter current month: (in mm format) ");
            Scanner monthIn = new Scanner(System.in);
            String month;
            month = monthIn.nextLine();

            System.out.println("Enter today\'s date: (in dd format) ");
            Scanner dateIn = new Scanner(System.in);
            int date;
            date = dateIn.nextInt();

            String dateBeforeString, dateAfterString;

            dateAfterString = year + "-" + month + "-" + date;

            System.out.println("The date you mentioned = " + dateAfterString);
            System.out.println("Retype the date to confirm");
            Scanner dateBeforeString1 = new Scanner(System.in);
            String dateBeforeString2 = dateBeforeString1.nextLine();

            System.out.println("Enter year of last date: (In this format yyyy)");
            Scanner year1Int = new Scanner(System.in);
            String year1 = year1Int.nextLine();

            System.out.println("Enter month of last date: (In this format mm)");
            Scanner month1Int = new Scanner(System.in);
            String month1 = month1Int.nextLine();

            System.out.println("Enter the last date: (In this format dd)");
            Scanner date1Int = new Scanner(System.in);
            String date1 = date1Int.nextLine();

            dateBeforeString = year1 + "-" + month1 + "-" + date1;
            System.out.println("The date you mentioned = " + dateBeforeString);
            System.out.println("Retype the date to confirm:");
            Scanner dateAfterString1 = new Scanner(System.in);
            String dateAfterString2 = dateAfterString1.nextLine();

            dateBeforeString = year1 + "-" + month1 + "-" + date1;


            System.out.println("Result:");
            // Parsing the date using .parse command with LocalDate
            LocalDate dateBefore = LocalDate.parse(dateBeforeString2);
            LocalDate dateAfter = LocalDate.parse(dateAfterString2);

            // Calculating the number of days in between these two
            double noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

            // Finally, displaying the number of days
            System.out.print("No. of days remaining is ");
            System.out.println(noOfDaysBetween);
            System.out.println("--------------------------------------------------------------------");


        }
        }
       
