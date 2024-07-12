import java.util.Scanner;
class Array_Sorted_Or_Not{
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
        System.out.println(); 
        if (Sorted(a)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
    static  boolean Sorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
            
        }
        return true;

    }
    
}