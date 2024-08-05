
import java.util.Scanner;

public class Voter {
    int voterId;
    String name;
    int age;
    public Voter( ) {

    }
    void ageValidity(int age){
        if(age<18) {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        Voter voter=new Voter();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the person voter id : ");
        int voterId=scanner.nextInt();
        System.out.println("Enter the name : ");
        String name=scanner.next();
        System.out.println("Enter the age : ");
        voter.ageValidity(scanner.nextInt());

    }
}


