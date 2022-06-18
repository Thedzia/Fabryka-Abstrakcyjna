public class Fabryka {
    public static FabrykaZabawek getTypZabawek(String typZabawek) {
        switch (typZabawek) {
            case "Plastikowe":
                return new PlastikoweZabawkiFabryka();
            case "Gumowe":
                return new GumoweZabawkiFabryka();
            default:
                return null;

        }
    }

    public static void main(String[] args) {
        FabrykaZabawek PlastikoweZabawkiFabryka = getTypZabawek("Plastikowe");
        Lalka PlastikowaLalka = PlastikoweZabawkiFabryka.getWielkosc();
        System.out.println(" Wielkość Plastikowej lalki wynosi: " + PlastikowaLalka.getWielkosc());

    }
}
