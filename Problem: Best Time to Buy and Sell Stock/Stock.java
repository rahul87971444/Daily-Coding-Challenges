class Stock {
  public static void main(String args[]) {
    int stock[] = {7, 1, 5, 3, 6, 4};
    int minPrice = stock[0];
    int maxProfit = 0;
    int buyDay = 0;
    int sellDay = 0;
    for (int i = 1; i < stock.length; i++) {
      if (stock[i] < minPrice) {
        minPrice = stock[i];
        buyDay = i;  
      } 
      else {
        int profit = stock[i] - minPrice;
        if (profit > maxProfit) {
          maxProfit = profit;
          sellDay = i; 
        }
      }
    }
    System.out.println("Max Profit: " + maxProfit);
    System.out.println("Buy day: " + buyDay + " Price: " + stock[buyDay]);
    System.out.println("Sell day: " + sellDay + " Price: " + stock[sellDay]);
  }
}
