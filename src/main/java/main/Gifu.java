package main;

import java.util.ArrayList;

public class Gifu {
    protected String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Enrollment> enrollments = new ArrayList<>();

    public Gifu(String name){
        this.name=name;
    }


    public void addCourse(Course course){
        courses.add(course);
        return;
    }

    public void listCourses(){
        int i=0;
        for(Course course:courses){
            System.out.println(i+") "+course.Id+" "+course.name);
            i++;
        }
    }
    public void addStudent(Student student){
        students.add(student);
        return;
    }
    public void listStudents(){
        int j=0;
        for(Student student:students){
            System.out.println(j+") "+student.Id+" "+student.name);
            j++;
        }
    }

    
}
