package database.mysql23;

import java.time.LocalDate;

public class Compare2dates {
	private static int compareDates(LocalDate date1, LocalDate date2) {
        
        date1 = LocalDate.of(2021,5,2);   
        date2 = LocalDate.of(2021,5,2); 
        
        System.out.println("Date1: " + date1);   
        System.out.println("Date2: " + date2); 
        
        if (date1.isAfter(date2))   
        {   
        return 2; 
        }   
        else if (date1.isBefore(date2))   
        {   
        return 1;   
        }   
        else if (date1.isEqual(date2))   
        {   
        return 0;   
        }
        else
       return -1;   
   }
   public static void main(String[] args) {
       
       System.out.println(compareDates(null, null));
   }
}
