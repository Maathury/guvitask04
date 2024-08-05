import java.util.Scanner;
class NameNotValidException extends Exception{
    public NameNotValidException(String str){
        super(str);
    }
}

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String str){
        super(str);
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    String course;
    public Student(int rollNo,String name,int age,String course)throws AgeNotWithinRangeException,NameNotValidException{
        if(name.matches("[a-zA-Z]*") ){
            if(age<15||age>21) throw new AgeNotWithinRangeException("Invalid age,Age should be in between 15 - 21");
            else{
                System.out.println("Student details updated");
            }
        }
        else{
            throw new NameNotValidException("Name should not contain any numbers or special characters");
        }
    }

}
class StudentManagementSystem{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rollNo : ");
        int rollNo=scanner.nextInt();
        System.out.println("Enter the name of the student : ");
        String name= scanner.next();
        System.out.println("Enter the age : ");
        int age=scanner.nextInt();
        System.out.println("Enter the course : ");
        String course=scanner.next();


        try {

            Student student=new Student(rollNo,name,age,course);
        }
        catch (NameNotValidException e){
            System.out.println(e);
        }
        catch (AgeNotWithinRangeException e){
            System.out.println(e);
        }
    }
}

