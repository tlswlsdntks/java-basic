package extends1.super2;

public class ClassC extends ClassB {
    public ClassC(int a) {
        //super(); //java: constructor ClassC in class extends1.super2.ClassC cannot be applied to given types;
        super(a); // 또는 super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
