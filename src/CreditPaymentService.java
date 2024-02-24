public class CreditPaymentService {
    public double calculate(double month, double money, double percent) {
        double a = percent / 12F * 0.01; // ежемесечный  процент
        double ka = (a * Math.pow((1 + a), month)) / (Math.pow((1 + a), month) - 1); //коэффициент аннуитета
        double result = money * ka; // аннуитетный платеж
        return result;
    }
}