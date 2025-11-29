package odev1;

import java.util.Scanner;

public class dateformation {

    // American format: Monday, July 22, 2019
       public static void printAmerican(String day, int date, String month, int year) {
           System.out.println(day + ", " + month + " " + date + ", " + year);
       }

       // European format: 22 July 2019, Monday
       public static void printEuropean(String day, int date, String month, int year) {
           System.out.println(date + " " + month + " " + year + ", " + day);
       }

       public static void main(String[] args) {

           Scanner input = new Scanner(System.in);

           // --- Kullanıcıdan bilgi alma bölümü ---
           System.out.print("Enter day (örn, Monday): ");
           String day = input.nextLine();

           System.out.print("Enter month (örn , July): ");
           String month = input.nextLine();

           System.out.print("Enter date (number): ");
           int date = input.nextInt();

           System.out.print("Enter year: ");
           int year = input.nextInt();

           System.out.println("\nAmerican Format:");
           printAmerican(day, date, month, year);

           System.out.println("European Format:");
           printEuropean(day, date, month, year);
       }
   }
