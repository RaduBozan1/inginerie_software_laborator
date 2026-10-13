public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        Clasa c1 = new Clasa(NumarClasa.I, 'A', 30);
        Clasa c2 = new Clasa(NumarClasa.II, 'B', 25);

        scoala.adaugaClasa("1A", c1);
        scoala.adaugaClasa("2B", c2);

        scoala.adaugaElevInClasa("1A", new Elev("Andrei", Gen.Masculin));
        scoala.adaugaElevInClasa("1A", new Elev("Maria", Gen.Feminin));
        scoala.adaugaElevInClasa("2B", new Elev("Alex", Gen.Nespecificat));

        System.out.println("Clase: " + scoala.getNumarClase());
        System.out.println("Elevi: " + scoala.getTotalElevi());

        scoala.eliminaElevDupaNume("Maria");
        scoala.eliminaClasa("2B");

        System.out.println("Elevi ramasi: " + scoala.getTotalElevi());
    }
}