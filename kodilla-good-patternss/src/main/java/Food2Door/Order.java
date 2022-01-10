package Food2Door;

public class Order {

    private Complited complited;
    private Realization realization;

    public void orderRequest(final Product product, final Provider provider) {

    }
}


//
//        import java.time.LocalDateTime;
//
//public class RentRequest {
//
//    private User user;
//    private LocalDateTime from;
//    private LocalDateTime to;
//
//    public RentRequest(final User user, final LocalDateTime from, final LocalDateTime to) {
//        this.user = user;
//        this.from = from;
//        this.to = to;
//    }
//
//    public User getUser() { return user; }
//
//    public LocalDateTime getFrom() { return from; }
//
//    public LocalDateTime getTo() { return to; }



//public class RentalProcessor {
//
//    private InformationService informationService;
//    private RentalService rentalService;
//    private RentalRepository rentalRepository;
//
//
//    public RentalProcessort(final InformationService informationService,
//                            final RentalService rentalService,
//                            final RentalRepository rentalRepository) {
//        this.informationService = informationService;
//        this.rentalService = rentalService;
//        this.rentalRepository = rentalRepository;
//    }
//
//    public RentalDto process(final RentRequest rentRequest) {
//        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
//        if (isRented) {
//            informationService.inform(rentRequest.getUser());
//            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
//            return new RentalDto(rentRequest.getUser(), true);
//        } else {
//            return new RentalDto(rentRequest.getUser(), false);
//        }
//    }
//
//}

//public class Application {
//
//    public static void main(String[] args) {
//        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
//        RentRequest rentRequest = rentRequestRetriever.retrieve();
//
//        RentalProcessor rentalProcessor = new RentalProcessor(
//                new MailService(), new CarRentalService(), new CarRentalRepository());
//        rentalProcessor.process(rentRequest);
//    }
//
//}

//package com.kodilla.good.patterns.srp;
//
//        import java.time.LocalDateTime;
//
//public class RentRequest {
//
//    private User user;
//    private LocalDateTime from;
//    private LocalDateTime to;
//
//    public RentRequest(final User user, final LocalDateTime from, final LocalDateTime to) {
//        this.user = user;
//        this.from = from;
//        this.to = to;
//    }
//
//    public User getUser() { return user; }
//
//    public LocalDateTime getFrom() { return from; }
//
//    public LocalDateTime getTo() { return to; }
//}
