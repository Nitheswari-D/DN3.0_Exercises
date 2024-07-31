package financialforecasting;

public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int years = 10;

        double futureValue = FinancialForecast.calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}
