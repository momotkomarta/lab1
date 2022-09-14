package main;

import java.util.Scanner;
import java.util.ArrayList;
import abiturient.Abiturient;
import java.util.PriorityQueue;

public class Main {

    public static ArrayList<Abiturient> returnArray(Scanner scan){
        ArrayList<Abiturient> listOfAbiturients = new ArrayList<>();
        System.out.print(" Enter the num of abiturients: ");
        int num = scan.nextInt();
        Abiturient obj = new Abiturient();
        listOfAbiturients.add(obj);
        for(int i = 1; i<num; i++){
            System.out.print(" Enter the id of the abiturient: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print(" Enter the surname of the abiturient: ");
            String surname = scan.nextLine();
            System.out.print(" Enter the name of the abiturient: ");
            String name = scan.nextLine();
            System.out.print(" Enter the patronymic of the abiturient: ");
            String patronymic = scan.nextLine();
            System.out.print(" Enter the address of the abiturient: ");
            String address = scan.nextLine();
            System.out.print(" Enter the phone number of the abiturient: ");
            String phoneNumber = scan.nextLine();
            System.out.print(" Enter the average grade of the abiturient: ");
            double averageGrade = scan.nextDouble();
            scan.nextLine();
            obj = new Abiturient(id, surname, name, patronymic, address, phoneNumber, averageGrade);
            listOfAbiturients.add(obj);
        }
        return listOfAbiturients;
    }

    public static void displayAllWithName(String firstName, ArrayList<Abiturient> listOfAbiturients){
        System.out.format("\n\n|   ID   |     NAME     |     SURNAME    |   PATRONYMIC  | GRADE |");   
        for(int i = 0; i<listOfAbiturients.size(); i++){
            if(listOfAbiturients.get(i).getName().equalsIgnoreCase(firstName)){
                 listOfAbiturients.get(i).display();
            }
        }
    }

    public static void displayAllHigherGrade(double grade, ArrayList<Abiturient> listOfAbiturients){
        System.out.format("\n\n|   ID   |     NAME     |     SURNAME    |   PATRONYMIC  | GRADE |");   
        for(int i = 0; i<listOfAbiturients.size(); i++){
            if(grade < listOfAbiturients.get(i).getAverageGrade()){
                listOfAbiturients.get(i).display();
            }
        }
    }

    public static void nLargest(int N, ArrayList<Abiturient> listOfAbiturients){
       PriorityQueue<Abiturient> pQueue = new PriorityQueue<Abiturient>();
        for(int i = 0; i<listOfAbiturients.size(); i++){
            pQueue.add(listOfAbiturients.get(i));
            if(pQueue.size() > N){
                pQueue.poll();
            }
       }
        System.out.print("\n\n|   ID   |     NAME     |     SURNAME    |   PATRONYMIC  | GRADE |");
        while(!pQueue.isEmpty()){
            pQueue.poll().display();;
       }


    }

    public static void main(String[] args){
        ArrayList<Abiturient> listOfAbiturients = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        listOfAbiturients = returnArray(scan);
        System.out.print("\n\n|   ID   |     NAME     |     SURNAME    |   PATRONYMIC  | GRADE |");
        for(int i = 0; i<listOfAbiturients.size(); i++){
            listOfAbiturients.get(i).display();
        }
        System.out.print("\n\n Enter the name of the abiturient: ");
        String firstName = scan.nextLine();
        displayAllWithName(firstName, listOfAbiturients);
        System.out.print("\n\n Enter the grade of the abiturient: ");
        double grade = scan.nextDouble();
        displayAllHigherGrade(grade, listOfAbiturients);
        System.out.print("\n\n Enter the num of the abiturient: ");
        int N = scan.nextInt();
        nLargest(N, listOfAbiturients);
        scan.close();
    }
}