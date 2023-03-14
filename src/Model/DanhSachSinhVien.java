package Model;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
private ArrayList<Student>danhSach;

    public DanhSachSinhVien( ArrayList<Student>danhSach) {
        this.danhSach=danhSach;
    }
    public DanhSachSinhVien() {
        this.danhSach=new ArrayList<Student>();
    }

    public void addStudent(Student student){
this.danhSach.add(student);
    }
    public void display(){
        for (Student student:danhSach
             ) {
            System.out.println(student);
        }
    }
    public void deleteStudent(int i){
        for (int j=0;j<danhSach.size();j++){
            if (j==i){
                danhSach.remove(j);
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "DanhSachSinhVien{" +
                "danhSach=" + danhSach +
                '}';
    }

}
