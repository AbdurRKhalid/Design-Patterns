import java.math.BigDecimal;

public class ChristmasDiscount implements Discount{
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
