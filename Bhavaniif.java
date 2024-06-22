package Batch2;
import java.util.Scanner;

public class Bhavaniif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
    if(age>18&&age<100){
        System.out.println("Eliglible for vote");
    }
    else if(age<18){
        System.out.println("Not eliglible for vote");
    }
    else
    {
        System.out.println("person is too old they may alive or not");
    }
    }
}

