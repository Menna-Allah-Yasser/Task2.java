package Serviceimpl;

import Service.TeacherInterface;
import java.util.ArrayList;


public class Teacher implements TeacherInterface {

    private int id;
    private String teacherName;
    private ArrayList<Model.Course> teacherCourses = new ArrayList();

    public Teacher() {
    }

    public Teacher(int id, String teacherName, Model.Course course) {
        this.id = id;
        this.teacherName = teacherName;
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Model.Course> list) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherCourses = list;
        Model.Course course = new Model.Course();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            course.setTeacher(this);
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setCourseOfTeacher(Model.Course course) {
        teacherCourses.add(course);
    }

    @Override
    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    @Override
    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }
    @Override
    public void getCourses() {
        try {
            if (!teacherCourses.isEmpty()) {
                Model.Course c = new Model.Course();
                System.out.println("           ID    Name");
                for (int i = 0; i < teacherCourses.size(); i++) {
                    c = teacherCourses.get(i);
                    System.out.println("Course #" + ++i + " : " + c.getCode() + "      " + c.getName());
                    i--;

                }
                System.out.println();
            } else {
                System.out.println("There is no Courses ");
            }
        } catch (NullPointerException ex) {
            System.out.println("Exception ");
        }
    }


}
