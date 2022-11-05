package randompassword;
import java.util.Random;
import java.util.Scanner;

public class RandomPassword {//min 8 max 16 digit password creator 


    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);    
    Random rand=new Random();
    String s="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuopasdfghjklizxcvbnm1234567890";
    String password="",str;
        System.out.println("Şifre hanenizi kendiniz belirlemek ister misiniz?");
        System.out.println("Eğer belirlemek istiyorsanız sadece evet yazınız");
        System.out.println("Would you like to set your password yourself?");
        System.out.println("If you want to determine, write only yes.");
    str=k.next().toLowerCase();
    int i=1;
    if(str.equals("evet") || str.equals("yes")){
        System.out.println("Kaç haneli şifre istersiniz ?");
        System.out.println("(min 8 max 16 hane)");
        System.out.println("How many digit password do you want?");
        System.out.println("(min 8 max 16 digit)");
        int sw=k.nextInt(),t;
        switch(sw){
        case 8:
            while(i<=8){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 9:
            while(i<=9){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 10:
            while(i<=10){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 11:
            while(i<=11){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 12:
            while(i<=12){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 13:
            while(i<=13){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 14:
            while(i<=14){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 15:
            while(i<=15){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 16:
            while(i<=16){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        default:
            System.out.println("Geçersiz bir sayı girdiniz. You entered an invalid number.");
    }
    }
    else{
        int max=17,min=8;
        int sw=rand.nextInt(max-min)+min,t; 
        switch(sw){
        case 8:
            while(i<=8){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 9:
            while(i<=9){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 10:
            while(i<=10){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 11:
            while(i<=11){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 12:
            while(i<=12){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 13:
            while(i<=13){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 14:
            while(i<=14){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 15:
            while(i<=15){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        case 16:
            while(i<=16){
        t=rand.nextInt(61);
        password+=s.charAt(t); i++;
    }   break;
        default:
            System.out.println("Geçersiz bir sayı girdiniz. You entered an invalid number.");
    }
    }  
        System.out.println("Şifreniz : "+password);
        System.out.println("Your Password : "+password);
    }
    
}
