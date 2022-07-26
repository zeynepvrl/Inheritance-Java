public class calısanlar {
    private String isim;
    private String soyad;
    private int ıd;

    public calısanlar(String isim, String soyad, int ıd){
        this.isim=isim;
        this.soyad=soyad;
        this.ıd=ıd;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }
    public void setİSim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }

    public void display_D(){
        System.out.println("Çalışanın ismi:"+isim);
        System.out.println("Çalışanın soyadı:"+soyad);
        System.out.println("ID:"+ıd);
    }
}

