import java.util.*;

public class HashmapStudent {

    HashMap<String, Integer> hashmap = new HashMap<>();

    void add(String name, Integer grade) {

        hashmap.put(name, grade);
        System.out.println("Details are updated");

    }


    void remove(String name) {
        System.out.println("Removing student " + name + " from the map :");
        System.out.println(hashmap.remove(name));
    }

    void display() {
        Set<Map.Entry<String, Integer>> set = new HashSet<>();
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println("Student : " + entry.getKey() + ", Grade : " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        HashmapStudent obj = new HashmapStudent();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Display");

            System.out.println("Enter the choice :");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter the student name and grade to add :");
                    obj.add(scanner.next(), scanner.nextInt());
                    break;

                case 2:
                    System.out.println("Enter the name to remove : ");
                    obj.remove(scanner.next());
                    break;

                case 3:
                    System.out.println("Displaying the details");
                    obj.display();
                    break;

                default:
                    System.out.println("Enter the correct choice");
                    break;
            }
        }
    }
}

