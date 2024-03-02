/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        String[] data = InputData.enterData().split(" ");

        try {
            CheckingEnteredData.checkingNumberOfParameters(data);

            String lastName = data[0];
            String firstName = data[1];
            String patronymic = data[2];

            CheckingEnteredData.checkingTheDateFormat(data[3]);
            String dateOfBirth = data[3];

            long phoneNumber = Long.parseLong(data[4]);

            CheckingEnteredData.genderFormatCheck(data[5]);
            char gender = data[5].charAt(0);

            Person person = new Person(lastName, firstName, patronymic, dateOfBirth, phoneNumber, gender);
            String title = person.lastName;
            WriteFile.write(person, title);

        } catch (IncorrectAmountOfDataException e) {
            System.err.println(e);
        } catch (IllegalDateFormatException e) {
            System.err.println(e);
        } catch (NumberFormatException e) {
            System.err.println(e + " невозможно преобразовать в число");
        } catch (IllegalGenderFormatException e) {
            System.err.println(e);
        }

    }
}
