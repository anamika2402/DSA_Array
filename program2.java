//Optimized code of factors
import java.util.*;
class program2{
        static int factors(int num){
                int count=0;
                for(int i=1; i<=num/2; i++){
                        if(num%i==0){
                                count++;
                        }
                }
                return count+1;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number :");
                int num = sc.nextInt();

                int count = factors(num);

                System.out.println(count);
        }
}
	
