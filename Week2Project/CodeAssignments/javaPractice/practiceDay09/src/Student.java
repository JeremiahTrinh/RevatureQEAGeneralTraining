public class Student {
    String name; // Instance variable
    static int countOfStudents; // Static variable

    public Student(String name) {
        this.name = name;
        countOfStudents++;
    }

    public static void main(String[] args) {
        Student s1 = new Student("William");
        System.out.println(s1.countOfStudents);
        Student s2 = new Student("Gabe");
        System.out.println(s2.countOfStudents);
        System.out.println("-------------------");
        System.out.println(Student.countOfStudents);
    }
}
