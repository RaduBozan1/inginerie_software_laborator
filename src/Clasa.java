import java.util.ArrayList;
import java.util.List;

public class Clasa {
    private int capacitate;
    private NumarClasa numar;
    private char litera;
    private List<Elev> elevi;

    public Clasa(NumarClasa numar, char litera, int capacitate) {
        this.numar = numar;
        this.litera = litera;
        this.capacitate = capacitate;
        this.elevi = new ArrayList<>();
    }

    public void adaugaElev(Elev elev) {
        if (elevi.size() < capacitate) {
            elevi.add(elev);
        } else {
            System.out.println("Clasa " + numar + litera + " a atins capacitatea maximă!");
        }
    }

    public void eliminaElev(Elev elev) {
        elevi.remove(elev);
    }

    public int getTotalElevi() {
        return elevi.size();
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public NumarClasa getNumar() {
        return numar;
    }

    public void setNumar(NumarClasa numar) {
        this.numar = numar;
    }

    public char getLitera() {
        return litera;
    }

    public void setLitera(char litera) {
        this.litera = litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }
}