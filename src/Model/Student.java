package Model;

import java.util.Scanner;

public class Student {
   private int studentId;
    String studentName;
    int age;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   public Student() {

    }


    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }


    public void display() {
        System.out.println("Id:" + studentId);
        System.out.println("tên:" + studentName);
        System.out.println("Tuổi:" + age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//        return this.studentId.compareTo(o.studentId);
//    }
}
