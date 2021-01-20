import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Johan Rune
 * Date: 2021-01-15
 * Time: 14:35
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Inluppgift2 {

    private static Varelse tomten;
    private static Varelse glader;
    private static Varelse butter;
    private static Varelse tröger;
    private static Varelse trötter;
    private static Varelse blyger;
    private static Varelse skumtomten;
    private static Varelse nyckelpigan;
    private static Varelse rådjuret;
    private static Varelse haren;
    private static Varelse räven;
    private static Varelse dammråttan;
    private static Varelse gråsuggan;
    private static Varelse myran;
    private static Varelse bladlusen;

    private static Scanner sc = new Scanner(System.in);

    private static List<Varelse> tomtarna = new ArrayList<>();

    public static void main(String[] args) {
        tomtarna.add(tomten = new Varelse("Tomten", null, glader, butter, null, null));
        tomtarna.add(glader = new Varelse("Glader", tomten, tröger, trötter, blyger, null));
        tomtarna.add(butter = new Varelse("Butter", tomten, rådjuret, nyckelpigan, haren, räven));
        tomtarna.add(tröger = new Varelse("Tröger", glader));
        tomtarna.add(trötter = new Varelse("Trötter", glader, skumtomten, null, null, null));
        tomtarna.add(blyger = new Varelse("Blyger", glader));
        tomtarna.add(skumtomten = new Varelse("Skumtomten", trötter, dammråttan, null, null, null));
       tomtarna.add(dammråttan = new Varelse("Dammråttan", skumtomten));
       tomtarna.add(rådjuret = new Varelse("Rådjuret", butter));
       tomtarna.add(nyckelpigan = new Varelse("Nyckelpigan", butter));
       tomtarna.add(haren = new Varelse("Haren", butter));
       tomtarna.add(räven = new Varelse("Räven", butter, gråsuggan, myran, null, null));
       tomtarna.add(gråsuggan = new Varelse("Gråsuggan", räven));
       tomtarna.add(myran = new Varelse("Myran", räven, bladlusen, null, null, null));
       tomtarna.add(bladlusen = new Varelse("Bladlusen", myran));

        System.out.println("Vilken tomte vill du veta hierarkin för?");
        String indata = sc.nextLine();
        Varelse varelse = vilkenVarelse(indata);

        List<String> namnLista = new ArrayList();
        namnLista = hierarki(varelse, namnLista);
        for (String namn : namnLista) {
            System.out.println(namn);
        }
    }


    //rekursiv funktion
    public static List<String> hierarki(Varelse varelse, List<String> lista) {

        try {
            if (varelse.getNamn().equals("Tomten")) {
                return lista;
            }
            lista.add(0, varelse.getChef().getNamn());
            hierarki(varelse.getChef(), lista);

        } catch (NullPointerException e) {
            System.out.println("Fel inträffade");
        }
        return lista;
    }

    private static Varelse vilkenVarelse(String indata) {

          for (int i = 0; i < tomtarna.size(); i++) {
            if (indata.equalsIgnoreCase(tomtarna.get(i).getNamn()))
                return tomtarna.get(i);
        }
        return null;
    }

}