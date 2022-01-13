package sinav;
import java.util.Scanner;
public class stringTersCevir {

    static String cevrilmis="";

    public static String tersCevir(String s,int b){
        if(b<=0) return cevrilmis;
        cevrilmis+=s.charAt(b-1);
        return tersCevir(s,--b);
    }
    public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
    String s=k.next();
    int uzunluk=s.length();
    System.out.println(tersCevir(s,uzunluk));
    }
}
