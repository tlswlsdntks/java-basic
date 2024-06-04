package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCount maxCount = new MaxCount(3);
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        maxCount.increment();
        int count = maxCount.getCount();
        System.out.println("count = " + count);
    }
}

