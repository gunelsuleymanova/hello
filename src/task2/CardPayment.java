package task2;

public class CardPayment extends Payment <String>{


    @Override
    public String pay(String amount) {
        return "This is card payment : "+ amount;
    }
}
