import java.util.Scanner;
public class MetodOrnekleri {

    public static int oku(int[] list,int i,int a){//Bir diziden istediğiniz elemanın indisini bulmak
        if(i>=list.length) System.exit(1);
        if(list[i]==a){ System.out.println("Aradiginiz sayinin indisi = "+i); return oku(list,++i,a); }
        return oku(list,++i,a);
    }

    public static String enbString(String[] dizi,String smax,int j,int b){//Bir dizideki en uzun stringi bulmak
        if(j>=dizi.length) return smax;
        if(b<=dizi[j].length()){
            b=dizi[j].length();
            smax=dizi[j];
            return enbString(dizi,smax,++j,b);
        }
        return enbString(dizi,smax,++j,b);
    }

    public static int toplam(int i,int last){//girilen ilk sayıdan son sayıya kadar aradaki sayıları toplamak
        if(i>=last) return i;
        return i+toplam(++i,last);
    }


    public static void yaz(int i){//isminizi istediğiniz 5 kere yazmak
        if(i>5) System.exit(1);
        System.out.println("Emre Öcel");
        yaz(++i);
    }


    public static String cevir(String yazi) {//Girdiğiniz stringi ters çevirip ekrana yazmak
        if(yazi.isEmpty())
            return yazi;
        return cevir(yazi.substring(1)) + yazi.charAt(0);
    }

    public static String sistemCevirici(int sayi){//10 luk tabandaki sayıyı 2 lik tabana çevirmek
        return Integer.toString(sayi,2);
    }

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int[] list={1,2,3,4,1,2,4,5,61,2,7,93,7};
        int i=0;
        System.out.println("Listede aramak istediginiz sayiyi giriniz :");
        int a=k.nextInt();
        System.out.println(oku(list,i,a));


       String[] dizi={"emre","ismail","muhammed","cemil","mazlum","furkan"};
        String smax=dizi[0];
        int j=0;
        int b= dizi[0].length();
        System.out.println(enbString(dizi,smax,j,b));


        int bas=1;
        int son=4;
        System.out.println(toplam(bas,son));


        yaz(1);


        String z="buralardan bir atli gecti";
        String ters=cevir(z);
        System.out.println(ters);


        String cevrilmis=sistemCevirici(50);
        System.out.println(cevrilmis);
    }
}