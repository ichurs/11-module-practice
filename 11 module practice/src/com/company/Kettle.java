package com.company;

import java.util.Objects;

public class Kettle extends StoreGoods {
    private final String type;
    private final String producer;
    private int price;
    private final double volume;

    public String getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScreenSize() {
        return volume;
    }

    public Kettle(String type, String producer, int price, double volume) {
        if (type == null || producer == null || price == 0 || volume == 0.0){
            throw new IllegalArgumentException("Некорректные данные о товаре.");
        }
        else {
            this.type = type;
            this.producer = producer;
            this.price = price;
            this.volume = volume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kettle kettle = (Kettle) o;
        return  type.equals(kettle.type) &&
                producer.equals(kettle.producer)
                && volume == kettle.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, producer, volume);
    }

    @Override
    public String toString() {
        return "Товар:" + type +
                ", объем " + volume +
                " л., производитель: " + producer +
                ", цена: " + price + " руб.";
    }
}