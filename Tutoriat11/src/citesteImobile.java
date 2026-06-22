import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class citesteImobile implements Runnable{
    private String fisier;
    private String localitate;
    private int nrImobile;

	public citesteImobile(String fisier){
        this.fisier = fisier;
        nrImobile = -1;
        localitate =  "";
    }
    public void setLocalitate(String localitate){
        this.localitate = localitate;
    }
    public int getNrImobile(){
        return nrImobile;
    }
    public void numaraImobile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fisier));
        int counter = 0;
        while(br.ready()){
            String linie = br.readLine();
            String localitate = linie.split(",")[3];
            if(localitate.equals(this.localitate)){
                counter += 1;
            }
        }
        this.nrImobile = counter;
    }
    public void run(){
        try {
            numaraImobile();
            System.out.println("Imobilele din fisierul " + fisier + " au fost contorizate.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

