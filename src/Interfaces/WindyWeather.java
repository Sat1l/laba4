package Interfaces;

import Enums.DIRECTION;
import Enums.STRENGTH;

public interface WindyWeather {
    STRENGTH windStrength = null;
    DIRECTION windDirection = null;
    void setWindStrength(STRENGTH strength);
    STRENGTH getWindStrength();
    void setWindDirection(DIRECTION direction);
    DIRECTION getWindDirection();
}
