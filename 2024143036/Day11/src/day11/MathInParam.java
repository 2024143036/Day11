package day11;

public class MathInParam {

	public static void main(String[] args) {
		int even[]=new int[30];
		for(int i=0;i<30;i++) {
				even[i]=i;
		}
		System.out.println(even[0]+even[1]+even[2]);
		int sumeven=sum(even);
		System.out.println("sumeven = "+sumeven);

	}
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}

}
