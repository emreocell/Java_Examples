package dateistrue;
import java.util.Scanner;

        
public class DateIsTrue {


    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
        System.out.println("Lütfen (MM/NN/YYYY) Formatında bir tarih giriniz :");
    String date=k.nextLine();
    String m="",d="",y="";
    while(true){
    if(date.length()<10 || date.length()>10){
        System.out.println("Geçersiz tarih girdiniz!");
        System.out.println("Lütfen (MM/NN/YYYY) Formatında bir tarih giriniz :");
    }
    else if(date.length()==10){
        break;
    }
    }
    for(int i=0;i<2;i++){
        m+=date.charAt(i);
    }
    for(int j=3;j<5;j++){
        d+=date.charAt(j);
    }
    for(int l=6;l<10;l++){
        y+=date.charAt(l);
    }
    int a=Integer.parseInt(m),g=Integer.parseInt(d),yil=Integer.parseInt(y);
    if(yil%4==0){
    switch(a){
        case 1:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!"); System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 2:
            if(g>29) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 3:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 4:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 5:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 6:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 7:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 8:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 9:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 10:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 11:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 12:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        default: System.out.println("Geçersiz bir tarih girdiniz!");
            
    }}
    else{
        switch(a){
        case 1:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!"); System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 2:
            if(g>28) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 3:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 4:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 5:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 6:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 7:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 8:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 9:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 10:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 11:
            if(g>30) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        case 12:
            if(g>31) System.out.println("Geçersiz bir tarih girdiniz!");System.out.println("Girdiğiniz Tarih Geçerli"); break;
        default: System.out.println("Geçersiz bir tarih girdiniz!");
            
    }
    }
    }
    
}
