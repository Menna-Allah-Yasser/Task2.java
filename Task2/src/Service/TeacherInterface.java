package Service;

import Model.Course;

public interface TeacherInterface {

    public void setId(int id);

    public void setName(String teacherName);

    public void setCourseOfTeacher(Course course);

    public int getId();

    public String getTeacherName();

    public void getCourses();

}
