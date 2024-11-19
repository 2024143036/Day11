package day11;

public class CharArray {

	public static void main(String[] args) {
		String name="aaaaaaa";
		System.out.println("name : "+name);
		
		char[] nameArr2= {'A','B','C'};
		char[] nameArr=name.toCharArray();
		for(int i=0;i<nameArr.length;i++) {
			System.out.println(nameArr[i]);
		}
		
	}

}
