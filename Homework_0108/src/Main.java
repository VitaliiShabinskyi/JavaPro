import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /**
         * Вам дан текстовый файл, содержащий список email-адресов.
         * Извлечь все уникальные домены электронной почты и подсчитать,
         * сколько раз каждый домен встречается в списке.
         */
        Map<String, Integer> countDomain = new HashMap<>();
        try(BufferedReader emails = new BufferedReader(new FileReader("data/emails.txt"))) {
            String line;
            String regex = "\\b([A-Za-z0-9._%+-]+)@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})\\b";
            Pattern pattern = Pattern.compile(regex);

            while ((line = emails.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    String domain = matcher.replaceAll("$2");
                    countDomain.put(domain, countDomain.getOrDefault(domain, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : countDomain.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        System.out.println("-".repeat(30));
        /**
         * Вам дан текстовый файл, содержащий список URL-адресов.
         * Найти все URL, которые содержат протокол "https://" и заменить их на "http://"
         */
        try (BufferedReader urlsReader = new BufferedReader(new FileReader("data/urls.txt"));
             BufferedWriter urlsWriter = new BufferedWriter(new FileWriter("data/urls_out.txt"))) {
            String line;
            String regex = "^(https)(://[^\\s/$.?#].\\S{2,})$";
            Pattern pattern = Pattern.compile(regex);

            while ((line = urlsReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String url = matcher.replaceFirst("http$2");
                    urlsWriter.write(url);
                    System.out.println(url);
                } else {
                    urlsWriter.write(line);
                }
                urlsWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("-".repeat(30));
        /**
         * Вам дан текстовый файл, содержащий список кодов продуктов в формате: <product_code>:<quantity>.
         * Найти все продукты с количеством больше 10 и вывести их коды и количество.
         */
        try (BufferedReader products = new BufferedReader(new FileReader("data/products.txt"))) {
            String line;
            String regex = "^([A-Z]{3}[0-9]{3}):(\\d+)$";
            Pattern pattern = Pattern.compile(regex);

            while ((line = products.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    int quantity = Integer.parseInt(matcher.group(2));
                    String productCode = matcher.group(1);

                    if (quantity > 10) {
                        System.out.println(productCode + " -> " + quantity);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
