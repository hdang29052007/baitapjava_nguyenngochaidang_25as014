package ontap.ex2;

import java.util.ArrayList;

public class TestHinhHoc {
    public static void main(String[] args) {
        ArrayList<Hinh> ds = new ArrayList<>();

        ds.add(new HinhTron(5));
        ds.add(new HinhChuNhat(4, 6));
        ds.add(new HinhVuong(7));

        for (Hinh h : ds) {
            h.xuatThongTin();
        }

        double tongDT = 0;
        for (Hinh h : ds) {
            tongDT += h.tinhDienTich();
        }

        System.out.println("Tong dien tich tat ca cac hinh = " + tongDT);
    }
}
