package task2;

public class CashPayment extends Payment <Integer>{


    @Override
    public Integer pay(Integer amount) {
        return  amount- 10;
    }
}
