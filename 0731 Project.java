import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            while(true){
                int num = Integer.parseInt(br.readLine());
                if(num%2==0) {
                    bw.write("짝수");
                    bw.newLine();
                    bw.flush();
                } else{
                    bw.write("홀수");
                    bw.newLine();
                    bw.flush();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        bw.close();
        
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        // int num=1, sum=0;
        
        // while(num<=100){
        //     if(num%2==0||num%7==0){
        //         sb.append(num).append(" ");
        //         sum+=num;
        //     }
        //     num++;
        // }
        // sb.append("\n").append(sum);
        // bw.write(sb.toString());
        // bw.flush();
        // bw.close();



        // DataInputStream dis = null;

        // try {
        //     FileInputStream fis = new FileInputStream("h.txt");
        //     dis = new DataInputStream(fis);

        //     int intData = dis.readInt();
        //     double doubleData = dis.readDouble();
        //     boolean booleanData = dis.readBoolean();

        //     System.out.println(intData);
        //     System.out.println(doubleData);
        //     System.out.println(booleanData);

        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // dis.close();



        // DataOutputStream dos = null;

        // try {
        //     FileOutputStream fis = new FileOutputStream("h.txt");
        //     dos = new DataOutputStream(fis);

        //     dos.writeInt(1);
        //     dos.writeDouble(3.5);
        //     dos.writeBoolean(true);

        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // dos.close();

        
        // FileInputStream fileInputStream = null;
        // ByteArrayOutputStream byteArrayOutputStream = null;

        // try {
        //     fileInputStream = new FileInputStream("g.dat");
        //     byteArrayOutputStream = new ByteArrayOutputStream();

        //     int r = -1;
        //     while((r=fileInputStream.read())!=-1){
        //         byteArrayOutputStream.write(r);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // byte[] b = byteArrayOutputStream.toByteArray();
        
        // for(int i = 0; i < b.length; i++){
        //     System.out.println(String.valueOf(b[i]));
        // }

        // byteArrayOutputStream.close();
        


        // ByteArrayInputStream bais = null;
        // FileOutputStream fos = null;

        // try {
        //     byte[] b = new byte[] {1,2,3};
        //     bais = new ByteArrayInputStream(b);
        //     fos = new FileOutputStream("g.dat");

        //     int r = -1;
        //     while((r=bais.read())!=-1){
        //         fos.write(r);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // bais.close();
        // fos.close();

        

        // BufferedReader br = null;
        // PrintWriter pw = null;
        
        // try {
        //     InputStreamReader isr = new InputStreamReader(System.in);
        //     br = new BufferedReader(isr);

        //     FileWriter fw = new FileWriter("0731.txt");
        //     pw = new PrintWriter(fw);

        //     String str = null;

        //     while((str=br.readLine())!=""){
        //         pw.println(str);
        //     }

        //     br.close();
        // } catch (Exception e) {
            
        // } finally {
        //     pw.close();
        // }
    }
}