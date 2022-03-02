package com.sha.springbootbookseller.projection;

import java.time.LocalDateTime;

public interface IPurchaseItem
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
