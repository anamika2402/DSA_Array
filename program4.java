//optimized code using binary search
import java.util.*; 
class program4{
	static int squareroot(int num){
		int start =1; 
		int end = num;
		int ans =0;
		while(start <= end){
			int mid = (start+end)/2;
			int sqr = mid*mid;
			if(sqr == num){
				return mid;
			}
			if(sqr > num){
				end = mid-1;
			}
			else{
				ans = mid;
				start = mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sqrt = squareroot(num);
		System.out.println(sqrt);
	}
}

