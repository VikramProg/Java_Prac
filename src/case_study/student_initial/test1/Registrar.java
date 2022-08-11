package student_initial.test;

import java.util.Objects;

public class Registrar {
    String name;

    public Registrar(String name) {
        this.name = name;
    }

    public String verifyStudent(int age, String qualification, double cgpa) {

        if (age > 16 && age < 28) {

            if (Objects.equals(qualification, "B.E") || Objects.equals(qualification, "B.Tech")) {

                if (cgpa > 5.0) {

                    return "Verified";

                } else {
                    return "Due to less cgpa admission rejected, cgpa should be greater than 5.0cgpa";
                }
            } else {
                return "Given Qualification not allowed for admission to Post-Graduation";
            }
        } else {
            return "Due to age student admission rejected, allowed age 18year to 28year";
        }
    }

}
