//more optimized way to perform factors code with square root function
import java.util.*;
class program3{
	static int factors(int num){
		int count = 0;
		for(int i=1; i*i<=num; i++){
			if(num%i==0){
				if(i==num/i){
					count =count+1;
				}
				else{
					count=count+2;
				}
			}
		}
		return count;

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to calculate its factors :");
		int num=sc.nextInt();
		int count = factors(num);
		System.out.println(count);
	}
}
	
