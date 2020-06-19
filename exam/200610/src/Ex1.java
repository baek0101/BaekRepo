import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        
        for(i=1; i<=9; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}