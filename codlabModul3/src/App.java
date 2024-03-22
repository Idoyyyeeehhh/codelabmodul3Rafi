public class App {
    public static void main(String[] args) {
        BangunRuang tabung = new BangunRuang("Tabung");
        BangunRuang kubus = new BangunRuang("Kubus");
        BangunRuang balok = new BangunRuang("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
