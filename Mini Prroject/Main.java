import java util.*;
abstract class Person {
  private Sring nae;
  private int age;
  pblic Person(String name,int age) {
    if(age<=0)
      throw new IllegalArgumentException("Invalid Age");
    this.age=age;
    this.name=name;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public abstract void displayInfo();
}
class Student extends Person{
  private int studentId;
  private List<Course> courses;
  public Student(String name, int age, int studentId) {
    super(name, age);
    this.studentId = studentId;
    this.courses = new ArrayList<>();
  }
  public int getStudentId() { 
    return studentId; 
  }
  public void enrollCourse(Course course) {
    if (!courses.contains(course)) {
      courses.add(course);
    }
  }
  public List<Course> getCourses() {
    return courses;
  }
  @Override
  public void displayInfo() { 
    System.out.println("Student: " + getName() + ", ID: " + studentId);
  }
}
class Teacher extends Person {
  private String subject;
  public Teacher(String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
  }
  @Override
  public void displayInfo() {
    System.out.println("Teacher: " + getName() + ", Subject: " + subject);
  }
}
class Course {
  private String courseId;
  private String courseName;
  public Course(String courseId, String courseName) {
    if (courseId.isEmpty()) throw new IllegalArgumentException("Invalid Course ID");
    this.courseId = courseId;
    this.courseName = courseName;
  } 
  public String getCourseId() {
      return courseId; 
  }
  public String getCourseName() { 
      return courseName; 
  }
}
class Enrollment {
    private Student student;
    private Course course;
    private double marks;
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
    public void assignMarks(double marks) {
        if (marks < 0 || marks > 100)
            throw new IllegalArgumentException("Marks must be 0-100");
        this.marks = marks;
    }
    public void display() {
        System.out.println(student.getName() + " enrolled in " + course.getCourseName()
                + " | Marks: " + marks);
    }
}
class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();
    public void addStudent(Student s) {
        students.add(s);
    }
    public void addCourse(Course c) {
        courses.add(c);
    }
    public void enrollStudent(Student s, Course c) {
        s.enrollCourse(c);
        Enrollment e = new Enrollment(s, c);
        enrollments.add(e);
    }
    public void assignMarks(Student s, Course c, double marks) {
        for(Enrollment e:enrollments) {
            if (e!=null && e.toString().contains(s.getName())
                && e.toString().contains(c.getCourseName())) {
                e.assignMarks(marks);
            }
        }
    }
    public void displayAll() {
        for(Enrollment e:enrollments) {
            e.display();
        }
    }
}

