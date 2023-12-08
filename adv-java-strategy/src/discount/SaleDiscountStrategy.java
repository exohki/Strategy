package discount;

public class SaleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
