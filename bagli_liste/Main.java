import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);

        System.out.println("ilk elemani gir");
        linkedList a = new linkedList(k.nextInt());
        linkedList[] d=new linkedList[3];
        d[0]=a;
        linkedList tmp=a;
        int i=1;
        while (tmp!=null){
            System.out.println("eleman giriniz");
            linkedList b = a.ileri;
            linkedList c = new linkedList(k.nextInt());
            d[i]=c.ileri;
            tmp=tmp.ileri;
        }
        for(i=0;i<d.length-1;i++){
            System.out.println(d[i].icerik);
        }
    }

}