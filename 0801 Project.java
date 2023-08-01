import java.io.*;
import java.util.*;

// class Color{
//     String first;
//     String second = "Black";

//     Color(String first, String second){
//         this.first = first;
//         this.second = second;
//     }

//     Color(String first){
//         this.first = first;
//     }

//     void show(){
//         System.out.println(first+" "+second);
//     }
// }

// class Rect{
//     double width;
//     double height;

//     Rect(int width, int height){
//         this.width = width;
//         this.height = height;
//     }

//     void area(){
//         System.out.println(width*height);
//     }
// }

public class Main {
    

    public static void main(String[] args) throws Exception {
        // Rect r1 = new Rect(4,7);
        // Rect r2 = new Rect(7,9);

        // r1.area();
        // r2.area();


        
        // Color c1 = new Color("Red");
        // Color c2 = new Color("Blue","Purple");

        // c1.show();
        // c2.show();
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int[] score = new int[5];
        // int max=0, min=0, sum=0;

        // for(int i = 0; i < score.length; i++){
        //     score[i] = Integer.parseInt(st.nextToken());
        //     sum+=score[i];
        //     if(i == 0){
        //         max = score[i];
        //         min = score[i];
        //     } else if(score[i] > max) {
        //         max = score[i];
        //     } else if(score[i] < min) {
        //         min = score[i];
        //     }
        // }
        // bw.write("유효점수 : ");

        // for(int i = 0; i < score.length; i++) {
        //     if(score[i]==max||score[i]==min)continue;
        //     bw.write(String.valueOf(score[i])+" ");
        // }

        // bw.newLine();
        // bw.write("평균 : " + String.valueOf((sum-max-min)/(score.length-2)));
        // bw.flush();
        // bw.close();
        // br.close();
        
        
        
        //int [][]ary ={
        //     {43,97},
        //     {34,77,87},
        //     {100,95,38,89} };
        // int sum = 0, count = 0;
        // double avg = 0;

        // for(int i = 0; i < ary.length; i++){
        //     for(int j = 0; j < ary[i].length; j++){
        //         sum+=ary[i][j];
        //         count++;
        //     }
        // }
        // avg = (double)sum / count; 
        // System.out.printf("합 : %d\n평균 : %.1f", sum, avg);    

        
        
        // int ary[] = {6,2,8,4,9};
        // show(ary);



        // int lotto[]={4,10,25,30,45,47};
        // int my[]={1,4,7,26,45,48};
        // int r;

        // r=same(lotto,my);
        // System.out.printf("일치하는 번호의 개수:%d\n", r);
       

       
        // FileInputStream fis = new FileInputStream("test.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);
        // byte[] b = new byte[10];

        // try {
        //     int i = 0;
        //     int check;
        //     while((check=bis.read())!=-1){
                
        //         b[i]=(byte)check;
        //         i++;
        //         System.out.println(b[i]);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // bis.close();
        // fis.close();
        
        
        
        // FileOutputStream fos = new FileOutputStream("test.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // byte[] b = {4,6,7,8,-1,24};

        // try {
        //     for(int i = 0; i < b.length; i++){
        //         bos.write(b[i]);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // bos.flush();
        // bos.close();
        // fos.close();

    }   

    // public static int same(int[] a, int[] b){
    //     int count = 0;
    //     for(int i = 0; i < a.length; i++){
    //         for(int j = 0; j < b.length; j++){
    //             if(a[i] == b[j])count++;
    //         }
    //     }
    //     return count;
    // }
    
    // public static void show(int[] arr){
    //     for(int i = arr.length-1; i >= 0; i--)
    //     {
    //         System.out.println(arr[i]);
    //     }
    // }
}