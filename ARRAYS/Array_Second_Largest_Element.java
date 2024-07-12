import java.io.*;
import java.util.Scanner;
class Array_Second_Largest_Element{
     public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
             a[i]=s.nextInt();
          }
          System.out.println("Array is :");
          for(int i=0;i<size;i++){
             System.out.print(a[i]+" ");
          }
          System.out.println("Second Largest element in the Array is:"+ Second_Largest(a));
    }

    static int Second_Largest(int[] a){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secondlargest=largest;
                largest=a[i];
            }
            else if(a[i] > secondlargest && a[i] != largest){
		
			    secondlargest = a[i];
            }
		
        }
        return secondlargest;
    }
}