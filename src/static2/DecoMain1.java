package static2;

import static1.Data1;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";

        //객체 생성 무의미
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String deco = decoUtil1.deco(s);

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}

