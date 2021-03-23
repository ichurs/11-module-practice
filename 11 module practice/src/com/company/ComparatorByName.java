package com.company;

import java.util.Comparator;

public class ComparatorByName implements Comparator<StoreGoods> {
    @Override
    public int compare(StoreGoods o1, StoreGoods o2) {
        if (o1 instanceof Monitor && o2 instanceof Monitor) {
            return ((Monitor) o1).getProducer().compareTo(((Monitor) o2).getProducer());
        }
        else if (o1 instanceof Kettle && o2 instanceof Kettle){
            return ((Kettle) o1).getProducer().compareTo(((Kettle) o2).getProducer());
        } else throw new IllegalArgumentException("Не удаётся идентифицировать товар!");
    }
}
