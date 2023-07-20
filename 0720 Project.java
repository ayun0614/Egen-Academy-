import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 15; i++) {
//			System.out.print("*");
//		}
		
//		Scanner scan = new Scanner(System.in);
//		int num = (int)(Math.random()*9)+4;
//		
//		switch(num) {
//		case 1:
//			System.out.println("one");
//		case 5:
//			System.out.println("five");
//		case 6:
//			System.out.println("six");
//		}
//		
//		System.out.println(num);
		
//		int random = (int)(Math.random()*6)+1;
//		System.out.println(random);
//		System.out.println(Math.pow(random, 2));
		
//		int num = scan.nextInt(); 
//		System.out.println(num);
//		
//		int x=1;
//		int y=1;
//		
//		int result1 = ++x + 10; //대입 전에 증가
//		int result2 = y++ + 10; //대입 후에 증가
//		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(y);
//		
//		int a = 5, b;
//		
//		b=a++;
//		System.out.println(b);
//		
//		b=++a;
//		System.out.println(b);
		
//		int key = scan.nextInt();
//		char grade;
//		
//		if (key>=90)
//			grade = 'A';
//		else if(key>=80)
//			grade = 'B';
//		else if(key>=70)
//			grade = 'C';
//		else if(key>=60)
//			grade = 'D';
//		else
//			grade = 'F';
//		
//		System.out.println(grade);
//		
//		
//		char grade; 
//		
//		switch(key/10) { //Java SE 11이전 문법
//		case 10,9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
		
//		char grade = switch (key/10) { //Java SE 12부터 지원
//		case 9,10 -> 'A';
//		case 8 ->{ 
//			yield 'B';
//			}
//		case 7 ->{ //Java SE 13부터 지원
//			char result = 'C';
//			yield result;
//			}
//		
//		default -> grade = 'F';
//		};
		
//		System.out.println(grade);
	}
}
