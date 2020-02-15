package srinu.java.test;

public class SumOfNumbers {

	public static void main(String args[ ]){
		int i=1234;
		int sum=0;

		while(i!=0){
		sum=sum+i%10;
		System.out.println("sum:"+sum);
		i=i/10;
		}
		System.out.println(sum);
		}
}
