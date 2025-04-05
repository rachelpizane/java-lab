package com.rachelpzm.infnet.formageometrica;

import java.util.Comparator;

public class PerimetroFormaComparator implements Comparator<FormaGeometrica> {

    @Override
    public int compare(FormaGeometrica fg1, FormaGeometrica fg2) {
        return (int)(fg1.getPerimetro() - fg2.getPerimetro());
    }
}
