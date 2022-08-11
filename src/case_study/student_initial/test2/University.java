package student_initial.test2;

import java.util.Random;

public class University {
    String name;
    String recognised_by;
    String address;
    Registrar registrar;

    public University(String name, String recognised_by, String address, String registrar_name) {
        this.name = name;
        this.recognised_by = recognised_by;
        this.address = address;
        this.registrar = add_registrar(registrar_name);
    }

    public String add_student(String name, int age, String qualification, double cgpa, String course_applied) {

        System.out.println("student_initial.test2.Student " + name + " is applying for " + this.name);

        System.out.println(name + ", please wait our student_initial.test2.Registrar " + this.registrar.name + " validating your application");

        String admission_status = this.registrar.verifyStudent(age, qualification, cgpa);

        if (admission_status.equals("Verified")) {
            int id = new Random().nextInt(500);

            Student student = new Student(name, age, qualification, course_applied, id, cgpa);

            return "Congrats " + name + ", welcome to our " + this.name + " university, your id: " + id;

        } else {
            return admission_status;
        }


    }

    private Registrar add_registrar(String name) {
        return new Registrar(name);
    }
}
