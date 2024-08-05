import java.util.Scanner;

public class Weekdays {

    public void Weekdays(int i)throws ArrayIndexOutOfBoundsException{
        String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(i<0||i>6) {
            throw new ArrayIndexOutOfBoundsException();
        }else{
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Weekdays weekdays=new Weekdays();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array index to print weekdays :");
        weekdays.Weekdays(scanner.nextInt());
    }

}
