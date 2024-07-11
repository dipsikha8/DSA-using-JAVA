import java.util.Scanner;

class Array_Sum_Of_Elements{
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
       System.out.println("sum of the Array Elements is:"+sum(a));
      

  }
  static int sum(int[] a){
       int sum=0;
       for(int i=0;i<a.length;i++){
           sum+=a[i];
       }
       return sum;
  }

         
}
