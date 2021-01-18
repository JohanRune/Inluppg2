import java.util.ArrayList;
import java.util.List;

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



    public static void main(String[] args) {
        tomten = new Varelse("Tomten", null, glader, butter, null, null);
        glader = new Varelse("Glader", tomten, tröger, trötter, blyger, null);
        butter = new Varelse("Butter", tomten, rådjuret, nyckelpigan, haren, räven);
        tröger = new Varelse("Tröger", glader);
        trötter = new Varelse("Trötter", glader, skumtomten, null, null, null);
        blyger = new Varelse("Blyger", glader);
        skumtomten = new Varelse("Skumtomten", trötter, dammråttan, null, null, null);
        dammråttan = new Varelse("Dammråttan", skumtomten);
        rådjuret = new Varelse("Rådjuret", trötter);
        nyckelpigan = new Varelse("Nyckelpigan", trötter);
        haren = new Varelse("Haren", trötter);
        räven = new Varelse("Räven", trötter, gråsuggan, myran, null, null);
        gråsuggan = new Varelse("Gråsuggan", räven);
        myran = new Varelse("Myran", räven, bladlusen, null, null, null);
        bladlusen = new Varelse("Bladlusen", myran);


        List<String> namnLista = new ArrayList();
        namnLista= hierarki(bladlusen, namnLista);
        for (String namn: namnLista) {
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

        }
        catch (NullPointerException e) {
            System.out.println("Fel inträffade");
        }
        return lista;
    }
}