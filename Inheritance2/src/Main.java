import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Çalışanlar programına hoş geldiniz.\n" +
                "Yazılımcı işlemleri için 1'e basın.\n" +
                "Yonetici işlemleri için 2'ye basın.\n" +
                "Çıkış için Q' ya basın.");
        while(true){
            System.out.print("Bir işlem tuşlayın:");
            String islem=sc.nextLine();
            if(islem.equals("Q")){
                System.out.println("Çıkış yapılıyor..");
                return;
            }
            else if(islem.equals("1")){
                yazılımcılar yazılımcı1= new yazılımcılar("Zeynep","Vural",4545,"Java,Python,C#");
                System.out.println("Yazılımcı işlemleri:\n" +
                        "Yazılımcının bilgileri için 1'e:\n" +
                        "Format atmak için 2'ye\n" +
                        "Çıkış yapmak için: Q");
                while(true){
                    System.out.print("Bir yazılımcı işlemi tuşlayın:");
                    String islm=sc.nextLine();
                    if(islm.equals("Q")){
                        System.out.println("Çıkış yapılıyor..");
                        break;
                    }
                    else if(islm.equals("1")){
                        System.out.println("Yazılımcının bilgileri gösteriliyor");
                        yazılımcı1.yDisplay();
                    }
                    else if(islm.equals("2")){
                        yazılımcı1.formatat("Linux");
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    }
                }
            }
            else if(islem.equals("2")){
                yoneticiler yonetici1=new yoneticiler("Erman","X",67890,40);
                System.out.println("Yonetici işlemleri:\n" +
                        "Yonetici bilgileri için 1'e\n" +
                        "Zam miktarı belirlemek için 2'yi tuşlayınız.\n" +
                        "Çıkış yapmak için Q ");
                while(true){
                    System.out.println("Bir yönetici işlemi seçiniz:");
                    String isl=sc.nextLine();
                    if(isl.equals("Q")){
                        System.out.println("Çıkış yapılıyor..");
                        break;
                    }
                    else if(isl.equals("1")){
                        System.out.println("Yönetici bilgileri:");
                        yonetici1.display_D();
                    }
                    else if(isl.equals("2")){
                        System.out.println("Zam miktarı:");
                        int zammiktarı=sc.nextInt();
                        yonetici1.zam(zammiktarı);
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    }
                }
            }
            else{
                System.out.println("Geçersiz işlem..");
            }
        }
    }
}