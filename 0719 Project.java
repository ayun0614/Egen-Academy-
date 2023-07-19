public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25; //변수선언(데이터 타입, 변수 명, 대입 연산자를 통한 정수 데이터 대입)
		double length = 172.5;
		String name = "김동훈";
		char blood = 'A';
		
		final boolean check = true;
		//check = false; //상수 처리하여 변경이 불가능함
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + length + ", 혈액형 : " + blood);
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f, 혈액형 : %c", name, age, length, blood);
		
		byte byteValue = 10; //1byte
		int intValue = byteValue; //1byte변수 데이터를 4byte 공간에 저장 => 자동 타입 변환
		
		short shortValue = 20; //2byte
		byteValue = (byte)shortValue; //2byte변수 데이터를 1byte 공간에 저장 => 강제 타입 변환
		
		byte result1 = 10 + 20; //컴파일 단계에서 연산
		System.out.println("result1 : " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; //int 타입으로 변환 후 연산
		System.out.println("result2 : " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; //long 타입으로 변환 후 연산
		System.out.println("result3 : " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6+v7; //int 타입으로 변환 후 연산
		System.out.println("result4 : " + result4);
		System.out.println("result4 : " + (char)result4);
		
		int v8 = 10;
		int result5 = v8/4; //정수 연산의 결과는 정수
		System.out.println("result5 : " + result5);
		
		int v9 = 10;
		double result6 = v9/4.0; //double 타입으로 변환 후 연산
		System.out.println("result6 : " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10/v11; //double 타입으로 변환 후 연산
		System.out.println("result7 : " + result7);
	}

}
