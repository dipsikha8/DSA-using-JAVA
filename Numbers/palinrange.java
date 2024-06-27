import java.util.Scanner;
class palinrange{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int l=s.nextInt();
        System.out.println("Enter the upper limit:");
        int u=s.nextInt();
    
        
        
        System.out.println("palindrome numbers within given range:");
        for(int i=l;i<=u;i++){
            int org=i;
            int rev=0;
            int temp=i;
            while(temp>0){
                int d=temp % 10;
                rev=rev*10+d;
                temp=temp/10;
                
            }
            if(org==rev){
                System.out.println(org);
    
            }

           
           

        }
    s.close();
        
    
    
    
            
    
    }

}
    

        
        