/**
 * Created by Johan Rune
 * Date: 2021-01-15
 * Time: 14:32
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Varelse {
    private String namn;
    private Varelse chef;
    private Varelse underordnad1;
    private Varelse underordnad2;
    private Varelse underordnad3;
    private Varelse underordnad4;

    public Varelse (String namn, Varelse chef, Varelse underordnad1, Varelse underordnad2, Varelse underordnad3, Varelse underordnad4){
        this.namn = namn;
        this.chef = chef;
        this.underordnad1 = underordnad1;
        this.underordnad2 = underordnad2;
        this.underordnad3 = underordnad3;
        this.underordnad4 = underordnad4;
    }

    public Varelse (String namn, Varelse chef){
        this.namn = namn;
        this.chef = chef;
    }

    public Varelse getChef() {
        return chef;
    }

    public String getNamn(){
        return namn;
    }
}
