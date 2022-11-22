public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double interest = .17;
        double totalInterest;
        double totalCost;
        double totalInterest2;
        double totalCost2;
        totalInterest = balance * interest;
        totalCost = totalInterest + balance;
        totalInterest2 = totalCost * interest;
        totalCost2 = totalInterest2 + totalCost;
                System.out.println("The total due after one month of interest is: $" + totalCost + ", and after two months of interest is: $" + totalCost2);



    }
}