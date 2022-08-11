package student_initial.test;

import java.util.Random;

public class University {
    private String name;
    private String recognised_by;
    private String address;
    private Registrar registrar;

    public University(String name, String recognised_by, String address, String registrar_name) {
        this.name = name;
        this.recognised_by = recognised_by;
        this.address = address;
        this.registrar = add_registrar(registrar_name);
    }

    public void add_student(String name, int age, String qualification, double cgpa) {

        System.out.println("Student " + name + " is applying for " + this.name);

        System.out.println(name + ", please wait our Registrar " + this.registrar.name + " validating your application");

        String admission_status = this.registrar.verifyStudent(age, qualification, cgpa);

        if (admission_status.equals("Verified")) {
            int id = new Random().nextInt(500);

            System.out.println( "Congrats " + name + ", welcome to our " + this.name + " university, your id: " + id);

        } else {
            System.out.println(admission_status);
        }
    }

    private Registrar add_registrar(String name) {
        return new Registrar(name);
    }
}
