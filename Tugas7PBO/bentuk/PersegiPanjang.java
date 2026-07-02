package bentuk;

public class PersegiPanjang extends Bentuk {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("PersegiPanjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}