import java.util.*;
public class Ternary{
    public static void main(String args[])
    {

       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       String result=(number%2==0)?"even":"odd";
       System.out.println(result);
    }
}