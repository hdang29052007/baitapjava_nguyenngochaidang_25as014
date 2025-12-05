package ontap.ex1;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng
        SinhVien sv = new SinhVien("Nguyễn Văn A", "Đường B", 2003, "SV001", 8.5);
        GiangVien gv = new GiangVien("Trần Thị B", "Phố Y", 1980, "GV010", 15000000.0);

        // Gọi phương thức: Thể hiện TÍNH ĐA HÌNH (Mặc dù cùng gọi inThongTin(),
        // nhưng mỗi đối tượng lại in ra định dạng khác nhau)
        sv.inThongTin();
        gv.inThongTin();
    }
}
