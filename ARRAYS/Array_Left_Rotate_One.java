import java.util.Scanner;
class Array_Left_Rotate_One{
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
            System.out.println(a[i]);
        }
        System.out.println("Array after Rotation:");
        LeftRotate(a);
        
    }
    static void LeftRotate(int[] a){
        int temp=a[0];
        int n=a.length;
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        for(int i=0;i<n;i++){
        System.out.println(a[i]);
        }
    }
}