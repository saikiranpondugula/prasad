package database.mysql23;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Demoop {

public static void main(String args[]) {


    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
    }
 
    System.out.print("Even numbers:");
    for(int i = 0 ; i < n ; i++)
    {
        if(a[i] % 2 == 0)
        {
            System.out.print(a[i]+" ");
        }
    }
}
}
//		String str[]= {"bhanu","sai","kiran"};
//		List<String> list = Arrays.asList(str);
//		TreeSet<String> tr = new TreeSet<String>(list);
//		tr.forEach(x->System.out.println(x));


	