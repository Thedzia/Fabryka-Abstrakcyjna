public class GumoweZabawkiFabryka implements FabrykaZabawek {
    public Lalka stworzLalke() {
        return new GumowaLalka();
    }

    public Samochodzik stworzSamochodzik() {
        return new GumowySamochodzik();
    }

    public Klocki stworzKlocki() {
        return new GumoweKlocki();
    }
}
