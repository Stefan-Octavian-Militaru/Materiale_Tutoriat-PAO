public class Adresa {
    String strada;
    int numar;
    String bloc;

    public Adresa(String strada, int numar, String bloc) {
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
    }

    public Adresa(Adresa adresa) {
        this.strada = adresa.strada;
        this.numar = adresa.numar;
        this.bloc = adresa.bloc;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }
}
