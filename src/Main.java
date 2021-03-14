public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculete(price);
        System.out.println("Оплата прошла успешно. Вам начислены мили: " + miles);
    }
}

