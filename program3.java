//quite optimized code : square root
import java.util.*;
class program3{
	static int squareroot(int num){
		int val=0;
		for(int i=1; i<=num; i++){
			if(i*i <= num){
				val=i;
			}
			else{
				break;
			}

		}
		return val;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		int sqrt = squareroot(num);
		System.out.println(sqrt);
	}
}


