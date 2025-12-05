package ontap.ex1;

public class SinhVien extends Person {  // <-- 2. TÍNH KẾ THỪA: Thừa hưởng Person
    // 1. TÍNH ĐÓNG GÓI: Thuộc tính riêng của SinhVien
    private String maSV;
    private double diemTB;

    // Constructor
    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, double diemTB) {
        super(hoTen, diaChi, namSinh); // Gọi Constructor của lớp cha (Person)
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    // 3. TÍNH ĐA HÌNH (Override #1): Ghi đè phương thức trừu tượng
    @Override
    public String getLoai() {
        return "Sinh viên";
    }

    // 3. TÍNH ĐA HÌNH (Override #2): Ghi đè phương thức inThongTin để bổ sung thông tin
    @Override
    public void inThongTin() {
        super.inThongTin(); // Gọi phương thức của lớp cha để in thông tin chung
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("-------------------------");
    }
    // ... (Getter/Setter cho maSV và diemTB)
}