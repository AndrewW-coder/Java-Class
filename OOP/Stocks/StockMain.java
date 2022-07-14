package Stocks;

import Stocks.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How many different stocks did you purchase: ");
        int n = console.nextInt();

        ArrayList<Stock> stockList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.print("Insert name of stock: ");
            String name = console.next();

            stockList.add(new Stock(name));

        }

        for(int i = 0; i < n; i++) {
            Stock currentStock = stockList.get(i);

            System.out.println("Current Stock: " + currentStock.getName());

            System.out.print("How many purchases did you make? ");

            int numberOfPurchases = console.nextInt();

            for(int j = 1; j <= numberOfPurchases; j++) {
                System.out.print(j + ": How many shares, at what price? ");
                int numShares = console.nextInt();
                double price = console.nextDouble();

                currentStock.purchase(numShares, price);
            }

            System.out.print("What is today's price per share? ");
            double currentPrice = console.nextDouble();
            currentStock.getProfit(currentPrice);

            System.out.println();
        }


        for(int i = 0; i < n; i++) {
            Stock currentStock = stockList.get(i);

            System.out.println("Profit from " + currentStock.getName() + ": " + currentStock.printProfit());
        }
    }
}
