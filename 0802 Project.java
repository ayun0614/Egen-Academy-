import java.io.*;
import java.util.*;

// class Book{
//     String title;
//     String author;
//     int isbn;

//     Book(String title, String author, int isbn){
//         this.title = title;
//         this.author = author;
//         this.isbn = isbn;
//     }
//     Book(String title, int isbn){
//         this(title, "tom", isbn);
//     }
//     Book(){
//         this(null,null,0);
//     }
//     void show(){
//         System.out.println(title+" "+author+" "+isbn);
//     }
// }

// class Rectangle{
//     public double width;
//     public double height;

//     public double area(){
//         return width*height;
//     }
// }

public class Main {
    public static void main(String[] args) throws Exception {
        // FileReader fr = new FileReader("test02.txt");
        // StringBuilder sb = new StringBuilder();
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // int ch = 0;

        // try {
        //     while(true){
        //         ch = fr.read();
        //         if(ch==-1)break;
        //         sb.append((char)ch);
        //     }
        // } catch (Exception e) {

        // }

        // bw.write(sb.toString());
        // bw.flush();
        // bw.close();
        // fr.close();

        // FileWriter fw = new FileWriter("test01.txt");
        // String[] strings = new String[]
        // {"Hi",
        // "저는 자바를 좋아하고 잘합니다.",
        // "앞으로 더 열심히 공부할 것입니다."};

        // for(int i = 0; i < strings.length; i++){
        //     fw.append(strings[i]);
        //     fw.append('\n');
        // }
        // fw.flush();
        // fw.close();
        
        
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // double sum = 0;
        // int count = 0;
        // while(true){
        //     double num = Double.parseDouble(br.readLine());
        //     if(num==-1)break;
        //     sum+=num;
        //     count++;
        // }
        // bw.write(String.valueOf(sum/count));
        // bw.flush();
        // bw.close();
        // br.close();
        
        
        
        // Book b1 = new Book("java","홍길동",3333);
        // Book b2 = new Book("java",4444);
        // Book b3 = new Book();

        // b1.show();
        // b2.show();
        // b3.show();
    }
}