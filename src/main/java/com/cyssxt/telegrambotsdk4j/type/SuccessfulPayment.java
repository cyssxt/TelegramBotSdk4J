package com.cyssxt.telegrambotsdk4j.type;

import lombok.Data;

/**
 * https://core.telegram.org/bots/api#successfulpayment
 */
@Data
public class SuccessfulPayment {
    String currency;
    Integer totalAmount;
    String invoicePayload;
    String shippingOptionId;
    OrderInfo orderInfo;
    String telegramPaymentChargeId;
    String providerPaymentChargeId;
}
