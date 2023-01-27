package Model;

import java.util.ArrayList;
import java.util.Vector;

public class Teacher {

    private int id;
    private String teacherName;
    private ArrayList<Course> teacherCourses = new ArrayList();

    public Teacher() {
    }

    public Teacher(int id, String teacherName, Course course) {
        this.id = id;
        this.teacherName = teacherName;
        teacherCourses.add(course);
        course.setTeacher(this);
    }

    public Teacher(int id, String teacherName, ArrayList<Course> list) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherCourses = list;
        Course course = new Course();
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

    public void setCourseOfTeacher(Course course) {
        teacherCourses.add(course);
    }

    public int getId() {
        //   System.out.print("ID of Teacher is : " );
        return id;
    }

    public String getTeacherName() {
        //  System.out.print("Name of Teacher is : ");
        return teacherName;
    }
    public void getCourses() {
        try {
            if (!teacherCourses.isEmpty()) {
                Course c = new Course();
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
