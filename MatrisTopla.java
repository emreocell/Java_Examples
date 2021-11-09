package matristopla;
import java.util.Scanner;

public class MatrisTopla {

public static int[][] matrisTopla(int[][] a,int[][] b,int[][] topla,int m,int n){
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            topla[i][j]=a[i][j]+b[i][j];
    }
}
    return topla;
}    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Matrisin büyüklüğünü belirleyiniz (m*n) :");
        int m=k.nextInt(),n=k.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("1. matrisin "+i+". sutun"+j+". satır indisinin değerini atayınız :");
                a[i][j]=k.nextInt();
            }
        }
        int[][] b=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("2. matrisin "+i+". sutun"+j+". satır indisinin değerini atayınız :");
                b[i][j]=k.nextInt();
            }
        }
        int[][] topla=new int[m][n];
        int[][] ekran=matrisTopla(a,b,topla,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("1. ve 2. matrisin toplamı olan matrisin "+i+". satır "+j+". sutun değeri =");
                System.out.println(ekran[i][j]);  
            }
        }
        
        
}
}
