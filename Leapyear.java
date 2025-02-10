import java.util.*;
public class Leapyear{
    public static void main(String args[])
    {

       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       if(year%4==00) 
       {
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println(year+" is leap year");
            }
        }
        System.out.println("adult:drive,vote");
       }
       
       else
       {
        if(year%100!=0)
        {
            System.out.println("leap year");

        }
        else{
        System.out.println(year+"not leap year");
       }
    }
}