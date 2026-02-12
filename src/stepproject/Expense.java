package stepproject;
import java.util.Scanner;
public class Expense {
    public static void main(String[] args){
       income s = new income();
       int e = s.ravi();
       System.out.println(e);
    }
}
class income{
    int ravi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter the bonus : ");
        int bonus = sc.nextInt();
        int s = bonus + salary ;
        return s;
    }
}