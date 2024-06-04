package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        //public
        accessData.publicField = 1;
        accessData.publicMethod();

        //default
        accessData.defaultField = 2;
        accessData.defaultMethod();

        //private
        //accessData.privateField = 3; //privateField has private access in access.a.AccessData
        //accessData.privateMethod();

        accessData.innerAccess();
    }
}

