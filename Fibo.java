package fibo;
import java.util.Scanner;
public class Fibo {


    public static int fibo(int x){    
        if(x == 0 | x== 1){
            return 1;
        }
    return fibo(x-1)+fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Fibonacci dizisinin kacinci elamanini gormek istersiniz ?");
        int x=k.nextInt();
        System.out.println(fibo(x));
        }
        
    }
    

