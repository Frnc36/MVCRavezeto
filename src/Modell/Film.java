package Modell;
/* Ez a Model */
public class Film {

    private String cim;
    private String rendezo;
    private int ev;
    private int perc;

    public Film(String cim, String rendezo, int ev, int perc) {
        this.cim = cim;
        this.rendezo = rendezo;
        this.ev = ev;
        this.perc = perc;
    }

    public String getCim() {
        return cim;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getEv() {
        return ev;
    }

    public int getPerc() {
        return perc;
    }

    @Override
    public String toString() {
        return "Film{" + "cim=" + cim + ", rendezo=" + rendezo + ", ev=" + ev + ", perc=" + perc + '}';
    }

}//class
