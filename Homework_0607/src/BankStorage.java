import java.util.*;

public class BankStorage {
    private final Map<Client, Double> clients;

    public BankStorage() {
        clients = new HashMap<>();
    }

    public void addClient(Client client, double balance) {
        clients.put(client, balance);
    }

    public void showClientByStatus(String status) {
        for (Client client : clients.keySet()) {
            if (client.getCard().getStatus().equals(status)) {
                System.out.println("Клиент: " + client.getName() + " -> " + status);
            }
        }
    }

    public void groupByBalance(double target) {
        List<Client> lowestBalance = new ArrayList<>();
        List<Client> highestBalance = new ArrayList<>();

        for (Map.Entry<Client, Double> entry : clients.entrySet()) {
            double balance = entry.getValue();
            if (balance > target) {
                highestBalance.add(entry.getKey());
            } else {
                lowestBalance.add(entry.getKey());
            }
        }

        System.out.println("Клиенты с балансом более " + target + ":");
        for (Client client : highestBalance) {

            System.out.println("\tКлиент: " + client.getName() + ",\tБаланс, " + client.getCard().getCurrency() + ": " + client.getBalance());
        }

        System.out.println("Клиенты с балансом менее " + target + ":");
        for (Client client : lowestBalance) {
            System.out.println("\tКлиент: " + client.getName() + ",\tБаланс, " + client.getCard().getCurrency() + ": " + client.getBalance());
        }
    }

    public void averageBalance() {
        double summa = 0;
        for (double balance : clients.values()) {
            summa += balance;
        }

        double average = summa / clients.size();
        System.out.println("Средний баланс по клиентам: " + average);
    }

    public void showCardNumber() {
        for (Client client : clients.keySet()) {
            String cardNumber = client.getCard().getCardData().substring(0, 19);
            System.out.println("Клиент: " + client.getName() + ",\tНомер карты: " + cardNumber);
        }
    }

    public void getExpirationCard() {
        Date currentDate = new Date();
        int count = 0;

        for (Client client : clients.keySet()) {
            String cardData = client.getCard().getCardData();

            Calendar expirationDate = getExpiration(cardData);

            if (expirationDate.getTime().before(currentDate)) {
                System.out.printf("Карта клиента %s истекла %02d/%4d\n", client.getName(), (expirationDate.get(Calendar.MONTH) + 1), expirationDate.get(Calendar.YEAR));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет клиентов с истекшим сроком");
        }
    }

    public void sortedByBalance() {
        List<Map.Entry<Client, Double>> list = new ArrayList<>(clients.entrySet());

        list.sort(new Comparator<Map.Entry<Client, Double>>() {
            @Override
            public int compare(Map.Entry<Client, Double> o1, Map.Entry<Client, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("Отсортированный список клиентов по балансу:");
        for (Map.Entry<Client, Double> entry : list) {
            Client client = entry.getKey();
            double balance = entry.getValue();
            System.out.println("\tКлиент: " + client.getName() + ",\tБаланс: " + balance);
        }
    }

    public void groupingByExpiration() {
        List<Client> activeList = new ArrayList<>();
        List<Client> expirationList = new ArrayList<>();

        Date currentDate = new Date();

        for (Client client : clients.keySet()) {
            String cardData = client.getCard().getCardData();

            Calendar expirationDate = getExpiration(cardData);

            if (expirationDate.getTime().before(currentDate)) {
                expirationList.add(client);
            } else {
                activeList.add(client);
            }
        }

        System.out.println("Клиенты с активной картой:");
        for (Client client : activeList) {
            System.out.println("\tКлиент: " + client.getName());
        }

        System.out.println("Клиенты с истекшей картой:");
        for (Client client : expirationList) {
            System.out.println("\tКлиент: " + client.getName());
        }
    }

    private Calendar getExpiration(String cardData) {
        String date = cardData.substring(19, 24);
        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3,5));

        Calendar expirationDate = Calendar.getInstance();
        expirationDate.set(Calendar.MONTH, month - 1);
        expirationDate.set(Calendar.YEAR, year + 2000);

        return expirationDate;
    }
}
