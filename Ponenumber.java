import java.util.Scanner;
public class Ponenumber{
    public static void main(String[] args) {
        System.out.println("enter the Temprature");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp<20)
        {
            System.out.println("temprature is cold");  
        }
        else if(temp>20 && temp<45)
        {
            System.out.println("temprature is warm");
        }
        else
        {
            System.out.println("temprature is hot");
        }
    }
}