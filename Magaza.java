package magaza;
import java.util.Scanner;

public class Magaza {
        //her ay için markaların satış toplamları
        //her marka için en çok satışın gerçekleştiği ay hangisidir
        //her ay için en çok satışın gerçekleştiği marka
        //tüm ay ve tüm markalar için satış toplamı
        //5 mağaza olsun
    
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    int[][] satis=new int[5][12];
    int toplam=0;
    for(int i=0;i<5;i++){//değerleri alma
        for(int j=0;j<12;j++){
            System.out.println((i+1)+" inci magazanın "+(j+1)+" inci ayin satislari =");
            satis[i][j]=k.nextInt();
            toplam+=satis[i][j];
            
        }
    }
    
    
    int magaza1=satis[0][0],magaza2=satis[1][0],magaza3=satis[2][0],magaza4=satis[3][0],magaza5=satis[4][0];
    int enb1=0,enb2=0,enb3=0,enb4=0,enb5=0;
        for(int j=0;j<11;j++){//karşılaştırma
            if(satis[0][j]>magaza1){
                magaza1=satis[0][j];
                enb1=j;}
            if(satis[1][j]>magaza2){
                magaza2=satis[1][j];
                enb2=j;}
            if(satis[2][j]>magaza1){
                magaza1=satis[2][j];
                enb3=j;}
            if(satis[3][j]>magaza2){
                magaza2=satis[3][j]; 
                enb4=j;}
            if(satis[4][j]>magaza1){
                magaza1=satis[4][j];
                enb5=j;}
        
}
    int ay1=satis[0][0],ay2=satis[0][1],ay3=satis[0][2],ay4=satis[0][3],ay5=satis[0][4],ay6=satis[0][5];
    int ay7=satis[0][6],ay8=satis[0][7],ay9=satis[0][8],ay10=satis[0][9],ay11=satis[0][10],ay12=satis[0][11];        
    int[] enAy={ay1,ay2,ay3,ay4,ay5,ay6,ay7,ay8,ay9,ay10,ay11,ay12};
    int enSat=ay1,marka1=0,marka2=0,marka3=0,marka4=0,marka5=0,marka6=0,marka7=0,marka8=0,marka9=0,marka10=0,marka11=0,marka12=0;
    for(int i=0;i<5;i++){
        for(int j=0;j<11;j++){
        if(j==0 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka1=i;
        }
        else if(j==1 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka2=i;}
        else if(j==2 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka3=i;}
        else if(j==3 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka4=i;}
        else if(j==4 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka5=i;}
        else if(j==5 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka6=i;}
        else if(j==6 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka7=i;}
        else if(j==7 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka8=i;}
        else if(j==8 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka9=i;}
        else if(j==9 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka10=i;}
        else if(j==10 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka11=i;}
        else if(j==11 && satis[i][j]>enAy[j]){
            enAy[j]=satis[i][j];
            marka12=i;}
        
        }}
        
        System.out.println("1.ayin en cok satan magazasi = "+marka1+" 2.ayin en cok satan magazasi = "+marka2);
        System.out.println("3.ayin en cok satan magazasi = "+marka3+" 4.ayin en cok satan magazasi= "+marka4);
        System.out.println("5.ayin en cok satan magazasi = "+marka5+" 6.ayin en cok satan magazasi= "+marka6);
        System.out.println("7.ayin en cok satan magazasi = "+marka7+" 8.ayin en cok satan magazasi= "+marka8);
        System.out.println("9.ayin en cok satan magazasi = "+marka9+" 10.ayin en cok satan magazasi= "+marka10);
        System.out.println("11.ayin en cok satan magazasi = "+marka11+" 12.ayin en cok satan magazasi= "+marka12);
    System.out.println("ilk magazanin en cok satis yaptigi ayı = "+(enb1+1));
    System.out.println("ikinci magazanın en cok satis yaptigi ay = "+(enb2+1));
    System.out.println("ucuncu magazanin en cok satis yaptigi ay = "+(enb3+1));
    System.out.println("dorduncu magazanin en cok satis yaptigi ay = "+(enb4+1));
    System.out.println("besinci magazanin en cok satis yaptigi ay = "+(enb5+1));
    System.out.println("toplam satis = "+toplam);
    
    }}
