package access.ex;

public class MaxCount {
    private int count;
    private int max;

    public MaxCount(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        //검증 로직
        if (countValid()) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        //실행 로직
        count++;
    }

    private boolean countValid() {
        return count >= max;
    }
}

