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

    public void setChef(Varelse chef) {
        this.chef = chef;
    }

    public Varelse getUnderordnad1() {
        return underordnad1;
    }

    public void setUnderordnad1(Varelse underordnad1) {
        this.underordnad1 = underordnad1;
    }

    public Varelse getUnderordnad2() {
        return underordnad2;
    }

    public void setUnderordnad2(Varelse underordnad2) {
        this.underordnad2 = underordnad2;
    }

    public Varelse getUnderordnad3() {
        return underordnad3;
    }

    public void setUnderordnad3(Varelse underordnad3) {
        this.underordnad3 = underordnad3;
    }

    public Varelse getUnderordnad4() {
        return underordnad4;
    }

    public void setUnderordnad4(Varelse underordnad4) {
        this.underordnad4 = underordnad4;
    }

    public String getNamn(){
        return namn;
    }
}
