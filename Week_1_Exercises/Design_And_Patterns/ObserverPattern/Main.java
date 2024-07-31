package observerpattern;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        
        System.out.println("Setting stock price to $100.0");
        stockMarket.setStockPrice(100.0);
        
        System.out.println("Setting stock price to $150.0");
        stockMarket.setStockPrice(150.0);
        
        stockMarket.deregisterObserver(mobileApp);
        
        System.out.println("Setting stock price to $200.0");
        stockMarket.setStockPrice(200.0);
    }
}
