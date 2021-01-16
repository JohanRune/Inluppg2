/**
 * Created by Johan Rune
 * Date: 2021-01-15
 * Time: 14:32
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Varelse {
    private String namn;
    private Varelse förälder;
    private Varelse barn1;
    private Varelse barn2;
    private Varelse barn3;
    private Varelse barn4;

    public Varelse (String namn, Varelse förälder, Varelse barn1, Varelse barn2, Varelse barn3, Varelse barn4){
        this.namn = namn;
        this.förälder = förälder;
        this.barn1 = barn1;
        this.barn2 = barn2;
        this.barn3 = barn3;
        this.barn4 = barn4;
    }


    public Varelse getFörälder() {
        return förälder;
    }

    public void setFörälder(Varelse förälder) {
        this.förälder = förälder;
    }

    public Varelse getBarn1() {
        return barn1;
    }

    public void setBarn1(Varelse barn1) {
        this.barn1 = barn1;
    }

    public Varelse getBarn2() {
        return barn2;
    }

    public void setBarn2(Varelse barn2) {
        this.barn2 = barn2;
    }

    public Varelse getBarn3() {
        return barn3;
    }

    public void setBarn3(Varelse barn3) {
        this.barn3 = barn3;
    }

    public Varelse getBarn4() {
        return barn4;
    }

    public void setBarn4(Varelse barn4) {
        this.barn4 = barn4;
    }

    public String getNamn(){
        return namn;
    }
}
