package dao;

import model.PrisonCell;

import java.util.ArrayList;
import java.util.List;

public class PrisonCellDataBase {
    private  static List<PrisonCell> cellList = new ArrayList<>();

    public static List<PrisonCell> getCellList() {
        return cellList;
    }
}
