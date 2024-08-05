
import java.util.Scanner;
import java.util.Stack;
public class Collection {
    Stack<Integer> stack = new Stack<>();
    void push(int num){
        stack.push(num);
        System.out.println("pushed onto the stack ");
    }

    void pop(){
        System.out.println("Pop elements from the stack : ");
        System.out.println(stack.pop());

    }

    void isEmpty(){
        System.out.println("Check if the element is empty or not : "+stack.isEmpty());

    }
    void display() {
        for (Integer number : stack) {
            System.out.println(number);
        }

    }
    public static void main(String[] args) {
        Collection collection=new Collection();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.isEmpty");
        System.out.println("Enter the choice :");
        int choice= scanner.nextInt();

        while(true){
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add: ");
                    collection.push(scanner.nextInt());
                    break;

                case 2:
                    System.out.println("Last element is removed");
                    collection.pop();
                    break;

                case 3:
                    System.out.println("Is the stack empty or not");
                    collection.isEmpty();
                    break;

                case 4:
                    System.out.println("Displaying the elements stack");
                    collection.display();

                default:
                    System.out.println("Enter the correct option ");
                    break;
            }

        }
    }
}

