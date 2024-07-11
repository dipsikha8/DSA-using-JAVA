import java.util.Scanner;
class Array_Reverse{
    public static void main(String[]args){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the size of the array:");
 
          int size=s.nextInt();
          int[] a=new int[size];
          for(int i=0;i<size;i++){
             a[i]=s.nextInt();
          }
          System.out.println("Array is :");
          for(int i=0;i<size;i++){
             System.out.print(a[i]+" ");
          }
          System.out.println();
          System.out.println("Reverse of the array is:");
          
          reverse(a);
   }
   static void reverse(int[] a){
          for(int i=a.length-1;i>=0;i--){
             System.out.print(a[i]+" ");
          }
   }
}
