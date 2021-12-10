package converter;
import java.util.Scanner;

public class Converter {


    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Decimal(10) to Binary(2)");
        System.out.println("2-Decimal(10) to Hexedecimal(16)");
        System.out.println("3-Binary(2) to Decimal(10)");
        System.out.println("4-Binary(2) to Hexedecimal(16)");
        System.out.println("5-Hexedecimal(16) to Binary(2)");
        System.out.println("6-HexeDecimal(16) to Decimal(10)");
        int decimal,binary,hexe,sec;
        while(true){
            sec=k.nextInt();
            if(sec>0 && sec<7) break;
        }
        switch(sec){
            case 1:
                System.out.println("Decimal bir sayı giriniz!");
                decimal=k.nextInt();
                String dBinary=Integer.toString(decimal,2);
                System.out.println(decimal+" sayının binary karşılığı = "+dBinary); break;
            case 2:
                System.out.println("Decimal bir sayı giriniz!");
                decimal=k.nextInt();
                String dHexe=Integer.toString(decimal,16);
                System.out.println(decimal+" sayının hexedecimal karşılığı = "+dHexe); break;
            case 3:
                System.out.println("Binary bir sayı giriniz!");
                binary=k.nextInt();
                String bDecimal=Integer.toString(binary,10);
                System.out.println(binary+" sayısının decimal karşılığı = "+bDecimal); break;
            case 4:
                System.out.println("Binary bir sayı giriniz!");
                binary=k.nextInt();
                String bHexe=Integer.toString(binary,16);
                System.out.println(binary+" sayısının hexedecimal karşılığı = "+bHexe); break;
            case 5:
                System.out.println("Hexedecimal bir sayı giriniz!");
                hexe=k.nextInt();
                String hBinary=Integer.toString(hexe,2);
                System.out.println(hexe+" sayısının binary karşılığı = "+hBinary); break;
            case 6:
                System.out.println("Hexedecimal bir sayı giriniz!");
                hexe=k.nextInt();
                String hDecimal=Integer.toString(hexe,10);
                System.out.println(hexe+" sayısının decimal karşılığı = "+hDecimal); break;
            default:
                System.out.println("Geçersiz bir değer girdiniz");
                sec=k.nextInt();
        }
    }
    
}
