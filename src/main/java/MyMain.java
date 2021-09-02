import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = scan.nextLine();
        System.out.println("Nice to meet you" + Name + " !");
        System.out.println("What is your favorite color, " + Name +"?");
        String color = scan.nextLine();
        System.out.println(color + " is certainly a great color");
        System.out.println("What is your favorite music genre?");
        String genre = scan.nextLine();
        System.out.println("I like " + genre + " as well, " + Name);
        System.out.println("What's your favorite sport?");
        String sport = scan.nextLine();
        System.out.println("I love watching " + sport);
        System.out.println("Will Yuvi get full points on this assignment?");
        String yes_no = scan.nextLine();
        System.out.println("I also said " + yes_no);


        scan.close();
    }
}
