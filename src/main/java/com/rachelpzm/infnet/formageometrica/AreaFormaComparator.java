package com.rachelpzm.infnet.formageometrica;

import java.util.Comparator;

public class AreaFormaComparator implements Comparator<FormaGeometrica> {
    @Override
    public int compare(FormaGeometrica formaGeometrica1, FormaGeometrica formaGeometrica2) {
        return (int)(formaGeometrica1.getArea() - formaGeometrica2.getArea());
    }
}
