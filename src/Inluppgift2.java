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
    private static Varelse inget;
    private static Varelse skumtomten;




    public static void main(String[] args) {
        tomten = new Varelse("Tomten", inget, glader, butter, null, null);
        glader = new Varelse("Glader", tomten, tröger, trötter, blyger, null);
        butter = new Varelse("Butter", tomten, null, null, null, null);
        tröger = new Varelse("Tröger", glader, null, null, null, null);
        trötter = new Varelse("Trötter", glader, null, null, null, null);
        blyger = new Varelse("Blyger", glader, null, null, null, null);
        skumtomten = new Varelse("Skumtomten", trötter, null, null, null, null);



        List<String> namnLista = new ArrayList();
        hierarki(skumtomten, namnLista);
        for (String namn: namnLista) {
            System.out.println(namn);
        }

    }

    //rekursiv funktion
    public static List<String> hierarki(Varelse varelse, List<String> lista) {

        try {
            if (varelse.getNamn().equals("tomten")) {
                return lista;
            }
            lista.add(0, varelse.getFörälder().getNamn());
            hierarki(varelse.getFörälder(), lista);

        }
        catch (NullPointerException e) {
            System.out.println("Fel inträffade");
        }
        return lista;
    }
}
