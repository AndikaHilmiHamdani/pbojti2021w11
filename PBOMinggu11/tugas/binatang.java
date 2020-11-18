/**
 * binatang
 */
public class binatang {

    protected String nama;
    protected int jmlKaki;

    public binatang(String nama, int jmlKaki) {
        this.setNama(nama);
        this.setJmlKaki(jmlKaki);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void displayBinatang(){
        System.out.println("Nama Binatang   : " + this.getNama());
        System.out.println("Jumlah Kaki     : " + this.getJmlKaki());
    }
}