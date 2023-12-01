package Interfaces;

import Enums.AMOUNT;

public interface CloudyWeather {
    AMOUNT cloudsAmount = AMOUNT.FEW;
    void setCloudsAmount(AMOUNT cloudsAmount);
    AMOUNT getCloudsAmount();
    }

