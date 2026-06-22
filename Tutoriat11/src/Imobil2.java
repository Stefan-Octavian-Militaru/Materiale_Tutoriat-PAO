import java.util.ArrayList;
import java.util.List;

public final class Imobil2 {
    private final Adresa adresa;
    private final int nrLocatari;
    private final List<StringBuilder> locatari;

    public Imobil2(Adresa adresa, int nrLocatari, List<StringBuilder> locatari){
        this.adresa = new Adresa(adresa);
        this.nrLocatari = nrLocatari;
        this.locatari = new ArrayList<StringBuilder>();
        for(StringBuilder sb : locatari){
            this.locatari.add(new StringBuilder(sb.toString()));
        }
    }
    public Adresa getAdresa(){
        return new Adresa(adresa);
    }
    public int getNrLocatari(){
        return nrLocatari;
    }
    public List<StringBuilder> getLocatari(){
        List<StringBuilder> listAux = new ArrayList<StringBuilder>();
        for(StringBuilder sb : locatari){
            listAux.add(new StringBuilder(sb.toString()));
        }
        return listAux;
    }
}
