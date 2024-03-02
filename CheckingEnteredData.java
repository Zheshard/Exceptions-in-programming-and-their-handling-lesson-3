public class CheckingEnteredData {

    // Проверка количества введенных параметров
    public static void checkingNumberOfParameters(String[] arr) {
        if (arr.length < 6) {
            throw new IncorrectAmountOfDataException("Введено недостаточное количество параметров");
        }
        if (arr.length > 6) {
            throw new IncorrectAmountOfDataException("Введено избыточное количество параметров");
        }
    }

    // Проверка формата даты
    public static void checkingTheDateFormat(String data) {
        if (!data.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalDateFormatException("Неверный формат даты рождения");
        }
    }

    // Проверка правильности формата пола
    public static void genderFormatCheck(String gender) {
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new IllegalGenderFormatException("Неверный формат пола");
        }
    }

}
