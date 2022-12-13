package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departmentName;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String email;
    private String alternateEmail;
    private String companySuffix = "company.com";


    //Constructor to recieve the first and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " "+  this.lastName + "\n");
        //Call a method asking for the department -> return the department
        this.departmentName = setDepartment();
        //System.out.println("Department: "+ this.departmentName);

        //call a method that returns a password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: "+ this.password);

        //combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+departmentName+"."+companySuffix;
        //System.out.println("Your email is: "+this.email);
    }



    //Ask for the department
    private String setDepartment(){
        System.out.println("NEW WORKER: "+firstName+ "\n"+"DEPARTMENT CODES\nEnter the department code \npress 1 for Sales\nPress 2 for Development\nPress 3 for accounting\n" +
                "Press 0 for none of the above");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){return "Sales";}
        else if (departmentChoice == 2){return "Development";}
        else if (departmentChoice == 3){return "Accounting";}
        else{return "None";}
    }

    //Generate a random password
    private String randomPassword (int length){
        //We're gonna look at this like an array of characters
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName+ " "+lastName+"\n"+
                "COMPANY EMAIL: "+ email+"\n"+
                "MAILBOX CAPACITY: "+ mailboxCapacity+"mb";
    }


}
