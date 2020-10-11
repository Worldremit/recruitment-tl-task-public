package com.worldremit.credit.validator.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties
public class CreditCardVendors {
   private List<CreditCardVendor> vendors;
}
