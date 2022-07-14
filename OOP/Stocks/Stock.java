package Stocks;

public class Stock {
    private String name;
    private int totalShares;
    private double totalCost;

    private double profit;

    public Stock(String symbol) {
        if(symbol == null) {
            throw new NullPointerException("Not a valid name");
        }
        name = symbol;
        totalShares = 0;
        totalCost = 0;
    }


    public void getProfit(double currentPrice) {
        if(currentPrice < 0) {
            throw new IllegalArgumentException("Negative price");
        }
        double marketValue = totalShares * currentPrice;

        profit = Math.round((marketValue - totalCost) * 100.00)/100.00;
    }

    public void purchase(int shares, double pricePerShare) {
        if(shares < 0 || pricePerShare < 0) {
            throw new IllegalArgumentException("Negative shares or price");
        }
        totalShares += shares;
        totalCost += shares * pricePerShare;
    }

    public double printProfit() {
        return profit;
    }

    public String getName() {
        return name;
    }
}
