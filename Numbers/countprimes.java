import java.util.Scanner;
class countprimes{
    public static void  main(String[]args){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        for(int i=2;i<n;i++){
            int c=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.println(i);
            }
        }
    }
}