import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int i = 0, sum = 0;
        do{
			i++;
            if(i%2!=0) sum += i;
			else continue;
        }while(i<10);

        System.out.println(sum);
        // Scanner scan = new Scanner(System.in);

        // int number = 18, cycle = 0;
        // boolean answer = false;
        // while(!answer)
        // {
        //     System.out.print("숫자 입력 : ");
        //     int input = scan.nextInt();
        //     cycle++;
        //     if(number>input){
        //         System.out.println(input+"보다 크다.");
        //     }else if(number<input){
        //         System.out.println(input+"보다 작다.");
        //     }else{
        //         System.out.println("정답입니다.");
        //         break;
        //     }
        // }
        // System.out.println("시도한 횟수는 "+cycle+"입니다.");

        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int i = 0, sum = 0;
        // while(i<=100){
        //     i++;
        //     if(i%5==0) sum+=i;
        // }
        // System.out.println(sum);

        
        // for(int i = 5; i <= 9; i++){
        //     for(int j = 1; j <= 9; j++){
        //         System.out.print(i*j+" ");
        //     }
        //     System.out.println();
        // }
        
        // Scanner scan = new Scanner(System.in);

        // double money = 100000;
        // int time, amount;
        // System.out.print("시간과 개수 : ");
        // time = scan.nextInt();
        // amount = scan.nextInt();

        // if(time==20&&amount<=10){
        //     System.out.println(money*0.8);
        // }else if(time==18&&amount<=5){
        //     System.out.println(money*0.9);
        // }else if(time==14&&amount<=3){
        //     System.out.println(money*0.95);
        // }
        
        
        // Scanner scan = new Scanner(System.in);

        // int math, korean;
        // System.out.print("두 과목의 점수 : ");
        // math = scan.nextInt();
        // korean = scan.nextInt();
        // System.out.printf("평균 : %.1f", (double)(math+korean)/2);
    }
}
