
package kullanıcı.girişi;

/**
 *
 * @author ikbal
 */
import java.util.Scanner;
public class KullanıcıGirişi {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
    String kullanıcıadi,parola;
    System.out.print("Kullanıcı Adını Giriniz:");
    kullanıcıadi = scan.nextLine();
    System.out.print("Parola Giriniz:");
    parola = scan.nextLine();
    if(kullanıcıadi.equals("ikbal")&& parola.equals("123")){
        System.out.println("Başarılı Bir Şekilde Giriş Yaptınız !");
    }
    else{
        System.out.println("Kullanıcı Adınız Veya Parolanız Yanlış !");
    }
  } 
}
        
    
   
    
   

    
    
