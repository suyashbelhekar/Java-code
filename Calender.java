import java.util.Calender; 
 
public class Calender { 
    public static void main(String[] args) { 
        Calender calendar = Calender.getInstance(); 
         
        // Set the year to 2025, month to February (2, since months are 0-based), and day to 25 
        calendar.set(Calender.YEAR, 2025); 
        calendar.set(Calender.MONTH, Calender.FEBRUARY); // February is 1, but it's 0-based 
        calendar.set(Calender.DAY_OF_MONTH, 25); 
         
        System.out.println("Specific Date: " + calendar.getTime()); 
    }
}