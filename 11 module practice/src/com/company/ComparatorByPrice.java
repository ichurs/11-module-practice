package com.company;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<StoreGoods> {
    @Override
    public int compare(StoreGoods o1, StoreGoods o2) {
        if (o1 instanceof Monitor && o2 instanceof Monitor) {
            return Long.compare(((Monitor) o1).getPrice(), ((Monitor) o2).getPrice());
        }
        else if (o1 instanceof Kettle && o2 instanceof Kettle){
            return Long.compare(((Kettle) o1).getPrice(), ((Kettle) o2).getPrice());
        } else throw new IllegalArgumentException("Не удаётся идентифицировать товар!");
    } 
    
    
}
