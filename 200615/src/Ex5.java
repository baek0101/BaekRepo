import java.util.*;
import java.io.*;

public class Ex5{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for (int a = 1; a <= n; a++){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
    }
}