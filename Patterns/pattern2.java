/*   *
     * *
     * * *
     * * * *
     
*/


import java.util.Scanner;
class pattern2{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int r=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

