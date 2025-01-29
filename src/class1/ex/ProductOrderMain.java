package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        int totalPrice = 0;

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.quantity = 2;
        tofu.price = 2000;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.quantity = 1;
        kimchi.price = 5000;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.quantity = 2;
        cola.price = 1500;

        ProductOrder[] productOrders = {tofu, kimchi, cola};

        for (ProductOrder po : productOrders) {
            totalPrice += po.price * po.quantity;
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
