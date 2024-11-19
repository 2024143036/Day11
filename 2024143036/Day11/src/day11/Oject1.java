package day11;

public class Oject1 {

	public static void main(String[] args) {
		Job aaa=new Job();
		System.out.println(aaa.pay+" : "+aaa.distance);

		Job bbb=new Job();
		System.out.println(bbb.pay+" : "+bbb.distance);
		}
	}
	
	class Job{
		int pay;
		int distance;
		public Job() {
			pay=300;
			distance=30;
		}
	}
	

