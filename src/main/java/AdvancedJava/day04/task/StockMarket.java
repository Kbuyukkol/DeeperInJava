package AdvancedJava.day04.task;



import java.util.*;
import java.util.stream.Collectors;

public class StockMarket {
    public static void main(String[] args) {

        Trader[] traders = {
                new Trader("David", "Virginia"),
                new Trader("Jika", "Chicago"),
                new Trader("Mark", "New York"),
                new Trader("Maria", "New York"),
                new Trader("Emre", "Chicago"),
                new Trader("Olesea", "New York"),
                new Trader("Alma", "Virginia"),
        };

        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction(traders[0], "Apple", 2019, 1000),
                new Transaction(traders[3], "Tesla", 2020, 2500),
                new Transaction(traders[2], "Meta", 2022, 1200),
                new Transaction(traders[1], "Uber", 2018, 400),
                new Transaction(traders[4], "Ford", 2019, 1400),
                new Transaction(traders[2], "Amazon", 2023, 3400),
                new Transaction(traders[6], "Apple", 2020, 1300),
                new Transaction(traders[5], "Meta", 2018, 700),
                new Transaction(traders[4], "Meta", 2019, 600),
                new Transaction(traders[6], "Ford", 2019, 340),
                new Transaction(traders[2], "Uber", 2020, 890),
                new Transaction(traders[3], "Apple", 2020, 1290),
                new Transaction(traders[1], "Uber", 2023, 820),
                new Transaction(traders[0], "Amazon", 2017, 1230),
                new Transaction(traders[5], "Uber", 2016, 980),
                new Transaction(traders[3], "Ford", 2018, 650),
                new Transaction(traders[6], "Meta", 2023, 1320),
                new Transaction(traders[0], "Tesla", 2023, 2300)
        ));

        System.out.println("========= 1) all transactions in 2020 and sort by highest value =========");
        transactions.stream()
                .filter(p -> p.getYear() == 2020)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .forEach(System.out::println);

        System.out.println("========= 2) Find the 3 biggest transactions =========");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("========= 3) Find the company's name with the smallest 2 transactions =========");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(2)
                .map(Transaction::getCompany)
                .forEach(System.out::println);

        System.out.println("========= 4) find all the cities trades were made in =========");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("========= 5) find all the transactions of Meta =========");
        transactions.stream()
                .filter(p -> p.getCompany().equals("Meta"))
                .forEach(System.out::println);

        System.out.println("========= 6) find all the traders that are from New York =========");
        Arrays.stream(traders)
                .filter(p -> p.getCity().equals("New York"))
                .forEach(System.out::println);

        System.out.println("========= 7) find all the trader's names that are from Chicago =========");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(p -> p.getCity().equals("Chicago"))
                .map(Trader::getName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("========= 8) find all the trader's names and sort them alphabetically =========");
        Arrays.stream(traders)
                .map(Trader::getName) // trader -> trader.getName()
                .sorted()
                .forEach(System.out::println);

        System.out.println("========= 9) find if there is any Traders from Los Angeles =========");
        boolean anyInLosAng = Arrays.stream(traders)
                .anyMatch(p -> p.getCity().equals("Los Angeles"));
        System.out.println("anyInLosAng = " + anyInLosAng);

        System.out.println("========= 10) find the values of the transactions Mark was involved in =========");
        transactions.stream()
                .filter(p -> p.getTrader().getName().equals("Mark"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("==================\nNew topics");
        System.out.println("========= toMap =========");

        Map<String, String> traderMap = Arrays.stream(traders)
                .collect(Collectors.toMap(Trader::getName, Trader::getCity)); // name is key, city is value
        System.out.println(traderMap);

        System.out.println("========= groupingBy - trader's transactions =========");

        Map<Trader, List<Transaction>> tradersGroupMap = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getTrader)); // transaction -> transaction.getTrader()

        tradersGroupMap.forEach((k, v) -> {
            System.out.println(k.getName() + " " + v);
        });

        System.out.println("========= groupingBy - company =========");

        Map<String, List<Transaction>> companyMap = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCompany));

        companyMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        companyMap.get("Apple").forEach(System.out::println);

        System.out.println("========= groupingBy - year =========");

        Map<Integer, List<Transaction>> yearMap = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getYear));

        yearMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        // most normal flow:
        List<Integer> nums = new ArrayList<>(Arrays.asList(
                4, 2, 4, 3, 7, 9, 2, 3, 4, 5, 9, 13
        ));

        System.out.println(nums.stream().filter(p -> p % 2 == 0).collect(Collectors.toList()));

    }
}

