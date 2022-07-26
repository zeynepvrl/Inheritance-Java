public class yoneticiler extends calısanlar{
    private int Rpersons;

    public yoneticiler(String isim, String soyad, int ıd, int rpersons) {
        super(isim, soyad, ıd);
        Rpersons = rpersons;
    }

    public void display_D(String isim, String soyad, int ıd,int Rpersons) {
        super.display_D();
        System.out.println("Sorumlu olduğu kişi sayısı:"+Rpersons);
    }
    public void zam(int miktar){
        System.out.println(getIsim()+" "+miktar+"TL zam yaptı.");
    }
}
