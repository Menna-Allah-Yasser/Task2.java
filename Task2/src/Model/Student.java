package Model;


import java.util.ArrayList;

class Student {

    private String id;
    private String name;
    private ArrayList<Course> studentCourses= new ArrayList();

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, ArrayList<Course> list) {
        this.id = id;
        this.name = name;
        this.studentCourses = list;
        Course c = new Course();
        for (int i = 0; i < list.size(); i++) {
            c = list.get(i);
            c.addStudentToCourse(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void getCoursesOfStudent() {
        try {
            if (!studentCourses.isEmpty()) {
                System.out.println("Student with id : " + this.getId()
                        + "  and name : " + this.getName() + " has " + studentCourses.size() + " courses");
                Course course = new Course();
                for (int i = 0; i < studentCourses.size(); i++) {
                    course = studentCourses.get(i);
                    System.out.println("Course #" + ++i + " : " + course.getCode()
                            + "      " + course.getName());
                    i--;
                }
            }
        } catch (Exception ex) {
            System.out.println("ex");
        }
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setCourseToStudent(Course course) {
        studentCourses.add(course);
        course.addStudentToCourse(this);
    }

    public void setCourseToStudent(ArrayList<Course> list) {
        Course course = new Course();
        for (int i = 0; i < list.size(); i++) {
            course = list.get(i);
            this.studentCourses.add(course);
            course.addStudentToCourse(this);
        }

    }
}
