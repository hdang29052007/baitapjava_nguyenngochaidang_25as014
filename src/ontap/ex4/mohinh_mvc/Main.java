package ontap.ex4.mohinh_mvc;

public class Main {
    public static void main(String[] args) {
        // Tạo Model
        Student student = new Student("Nguyen Van A", 20);

        // Tạo View
        StudentView view = new StudentView();

        // Tạo Controller
        StudentController controller = new StudentController(student, view);

        // Hiển thị thông tin
        controller.updateView();
    }
}
