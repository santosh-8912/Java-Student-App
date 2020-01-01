
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
import java.io.Serializable;
class GetData{
    Scanner input = new Scanner(System.in);
    public String getData(){
        String userinput = input.next();
        return userinput;
    }
    
}
class GetPersonalInformation {
    GetData gd = new GetData();
    String name, surname, fathername, mothername, age, bloodgroup;
    public void getInfo(){
        System.out.println("\tGetting Student Personal Information : ");
        System.out.print("Enter Student Name : ");
        name = gd.getData();
        System.out.print("Enter Student Surname : ");
        surname = gd.getData();
        System.out.print("Enter Student Father Name : ");
        fathername = gd.getData();
        System.out.print("Enter Student Mother Name : ");
        mothername = gd.getData();
        System.out.print("Enter Student Age : ");
        age = gd.getData();
        System.out.print("Enter Student Blood Group : ");
        bloodgroup = gd.getData();    
    }
    
}
public class StudentGetInformation extends GetPersonalInformation implements Serializable{
    //GetPersonalInformation personal = new GetPersonalInformation();
    
    public void gettingInformation() {
        //personal.getInfo();
        getInfo();
        
    }
}
