public class Person {

    String lastName;
    String firstName;
    String patronymic;
    String dateOfBirth;
    long phoneNumber;
    char gender;

    public Person(String lastName, String firstName, String patronymic, String dateOfBirth, long phoneNumber,
            char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", lastName, firstName, patronymic, dateOfBirth, phoneNumber,
                gender);
    }
}
