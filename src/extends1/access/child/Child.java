package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;    //접근 허용
        protectedValue = 1; //상속 관계 또는 같은 패키지
        //defaultValue = 1; //같은 패키지
        //privateValue = 1; //접근 불가

        publicMethod();    //접근 허용
        protectedMethod(); //상속 관계 또는 같은 패키지
        //defaultMethod(); //같은 패키지
        //privateMethod(); //접근 불가

        printParent();
    }
}
