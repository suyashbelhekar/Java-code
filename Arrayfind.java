import java.util.Scanner;
public class Arrayfind
{
    public static void main(String[] Args)
    {
        System.out.println("enter the elements");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[5]; 
        for(int i=1;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search");
        int x=sc.nextInt();
        for(int i=1;i<arr.length;i++)
        {
            if(x==arr[i])
            {
             System.out.println(arr[i]);
            }
            else 
            {
                System.out.println("can not find");
            }
        }
    }
}