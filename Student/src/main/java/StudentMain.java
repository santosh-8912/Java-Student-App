/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author $ANTO$H
 */
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class StudentMain {
    public static void main(String arg[]) throws IOException
    {
        Scanner input= new Scanner(System.in);
        int userinput;
        
        System.out.println("WELCOME TO STUDENT DETAILS");
        System.out.println("1] Enter Student Information");
        System.out.println("2] Display Student Information");
        System.out.println("3] Exit");

        System.out.print("Enter choice> ");
        userinput=input.nextInt();
     
        switch(userinput){
            case 1:
                StudentGetInformation sd = new StudentGetInformation();
                sd.gettingInformation();
                String filename = sd.name+".data";
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream storeobj = new ObjectOutputStream(file);
                storeobj.writeObject(sd);
                System.out.println("Data Stored Successfully!!!");
                break;
            case 2:
               StudentDisplayInformation stud = new StudentDisplayInformation();
               stud.listfile();
                break;
            case 3:
                break;
            default: 
                System.out.println("Invailed choice");
        }
    }
    
   
}
