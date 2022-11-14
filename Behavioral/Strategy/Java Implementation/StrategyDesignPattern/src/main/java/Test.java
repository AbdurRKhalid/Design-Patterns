import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Discount easterDiscount = new EasterDiscount();
        BigDecimal discountValue = easterDiscount.applyDiscount(BigDecimal.valueOf(100));

        System.out.println(discountValue);
    }
}
