package sayitahmin;
import java.util.Scanner;

public class Sayitahmin {
    
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
        System.out.println("Sayı tahmin oynuna hoş geldin!");
        System.out.println("Lütfen oyunun zorluğunu seçiniz.");
        System.out.println("1-[0,10] arasındaki sayılar.(2 deneme hakkı)");
        System.out.println("2-[0,50] arasındaki sayılar. (5 deneme hakkı)");
        System.out.println("3-[0,100] arasındaki sayılar. (10 deneme hakkı)");
        int s=k.nextInt();
        int cvp,thmn,hak;
        switch(s){
            case 1:
                hak=2;
                cvp=(int) (Math.random()*10);
                System.out.println("[0,10] arasında rastgele sayı seçildi tahminini yap!");
                System.out.println(cvp);
                for(int i=1;i<=2;i++){
                    thmn=k.nextInt();
                    if(thmn==cvp){
                        System.out.println("Tebrikler kazandın doğru cevap. "+i+" denemede buldunuz.");break;
                    }
                    else{
                    hak--; 
                    System.out.println("Tekrar deneyiniz. Kalan hak = "+hak);} 
                    if(hak==0){
                        System.out.println("Oyun bitti. Kaybettin!");
                    }
                }break;
            case 2:
                hak=5;
                cvp=(int) (Math.random()*50);
                System.out.println("[0,50] arasında rastgele sayı seçildi tahminini yap!");
                System.out.println(cvp);
                for(int i=1;i<=5;i++){
                    thmn=k.nextInt();
                    if(thmn==cvp){
                        System.out.println("Tebrikler kazandın doğru cevap. "+i+" denemede buldunuz.");break;
                    }
                    else if(thmn<cvp){
                    System.out.println("Tahminin düşük kaldı yükseltmelisin.");
                    hak--; 
                    System.out.println("Tekrar deneyiniz. Kalan hak = "+hak);} 
                    else if(thmn>cvp){
                    System.out.println("Tahminin yüksek oldu alçaltmalısın.");
                    hak--;
                    System.out.println("Tekrar deneyiniz. Kalan hak = "+hak);}
                    }
                    if(hak==0){
                        System.out.println("Oyun bitti. Kaybettin!"); 
                    } break;
            case 3:
                hak=10;
                cvp=(int) (Math.random()*100);
                System.out.println("[0,100] arasında rastgele sayı seçildi tahminini yap!");
                System.out.println(cvp);
                for(int i=1;i<=10;i++){
                    thmn=k.nextInt();
                    if(thmn==cvp){
                        System.out.println("Tebrikler kazandın doğru cevap. "+i+" denemede buldunuz.");break;
                    }
                    else if(thmn<cvp){
                    System.out.println("Tahminin düşük kaldı yükseltmelisin.");
                    hak--; 
                    System.out.println("Tekrar deneyiniz. Kalan hak = "+hak);} 
                    else if(thmn>cvp){
                    System.out.println("Tahminin yüksek oldu alçaltmalısın.");
                    hak--;
                    System.out.println("Tekrar deneyiniz. Kalan hak = "+hak);}
                    }
                    if(hak==0){
                        System.out.println("Oyun bitti. Kaybettin!");} break;
            default:
                System.out.println("Geçersiz değer girdiniz!");
}   
}
}
