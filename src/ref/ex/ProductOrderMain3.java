package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주문의 개수를 입력하세요 : ");
        int orderCount = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {
            System.out.println((i + 1) +"번째 주문 정보를 입력하세요.");
            orders[i] = createOrder();
        }

        printOrders(orders);

        int totalPrice = getTotalPrice(orders);
        System.out.println("총 금액: " + totalPrice + "원");
    }

    static ProductOrder createOrder() {
        Scanner sc = new Scanner(System.in);
        ProductOrder order = new ProductOrder();

        System.out.print("상품명: ");
        order.productName = sc.next();
        System.out.print("가격: ");
        order.price = sc.nextInt();
        System.out.print("수량: ");
        order.quantity = sc.nextInt();

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder orderList : orders) {
            System.out.println("상품명: " + orderList.productName + ", 가격: " + orderList.price + "원, 수량: " + orderList.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }

        return totalPrice;
    }
}
