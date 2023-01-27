package Serviceimpl;

import Service.CourseInterface;
import java.util.ArrayList;


public class Course implements CourseInterface {

    private String code;
    private String name;
    private Model.Teacher teacher = new Model.Teacher();
    private ArrayList<Model.Student> list = new ArrayList();

    public void addStudentToCourse(Model.Student student) {
        list.add(student);
    }

    public void showStudentsOfCourse() {
        try {
            if (!list.isEmpty()) {
                System.out.println("Students who registered in this Course : ");
                System.out.println("Id          Name");
                Model.Student s = new Model.Student();
                for (int i = 0; i < list.size(); i++) {
                    s = list.get(i);
                    System.out.println(s.getId() + "          " + s.getName());
                }
            }
        } catch (Exception ex) {
            System.out.println("EX");
        }
    }

    public Course() {
    }

    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    Course(String code, String name, Model.Teacher teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.teacher.setCourseOfTeacher(this);
    }

    public void setTeacher(Model.Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        //System.out.println("Name of course is : " );
        return name;
    }

    public String getCode() {
        // System.out.println("Code of course is : " );
        return code;
    }

    public void getTeacherOfCourse() {
        System.out.println("Name of Teacher is : " + teacher.getTeacherName());
    }

}
