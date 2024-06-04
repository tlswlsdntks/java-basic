package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        /**
         * OCP원칙
         */
        //boolean result = false;
        System.out.println("결제를 시작합니다: option= " + option + ", amount= " + amount);

        Pay pay = PayStore.findPay(option);
        //if (pay != null) { result = pay.pay(amount); }
        boolean result = pay.pay(amount); //return new DefaultPay();

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
