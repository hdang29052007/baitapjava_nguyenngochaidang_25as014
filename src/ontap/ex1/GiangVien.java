package ontap.ex1;

public class GiangVien extends Person { // <-- 2. TÍNH KẾ THỪA: Thừa hưởng Person

    // 1. TÍNH ĐÓNG GÓI: Thuộc tính riêng của GiangVien
    private String maGV;
    private double luongThang;

    // Constructor
    public GiangVien(String hoTen, String diaChi, int namSinh, String maGV, double luongThang) {
        super(hoTen, diaChi, namSinh); // Gọi Constructor của lớp cha (Person)
        this.maGV = maGV;
        this.luongThang = luongThang;
    }

    // 3. TÍNH ĐA HÌNH (Override #1): Ghi đè phương thức trừu tượng
    @Override
    public String getLoai() {
        return "Giảng viên";
    }

    // 3. TÍNH ĐA HÌNH (Override #2): Ghi đè phương thức inThongTin để bổ sung thông tin
    @Override
    public void inThongTin() {
        super.inThongTin(); // Gọi phương thức của lớp cha để in thông tin chung
        System.out.println("Mã GV: " + maGV);
        System.out.println("Lương Tháng: " + luongThang + " VND");
        System.out.println("-------------------------");
    }

    // ... (Getter/Setter cho maGV và luongThang)
}
