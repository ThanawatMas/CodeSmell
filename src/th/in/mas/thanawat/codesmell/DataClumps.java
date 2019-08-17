package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

import java.util.ArrayList;

public class DataClumps extends CodeSmellImpl {
    @Override
    public String smellName() {
        return DataClumps.class.getSimpleName();
    }

    public static void main(String[] args) {
        DataClumps dataClumps = new DataClumps();
        dataClumps.run();
    }

    @Override
    public void problem() {
        super.problem();

        ClassRoom classRoom = new ClassRoom();
        classRoom.addStudent(1, "Somchai" ,"SookDee", 'M');
        classRoom.addStudent(2, "Somsri", "SookJai", 'F');
        classRoom.addStudent(3, "Sommaii", "SookSook", 'U');
        classRoom.listStudents();
    }

    class ClassRoom {
        private ArrayList<String> students;

        ClassRoom() {
            students = new ArrayList<>();
        }

        void addStudent(int number, String firstName, String lastName, char gender) {
            students.add( number + " " + firstName + " " + lastName + " " + gender);
        }

        void listStudents() {
            for(String student: students) {
                System.out.println("Student = " + student);
            }
        }
    }

    @Override
    public void solve() {
        super.solve();
        ClassRoomEvolution classRoomEvolution = new ClassRoomEvolution();
        classRoomEvolution.addStudent(new Student(1, "Somchai","SookDee", 'M'));
        classRoomEvolution.addStudent(new Student(2, "Somsri", "SookJai", 'F'));
        classRoomEvolution.addStudent(new Student(3, "Sommaii", "SookSook", 'U'));
        classRoomEvolution.listStudents();
    }

    class ClassRoomEvolution {
        private ArrayList<Student> students;

        ClassRoomEvolution() {
            students = new ArrayList<>();
        }

        void addStudent(Student student) {
            students.add(student);
        }

        void listStudents() {
            for(Student student: students) {
                System.out.println(student);
            }
        }
    }

    class Student {
        private int studentId;
        private String firstName;
        private String lastName;
        private Character gender;

        Student(int studentId, String firstName, String lastName, Character gender) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
