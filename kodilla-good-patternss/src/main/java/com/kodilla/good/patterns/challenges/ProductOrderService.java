package com.kodilla.good.patterns.challenges;

class ProductOrderService {

    private InformationService informationService;
    private DeliveryService deliveryService;
    private PaymentMethod paymentMethod;


    public ProductOrderService(final InformationService informationService,
                          final DeliveryService deliveryservice,
                          final PaymentMethod paymentMethod) {
        this.informationService = informationService;
        this.deliveryService = deliveryservice;
        this.paymentMethod = paymentMethod;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isPaid = paymentMethod.isPaid(orderRequest.getUser(), orderRequest.getOrdered(), orderRequest.getEstimatedDeliveryTime());
        if (isPaid) {
            informationService.inform(orderRequest.getUser());
            deliveryService.delivery(orderRequest.getUser(), orderRequest.getOrdered(), orderRequest.getEstimatedDeliveryTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}