package Lab5Generics.Ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk<USD, RON> exchangeDesk = new ExchangeDesk<>();
        exchangeDesk.addRate(USD.class, RON.class, 4.61);
        USD usd = new USD(10);
        try {
            RON ron = exchangeDesk.convert(usd, RON.class);
            System.out.println(ron.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
