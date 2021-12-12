package com.kodilla.good.patterns.challenges;

public class Application {

    private static com.kodilla.good.patterns.challenges.DeliveryService DeliveryService;
    private static com.kodilla.good.patterns.challenges.InformationService InformationService;
    private static com.kodilla.good.patterns.challenges.PaymentMethod PaymentMethod;

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = OrderRequestRetriever.retrieve();

        ProductOrderService orderProcessor = new ProductOrderService(new DeliveryService(),
                new InformationService(), new PaymentMethod());

        orderProcessor.process(orderRequest);
    }
}
