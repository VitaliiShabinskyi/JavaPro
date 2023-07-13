import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        BankStorage storage = new BankStorage();

        BankCard card1 = new BankCard(GenerateCardData.generateData(), Currency.EUR.getTitle(), "Active");
        Client client1 = new Client("Dexter Morgan", card1, Math.round( random.nextDouble(5000, 50000) ));
        storage.addClient(client1, client1.getBalance());

        BankCard card2 = new BankCard(GenerateCardData.generateData(), Currency.USD.getTitle(), "Active");
        Client client2 = new Client("Debra Morgan", card2, Math.round( random.nextDouble(5000, 50000) ));
        storage.addClient(client2, client2.getBalance());

        BankCard card3 = new BankCard(GenerateCardData.generateData(), Currency.UAH.getTitle(), "Blocked");
        Client client3 = new Client("Vince Masuka", card3, Math.round( random.nextDouble(5000, 50000) ));
        storage.addClient(client3, client3.getBalance());

        BankCard card4 = new BankCard(GenerateCardData.generateData(), Currency.EUR.getTitle(), "Active");
        Client client4 = new Client("Angel Batista", card4, Math.round( random.nextDouble(5000, 50000 )));
        storage.addClient(client4, client4.getBalance());

        BankCard card5 = new BankCard(GenerateCardData.generateData(), Currency.EUR.getTitle(), "Blocked");
        Client client5 = new Client("James Doakes", card5, Math.round( random.nextDouble(5000, 50000 )));
        storage.addClient(client5, client5.getBalance());

        System.out.println("Клиенты с активными картами");
        storage.showClientByStatus("Active");

        System.out.println("\u2015" . repeat(30));
        storage.groupByBalance(25000);

        System.out.println("\u2015" . repeat(30));
        storage.averageBalance();

        System.out.println("\u2015" . repeat(30));
        storage.showCardNumber();

        System.out.println("\u2015" . repeat(30));
        storage.getExpirationCard();

        System.out.println("\u2015" . repeat(30));
        storage.sortedByBalance();

        System.out.println("\u2015" . repeat(30));
        storage.groupingByExpiration();
    }
}