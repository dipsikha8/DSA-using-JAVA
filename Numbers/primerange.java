import java.util.Scanner;
class primerange{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int c=0;
        if(n<=1){
            n=n+1;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    c=c+1;
                }

            }
            if(c==0){
                System.out.println("The number is a prime number");
            }
            else{
                System.out.println("The numner is not a prime number");
            }
        }
        s.close();
    }
    
}