package toby.hellospring;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {

    //
    private Long orderId;

    //
    private String currency;

    // 결제금액 처리하는 변수를 담을 때에는 소수점이 올림 또는 내림이 있는 double이나 float 는 쓰지 않고
    // BigDecimal 를 쓴다!!

    // 외국 기준 총 금액
    private BigDecimal foreignCurrencyAmount;

    // 적용 환율
    private  BigDecimal exchangeRate;


    // 원화 금액
    private  BigDecimal convertedAmount;

    // 환율 후 결제기간
    private LocalDateTime validUtill;

    public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmount, BigDecimal exchangeRate, BigDecimal convertedAmount, LocalDateTime validUtill) {
        this.orderId = orderId;
        this.currency = currency;
        this.foreignCurrencyAmount = foreignCurrencyAmount;
        this.exchangeRate = exchangeRate;
        this.convertedAmount = convertedAmount;
        this.validUtill = validUtill;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getValidUtill() {
        return validUtill;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", currency='" + currency + '\'' +
                ", foreignCurrencyAmount=" + foreignCurrencyAmount +
                ", exchangeRate=" + exchangeRate +
                ", convertedAmount=" + convertedAmount +
                ", validUtill=" + validUtill +
                '}';
    }
}
