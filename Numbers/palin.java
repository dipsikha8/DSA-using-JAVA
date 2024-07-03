import java.util.Scanner;
class palin{
    static boolean ispalindrome(int n){
        int org=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(org==rev){
            return true;
        }
        else{
            return false;
        }
        


    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number u want to chehck:");
        int n=s.nextInt();
        System.out.println(ispalindrome(n));


    }
}