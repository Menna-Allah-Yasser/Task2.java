package Service;

import Model.Course;
import java.util.ArrayList;

public interface StudentInterface {

    public String getName();

    public String getId();

    public void getCoursesOfStudent();

    public void setId(String id);

    public void setName(String name);

    public void setCourseToStudent(Course course);

    public void setCourseToStudent(ArrayList<Course> list);
}
