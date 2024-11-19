package day11;

public class Sungjuk {

	public static void main(String[] args) {
		String[] names= {"a","b","c","d","e","f"};
		int[] kor= {50,30,90,55,66,77};
		int[] math= {33,44,55,99,67,88};
		int i=0;
		int sum[]=new int[6];
		int[] avg=new int[6];
		for(i=0;i<names.length;i++) {
			sum[i]=kor[i]+math[i];
			avg[i]=(int)sum[i]/2;
		}
		
		System.out.println("no name  kor math total avg");
		System.out.println("=============================");
		for(i=0;i<names.length;i++) {
			System.out.printf("%-3d %1s   %1d   %3d   %3d  %d'\n",
			(i+1),names[i],kor[i],math[i],sum[i],avg[i]);
		}
		
		int mathsum=0,korsum=0,totalsum=0,avgsum=0;
		for(i=0;i<4;i++) {
			korsum +=kor[i];
			mathsum +=math[i];
			totalsum+=sum[i];
			avgsum+=avg[i];
		}
		System.out.println("---------------------------");
		System.out.print("전체총점 : ");
		System.out.printf(" %3d   %3d   %3d   %3d",
				korsum,mathsum,totalsum,(int)avgsum/6);
		

	}

}
