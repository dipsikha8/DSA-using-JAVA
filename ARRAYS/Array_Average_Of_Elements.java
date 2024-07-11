import java.util.Scanner;

class Array_Average_Of_Elements{
    public static void main(String[]args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of the array:");

       int size = s.nextInt();
       int[] a = new int[size];
       for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
       }
       System.out.println("Array is :");
       for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
       }
       System.out.println("Average is:"+Average(a));
      

  }
  static double Average(int[] a){
       double sum=0;
       double avg=0;
       
       for(int i=0;i<a.length;i++){
           sum+=a[i];
       }
       avg=sum/a.length;
       return avg;
  }

         
}
