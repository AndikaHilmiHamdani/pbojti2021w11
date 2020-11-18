import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;
/**
 * interfaceMain
 */
 public class interfaceMain {

    public static void main(String[] args) {
        Rektor pakRektor= new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakRektor.beriSertifikatCumlaude(mhsBiasa);
        // pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakRektor.beriSertifikatCumlaude(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}