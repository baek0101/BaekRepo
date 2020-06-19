import java.util.*;
import java.io.*;

public class Ex6{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for (int a = n; a >= 1; a--){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
    }
}