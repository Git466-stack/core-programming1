public class ProfitLossCalculator {
    public static void main(String[] args) {

        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculating profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Displaying the results in a single print statement
        System.out.println("Profit and Loss Calculator:\n" +
                "Cost Price: INR " + costPrice + "\n" +
                "Selling Price: INR " + sellingPrice + "\n" +
                "Profit: INR " + profit + "\n" +
                "Profit Percentage: " + profitPercentage + "%");
    }
}
