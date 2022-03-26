public class Main {
    public static void main(String[] args) {
        //Входные данные:
        //Стоимость билета
        int amount = 7509;
        //Зарегистрирован ли пассажир в приложении
        boolean isRegistered = true;
        // логика программы
        int precent;
        // "precent" - стоимость одной бонусной мили
        if (isRegistered) {
            precent = 20;
        } else {
            precent = 0;
        }
        // расчет бонусной мили от стоимости билета и регистрации клиента в приложении
        int bonus = amount / precent;
        System.out.println("Ваши начисленные мили: " + bonus);
    }
}
