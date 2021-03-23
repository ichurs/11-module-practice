package com.company;

import java.util.Objects;

public class Monitor extends StoreGoods {
    private final String type;
    private final String producer;
    private int price;
    private final double screenSize;

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    public Monitor(String type, String producer, int price, double screenSize) {
        if (type == null || producer == null || price == 0 || screenSize == 0.0){
            throw new IllegalArgumentException("Некорректные данные о товаре.");
        }
        else {
            this.type = type;
            this.producer = producer;
            this.price = price;
            this.screenSize = screenSize;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return  type.equals(monitor.type) &&
                producer.equals(monitor.producer)
                && screenSize == monitor.screenSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, producer, screenSize);
    }

    @Override
    public String toString() {
        return "Товар:" + type +
                ", с диагональю " + screenSize +
                "\", производитель: " + producer +
                ", цена: " + price + " руб.";
    }
}
