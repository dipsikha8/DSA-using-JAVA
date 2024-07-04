/*
      1 
      2 2 
      3 3 3 
      4 4 4 4 
      5 5 5 5 5 
*/



import java.util.Scanner;
class pattern4{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int r=s.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){ 
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
