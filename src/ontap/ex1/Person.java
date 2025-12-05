package ontap.ex1;

public abstract class Person {
    // 1. TÍNH ĐÓNG GÓI (Encapsulation): Tất cả thuộc tính đều là private
    private String hoTen;
    private String diaChi;
    private int namSinh;

    // Constructor đầy đủ tham số
    public Person(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    // 1. TÍNH ĐÓNG GÓI (Encapsulation): Cung cấp Getter/Setter public để truy cập dữ liệu private
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    // ... (Các Getter/Setter khác)

    // 4. TÍNH TRỪU TƯỢNG (Abstract Method): Khai báo phương thức mà không có thân, buộc lớp con phải triển khai
    public abstract String getLoai();

    // Phương thức triển khai mặc định
    public void inThongTin() {
        System.out.println("--- Thông tin chung ---");
        System.out.println("Loại: " + getLoai()); // <-- 3. TÍNH ĐA HÌNH (Sử dụng kết quả ghi đè của lớp con)
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Địa Chỉ: " + diaChi);
        System.out.println("Năm Sinh: " + namSinh);
    }
}
