public class PlastikoweZabawkiFabryka implements FabrykaZabawek {
    public Lalka stworzLalke() {
        return new PlastikowaLalka();
    }

    public Samochodzik stworzSamochodzik() {
        return new PlastikowySamochodzik();
    }

    public Klocki stworzKlocki() {
        return new PlastikoweKlocki();
    }
}
