package enroll_student;

public class Registrar {
    String name;

    public Registrar(String name) {
        this.name = name;
    }

    public boolean verifyStudent(int age, double cgpa) throws IneligibleForAdmission {

        if (age > 16 && age < 25) {

            if (cgpa > 4.5) {

                return true;

            } else {

                throw new IneligibleForAdmission("Due to less cgpa admission rejected, cgpa should be greater than 5.0cgpa");
            }

        } else {
            throw new IneligibleForAdmission("Due to age student admission rejected, allowed age 16year to 25year");
        }
    }

}
