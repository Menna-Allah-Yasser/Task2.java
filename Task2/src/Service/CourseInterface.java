package Service;


import Model.Teacher;
import Serviceimpl.Student;


public interface CourseInterface {

    public void setCode(String code) ;
    
    public void setName(String name) ;
    
    public void setTeacher(Teacher teacher) ;

    public String getName() ;
    public String getCode() ;

    public void getTeacherOfCourse() ;

    public void addStudentToCourse(Student student) ;

    public void showStudentsOfCourse() ;


}
