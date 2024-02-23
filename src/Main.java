
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int month = 36; // На сколько месяцев кредит
        double money = 1_000_000; // Сумма кредита
        double percent = 9.9; // Процентная ставка
        double annuityPayment =  service.calculate(month, money, percent);
        System.out.println("Ежемесечный платеж будет: "+ annuityPayment);
    }
}
