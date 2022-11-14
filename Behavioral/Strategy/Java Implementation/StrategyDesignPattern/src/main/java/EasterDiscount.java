import java.math.BigDecimal;

public class EasterDiscount implements Discount{
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
