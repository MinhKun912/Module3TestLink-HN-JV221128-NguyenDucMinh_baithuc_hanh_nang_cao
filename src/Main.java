import Model.DanhSachSinhVien;
import Model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("Menu : \n"
                    + "1: Create Student \n"
                    + "2: Display Student \n"
                    + "3: Update Student \n"
                    + "4: Delete Student \n"
                    + "5: Sort Student by Age ASC(Tăng dần) \n"
                    + "6: Exit "
            );
            System.out.println(" Nhập sự lựa chọn của bạn! ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Nhập sinh viên ID");
                    int studentId = scanner.nextInt();
                    System.out.println("Nhập tên sinh viên ");
                    scanner.nextLine();
                    String studentName = scanner.nextLine();
                    System.out.println("Nhập tuổi sinh viên");
                    int age = scanner.nextInt();
                    Student sv = new Student(studentId, studentName, age);
                    dssv.addStudent(sv);
                    break;
                case 2:
                    dssv.display();
                    break;
                case 3:
                    System.out.println("Chức năng đang update");
                    break;
                case 4:
                    System.out.println("Nhập index Studen muốn xóa");
                  dssv.deleteStudent(scanner.nextInt());
                    break;
            }
        }


    }

}
