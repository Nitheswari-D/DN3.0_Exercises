package financialforecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return (1 + growthRate) * calculateFutureValue(initialValue, growthRate, years - 1);
    }
}
