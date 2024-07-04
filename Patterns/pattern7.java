/*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1

*/ 

import java.util.Scanner;
class pattern7{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int r=s.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
