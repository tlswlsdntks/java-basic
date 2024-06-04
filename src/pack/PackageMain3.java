package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();

        //같은 이름의 클래스
        User user = new User(); // 자주 사용 → import
        pack.b.User user1 = new pack.b.User(); //전체 경로
    }
}
