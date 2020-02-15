package srinu.java.test;

public class Duplicate {

	public static void main(String[] args) {
		int[] arra={1,3,5,7,9,2,11,23,14,2,1,5,7,8,9};
		int count=0,count2=0;
		for(int i=0;i<arra.length;i++)
		{
		count=1;
		for(int j=i+1;j<arra.length;j++)
		System.out.println(arra[i]+" Is Repeated= "+count);

		}

		System.out.println("Total numbers of Duplicate"+count2);
	}
	
}
