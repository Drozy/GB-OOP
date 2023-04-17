package examples.meteo;

import java.time.LocalDateTime;

public class ST500Adapter implements MeteoSensor {
    private SensorTemperature st500;

    public ST500Adapter(SensorTemperature st500) {
        this.st500 = st500;
    }

    @Override
    public int getId() {
        return st500.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st500.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dt = LocalDateTime.of(0, 1, 1, 0, 0, 0);
        return dt.plusYears(st500.year()).plusDays(st500.day()-1).plusSeconds(st500.second());
    }
}
