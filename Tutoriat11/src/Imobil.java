import java.util.Objects;

public class Imobil {
    String tipImobil;
    int nrCamere;
    double suprafata;
    String localitate;

    public Imobil(String tipImobil, int nrCamere, double suprafata, String localitate) {
        this.tipImobil = tipImobil;
        this.nrCamere = nrCamere;
        this.suprafata = suprafata;
        this.localitate = localitate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Imobil imobil = (Imobil) o;
        return nrCamere == imobil.nrCamere && Double.compare(suprafata, imobil.suprafata) == 0 && Objects.equals(tipImobil, imobil.tipImobil) && Objects.equals(localitate, imobil.localitate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipImobil, nrCamere, suprafata, localitate);
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "tipImobil='" + tipImobil + '\'' +
                ", nrCamere=" + nrCamere +
                ", suprafata=" + suprafata +
                ", localitate='" + localitate + '\'' +
                '}';
    }

    public String getTipImobil() {
        return tipImobil;
    }

    public void setTipImobil(String tipImobil) {
        this.tipImobil = tipImobil;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }
}
