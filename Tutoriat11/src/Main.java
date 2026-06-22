import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        List<Imobil> listaAp = new ArrayList<Imobil>();
//        listaAp.add(new Imobil("Apartament", 2, 40.5, "Bucuresti"));
//        listaAp.add(new Imobil("Casa", 5, 98, "Bucuresti"));
//        listaAp.add(new Imobil("Apartament", 4, 62.8, "Constanta"));
//
//        listaAp.stream().filter(im -> im.getLocalitate().equals("Bucuresti")).
//                sorted(Comparator.comparingInt(Imobil::getNrCamere)).
//                forEach(im -> System.out.println(im));
//        listaAp.stream().map(im -> im.getLocalitate()).distinct().forEach(loc -> System.out.println(loc));
//        List<Imobil> listaAux = listaAp.stream().filter(im -> im.getSuprafata() >= 50 && im.getSuprafata() <= 100).toList();
//        for (Imobil im : listaAux) {
//            System.out.println(im);
//        }
//        System.out.println(listaAp.stream().filter(im -> im.getNrCamere() == 2).collect(Collectors.groupingBy(Imobil::getLocalitate, Collectors.counting())));


        citesteImobile c1 = new citesteImobile("imobile_1.txt");
        citesteImobile c2 = new citesteImobile("imobile_2.txt");
        c1.setLocalitate("Bucuresti");
        c2.setLocalitate("Bucuresti");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c1.getNrImobile() + c2.getNrImobile());

    }
}