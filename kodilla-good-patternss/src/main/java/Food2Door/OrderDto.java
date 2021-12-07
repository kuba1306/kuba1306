package Food2Door;

public class OrderDto {

    private boolean isComplited;
    public Provider provider;
    public Product product;

    public OrderDto(final Provider provider, final boolean isComplited, final Product product) {
        this.provider = provider;
        this.isComplited = isComplited;
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isComplited() {
        return isComplited; }

    public void process() {

    }

}