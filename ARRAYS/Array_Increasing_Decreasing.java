import java.util.Scanner;
import java.util.Arrays;
class Array_Increasing_Decreasing{
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
       System.out.println("Rearranged Array is:");
       Rearrange(a);

  }
  static void Rearrange(int[] a){
       int n=a.length;
       Arrays.sort(a);

       
       for(int i=0;i<n/2;i++){
           System.out.println(a[i]+" ");
       }
       for(int j=n-1;j>=n/2;j--){
           System.out.println(a[j]+" ");
       }
  }
}
       

 
