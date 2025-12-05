package ontap.ex2;

public abstract class Hinh implements IHinhHoc {
    private String tenHinh;

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    public String getTenHinh() {
        return tenHinh;
    }
    public void xuatThongTin() {
        System.out.println("Hinh: " + tenHinh
                + " | Chu vi = " + tinhChuVi()
                + " | Dien tich = " + tinhDienTich());
    }
}