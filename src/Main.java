public class Main {
    public static void main(String[] args) {
        long transactionInKopecks = 1500_00;
        long bonusPointsInKopecks;
        long valueInKopecks = 1000_00;
        if (transactionInKopecks > valueInKopecks) {
            bonusPointsInKopecks = transactionInKopecks / 10000;
        } else {
            bonusPointsInKopecks = 0;
        }
        long balanceInKopecks = 5000_00;
        long totalBalanceInKopecks = (balanceInKopecks + transactionInKopecks + bonusPointsInKopecks) / 100;
        System.out.println("Всего бонусных баллов — " + bonusPointsInKopecks);
        System.out.println("Баланс счета — " + totalBalanceInKopecks);
    }
}
