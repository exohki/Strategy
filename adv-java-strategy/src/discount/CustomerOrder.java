package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        setDiscountStrategy(discountType);
    }

    public double getBillAmount() {
        return discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDiscountStrategy(char discountType) {
        switch (Character.toUpperCase(discountType)) {
            case 'S':
                discountStrategy = new SaleDiscountStrategy();
                break;
            case 'D':
                discountStrategy = new DiscountDiscountStrategy();
                break;
            case 'L':
                discountStrategy = new LiquidationDiscountStrategy();
                break;
            default:
                discountStrategy = null;
        }
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountStrategy.getClass().getSimpleName()
                + '}';
    }
}
