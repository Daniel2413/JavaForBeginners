package userinterface;

import java.util.Scanner;

public class UserInterface {

    
    public static void main(String[] args) {
        System.out.println("Please enter the following details");
        System.out.println("First name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        
        System.out.println("Last name:");
        Scanner sc1 = new Scanner(System.in);
        String lastName = sc1.nextLine();
        
        System.out.println("Your school year:");
        Scanner sc3 = new Scanner(System.in);
        String year = sc.nextLine();
        
        System.out.println("Pathway Chosen:");
        Scanner sc2 = new Scanner(System.in);
        String pathway = sc2.nextLine();
        
        System.out.println("Name:    "+lastName+", "+firstName);
        System.out.println("Pathway: "+pathway);
        System.out.println("Year:    "+year);
    }
    
}
