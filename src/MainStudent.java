import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Анатолий", 25, 4));
        students.add(new Student("Василий", 30, 6));
        students.add(new Student("Мария", 28, 9));
        students.add(new Student("Татьяна", 46, 10));
        students.add(new Student("Сергей", 18, 7));

        Student maxGradeStudent = findMaxGradeStudent(students);
        System.out.println("Студент " + maxGradeStudent.getName() +
                " имеет максимальную оценку : " + maxGradeStudent.getGrade());
    }

    private static Student findMaxGradeStudent(ArrayList<Student> students) {
        Student maxGradeStudent = students.get(0);

        for (Student student : students) {
            if (student.getGrade() > maxGradeStudent.getGrade()) {
                maxGradeStudent = student;
            }
        }
        return maxGradeStudent;
    }
}


