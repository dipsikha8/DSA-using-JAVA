import java.util.Scanner;
class palin{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
    
        int org=n;
        int rev=0;
        
        
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(org==rev){
            System.out.println("The entered number is palindrome");

        }
        else{
            System.out.println("The number is not palindrome");
        }
    }



        

}
