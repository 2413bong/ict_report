package kbg;

import java.util.ArrayList;
import java.util.List;

public class KbgExam20180726 {
//	1. 문자?�� 2개�?? ?��?��받아 ?��?���? �??��?��?�� ?��?��?�� ?��?�� 출력?��?�� ?��로그?��?�� ?��?��?��주세?��.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("?��?��?�� ?��?�� a�? ?��?��?��?��?��");
//		int a = Integer.parseInt(scan.nextLine());
//		System.out.println("?��?��?�� ?��?�� b�? ?��?��?��?��?��");
//		int b = Integer.parseInt(scan.nextLine());
//		System.out.println(a+b);
//	}

//	2. ?��?�� 빈칸?�� ?��?���? 코드�? ?��?��?��?��.
//
//	public class Test {
//
//		public static void main(String[] args) {
//			int num = 63;
//			
//			if(   num<100     ) {
//				System.out.println("num?�� 100 미만?��?��?��.");
//			} else if(     num>100     ){
//				System.out.println("num?�� 100 초과?��?��?��. ");
//			} else {
//				System.out.println("num?�� 100?��?��?��.");
//			}
//			
//		}
//	}

//	3. ?��?��?�� 배열?�� 만들�? 5개의 ?��?���?(0~ 9)?�� 집어?��?�� 출력?��?�� ?��로그?��?�� ?��?��?��주세?��. 
//	  - (List ?��?���??��)
//	public static void main(String[] args) {
//		List<Integer> a = new ArrayList<Integer>();
//		for(int i =0; i<5;i++) {
//			int b =(int)(Math.random()*10);
//			a.add(b);
//		}
//		for(int n:a) {
//			System.out.println(n);
//		}
//	}

//	4. ?��?��?�� ?��?��?��???�� 2개�?? ?��?��미터�? 받아 ?��?�� 리턴?��?�� 메소?���? ?��?��?��주세?��.
//	
//	public int test(int a,int b) {
//		
//		return a+b;
//	}

//
//	5. 1�??�� 50까�? 중에?�� 3?�� 배수?���? 7?��배수?�� ?��?���? 출력?��주세?��. 
//	public static void main(String[] args) {
//		for(int i = 1;i<50;i++) {
//			if(i%3==0&&i%7==0) {
//				System.out.println(i);
//				
//			}
//		}
//	}
	

//	6. ?��?��미터�? ?��?��?�� 값이 ?��?��?��?�� ?��?��?�� 배열?�� 받아 최�?값을 리턴?��주는 메소?���? ?��?��?��주세?��. 
//	  - (?��?���? 3 ~ 10)      
//	  - (List ?��?���??��)
//	public int test(int[] a) {
//		int max = 0;
//		for(int i=0;i<a.length;i++) {
//			if(i==0) {
//				max=a[0];
//				
//			}else{
//				if(max<a[i]){
//					max=a[i];
//					
//				}
//				
//			}
//			
//		}
//		return max;
//	}
//
//	7. ?��?��미터�? String 배열 �? 문자?��?�� 받아 ?��?�� 배열?�� 몇번�? 방에 ?��?�� 문자?��?�� ?��?���? 리턴?��?�� 메소?���? ?��?��?��주세?��.
//	  - (List ?��?���??��)
//	public int test(String[] a,String b) {
//		for(int i = 0;i<a.length;i++) {
//			if(a[i].equals(b)){
//				return i;
//			}
//		}
//		return 0;
//		
//		
//	}
//
//	8. ?��?�� ?��로그?��?�� ?��?�� 결과�? ?��?��?��.
//
//	class Father{
//		
//		public void run() {
//			System.out.println("?��빠�? ?��립니?��.");
//		}
//	}
//
//	public class Test extends Father{
//
//		@Override
//		public void run() {
//			System.out.println("?���? ?��립니?��.");
//		}
//
//		public static void main(String[] args) {
//			Father f = new Test();
//			f.run();
//	 
//			Father f2 = new Father();
//			f2.run();
//		}
//
//	} 
//	?���? ?��립니?��.
//	?��빠�? ?��립니?��.


//	9. user_info ?��?�� ?���?, ?��?��, 주소�? ???��?�� ?�� ?��?�� table?�� 만드?�� 명령?���? ?��?��?�� 
//	  - (?���?, ?��?��?�� null값이 ?��?���? ?��?��)
//	  - (?��?��?�� ???��, ?��?��즈는 ?��?��?��)
//	  - (oracle, mariadb ?��중에 ?��무거?��)
//	create table user_info(
//	uiName varchar(200) not null,
//	uiAge int not null,
//	uiAddress varchar(1000) not null);
//
//	10. 방금만든 user_info ?��?��블의 ?��?��?�� 모두 보고 ?��?��?��?�� ?��?��?��?�� 명령?���? ?��?��?��.
//	select * from user_info;
}
