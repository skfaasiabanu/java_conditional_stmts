import java.util.*;
public class Posnegnum{
    public static void main(String args[])
    {

       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       if(number>=0) 
       {
        System.out.println(number+" is positive number");
       }
       else
       {
        System.out.println(number+" is negative number");
       }
    }
}