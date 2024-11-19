package day11;

import java.util.Scanner;

public class CharArrScan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//1. 배열에 키보드로 받은 문자를 입력
		char[] ch=new char[10];
		
		//2. while문으로 받아오되 'r; or 'R' 빠져나오시오
		int i=0;
		while(true){
			System.out.print("문자 입력>>");
			String str=scan.next();
			ch[i]=str.charAt(0);
			//입력된 배열 값 출력
			System.out.print(ch[i]+"  ");
			if(ch[i]=='r'|| ch[i]=='R') {
				System.out.println("종료");
				break;
			}
		}
		
	}

}
