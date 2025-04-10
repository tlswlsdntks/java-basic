package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt(); //int\n
        ProductOrder[] orders = new ProductOrder[n];
        orders = createOrder(orders, scanner);
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    private static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }
        return totalAmount;
    }

    static ProductOrder[] createOrder(ProductOrder[] orders, Scanner scanner) {
        for (int i = 0; i < orders.length; i++) {
            scanner.nextLine(); //개행(\n) 삭제
            ProductOrder order = new ProductOrder();
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            order.productName = scanner.nextLine();
            System.out.print("가격: ");
            order.price = scanner.nextInt();
            System.out.print("수량: ");
            order.quantity = scanner.nextInt(); //\n
            orders[i] = order;
        }
        return orders;
    }
}
