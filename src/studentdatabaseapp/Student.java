package studentdatabaseapp;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Student {
    //for encapsulation we use private
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    //constructor: prompt user to add students name and year
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter students first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter students last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore\n3 - Junior \n4 - Senior\nEnter students class level: ");
        this.gradeYear = in.nextInt();

        System.out.println(firstName+" "+lastName+" "+gradeYear);

    }

    //Generate unique identifier number

    //enroll in courses

    //View balance and then pay tuition

    //show status

    //toString method for viewing has the status, name, ID, courses enrolled, and balance
 }
