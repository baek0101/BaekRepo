import java.util.Scanner;
public class Ex2{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        int i;
        
        for(i=1; i<=t; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
        
    }
}