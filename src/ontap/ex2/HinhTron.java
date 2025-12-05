package ontap.ex2;

class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron(double banKinh) {
        super("Hinh Tron");
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
