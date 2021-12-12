package com.kodilla.good.patterns.challenges;

class ProductOrderService {

    private DeliveryService deliveryService;
    private InformationService informationService;

    private PaymentMethod paymentMethod;


    public ProductOrderService(final DeliveryService deliveryService, final InformationService informationService, final PaymentMethod paymentMethod) {
        this.informationService = informationService;
        this.deliveryService = deliveryService;
        this.paymentMethod = paymentMethod;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isPaid = paymentMethod.isPaid(orderRequest.getUser(), orderRequest.getOrdered(), orderRequest.getEstimatedDeliveryTime(), orderRequest.isCashOnAccount());
        if (isPaid) {
            informationService.inform(orderRequest.getUser());
            deliveryService.isDelivered(orderRequest.getUser(), orderRequest.getOrdered(), orderRequest.getEstimatedDeliveryTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}