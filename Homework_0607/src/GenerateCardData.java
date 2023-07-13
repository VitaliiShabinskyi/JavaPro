import java.util.Random;

public class GenerateCardData {
    public static String generateData() {
        StringBuilder cardNumber = new StringBuilder();
        Random random = new Random();

        // Первые 15 цифр номера карты
        for (int i = 1; i <= 15; i++) {
            int number = random.nextInt(10);
            cardNumber.append(number);
            if (i % 4 == 0) {
                cardNumber.append(" ");
            }
        }

        // Контрольная сумма номера карты по алгоритму Луна
        int summ = 0;
        boolean even = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int number = Character.getNumericValue(cardNumber.charAt(i));
            if (even) {
                number *= 2;
                if (number > 9) {
                    number -= 9;
                }
            }
            summ += number;
            even = !even;
        }
        int endNumber = (10 - (summ % 10)) % 10;
        cardNumber.append(endNumber);

        int month = random.nextInt(12) + 1;
        int year = random.nextInt(8) + 20;

        int cvv = random.nextInt(900) + 100;

        cardNumber.append(String.format("%02d/%02d", month, year));
        cardNumber.append(String.format("%03d", cvv));

        return cardNumber.toString();
    }
}
