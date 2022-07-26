public class yazılımcılar extends calısanlar {
    private String prgrmmng_L;

    public yazılımcılar(String isim,String soyad,int ıd,String prgrmmng_L){
        super(isim, soyad, ıd);
        this.prgrmmng_L=prgrmmng_L;
    }
    public void yDisplay(){
        System.out.println("Yazılımcının bilgileri:");
        super.display_D();
        System.out.println("Yazılımcının bildiği diller:"+prgrmmng_L);
    }
    public void formatat(String işlemci){
        System.out.println("Yazılımcı"+getIsim()+"şuan da"+işlemci+"ile çalışıyor" );
    }
}
