package github.haozi.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;

/**
 * Created by ASUS on 2018/11/25.
 */
@Data
@ToString
public class Quote {
    private static final MathContext MATH_CONTEXT = new MathContext(2);

    private String ticker;

    private BigDecimal price;

    private Instant instant;

    public Quote() {

    }

    public Quote(String ticker, BigDecimal price, Instant instant) {
        this.ticker = ticker;
        this.price = price;
        this.instant = instant;
    }

    public Quote(String ticker, BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    public Quote(String ticker, Double price) {
        this(ticker, new BigDecimal(price, MATH_CONTEXT));
    }
}
