package kbg;

import java.util.ArrayList;
import java.util.List;

public class KbgExam20180726 {
//	1. ���ڿ� 2���� �Է¹޾� ������ ��ȯ�Ͽ� �μ��� ���� ����ϴ� ���α׷��� �ۼ����ּ���.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���Ͻ� ���� a�� �Է��ϼ���");
//		int a = Integer.parseInt(scan.nextLine());
//		System.out.println("���Ͻ� ���� b�� �Է��ϼ���");
//		int b = Integer.parseInt(scan.nextLine());
//		System.out.println(a+b);
//	}

//	2. ���� ��ĭ�� �� �ڵ带 ��������.
//
//	public class Test {
//
//		public static void main(String[] args) {
//			int num = 63;
//			
//			if(   num<100     ) {
//				System.out.println("num�� 100 �̸��Դϴ�.");
//			} else if(     num>100     ){
//				System.out.println("num�� 100 �ʰ��Դϴ�. ");
//			} else {
//				System.out.println("num�� 100�Դϴ�.");
//			}
//			
//		}
//	}

//	3. ������ �迭�� ����� 5���� ������(0~ 9)�� ����־� ����ϴ� ���α׷��� �ۼ����ּ���. 
//	  - (List ��밡��)
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

//	4. ������ ������Ÿ�� 2���� �Ķ���ͷ� �޾� ���� �����ϴ� �޼ҵ带 �ۼ����ּ���.
//	
//	public int test(int a,int b) {
//		
//		return a+b;
//	}

//
//	5. 1���� 50���� �߿��� 3�� ����̰� 7�ǹ���� ���ڸ� ������ּ���. 
//	public static void main(String[] args) {
//		for(int i = 1;i<50;i++) {
//			if(i%3==0&&i%7==0) {
//				System.out.println(i);
//				
//			}
//		}
//	}
	

//	6. �Ķ���ͷ� ������ ���� ����ִ� ������ �迭�� �޾� �ִ밪�� �������ִ� �޼ҵ带 �ۼ����ּ���. 
//	  - (������ 3 ~ 10)      
//	  - (List ��밡��)
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
//	7. �Ķ���ͷ� String �迭 �� ���ڿ��� �޾� �ش� �迭�� ���° �濡 �ش� ���ڿ��� �ִ��� �����ϴ� �޼ҵ带 �ۼ����ּ���.
//	  - (List ��밡��)
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
//	8. ���� ���α׷��� ���� ����� ������.
//
//	class Father{
//		
//		public void run() {
//			System.out.println("�ƺ��� �޸��ϴ�.");
//		}
//	}
//
//	public class Test extends Father{
//
//		@Override
//		public void run() {
//			System.out.println("���� �޸��ϴ�.");
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
//	���� �޸��ϴ�.
//	�ƺ��� �޸��ϴ�.


//	9. user_info ��� �̸�, ����, �ּҸ� ������ �� �ִ� table�� ����� ��ɾ ������ 
//	  - (�̸�, ���̴� null���� �ȵǰ� ����)
//	  - (������ Ÿ��, ������� ������)
//	  - (oracle, mariadb ���߿� �ƹ��ų�)
//	create table user_info(
//	uiName varchar(20) not null,
//	uiAge int not null,
//	uiAddress varchar(1000) not null);
//
//	10. ��ݸ��� user_info ���̺��� ������ ��� ���� �������� ����ϴ� ��ɾ ������.
//	select * from user_info;
}
