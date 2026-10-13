import java.util.HashMap;
import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        this.clase = new HashMap<>();
    }

    public void adaugaClasa(String cheie, Clasa clasa) {
        clase.put(cheie, clasa);
    }

    public void eliminaClasa(String cheie) {
        clase.remove(cheie);
    }

    public void adaugaElevInClasa(String cheieClasa, Elev elev) {
        Clasa clasa = clase.get(cheieClasa);
        if (clasa != null) {
            clasa.adaugaElev(elev);
        } else {
            System.out.println("Clasa " + cheieClasa + " nu există!");
        }
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa clasa : clase.values()) {
            Elev elevDeEliminat = null;
            for (Elev elev : clasa.getElevi()) {
                if (elev.getNume().equalsIgnoreCase(nume)) {
                    elevDeEliminat = elev;
                    break;
                }
            }
            if (elevDeEliminat != null) {
                clasa.eliminaElev(elevDeEliminat);
                System.out.println("Elevul " + nume + " a fost eliminat.");
                return;
            }
        }
        System.out.println("Elevul " + nume + " nu a fost găsit în nicio clasă.");
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }

    public Map<String, Clasa> getClase() {
        return clase;
    }
}