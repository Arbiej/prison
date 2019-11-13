package dataBase;

import model.PrisonCell;

import java.util.ArrayList;
import java.util.List;

public class PrisonCellDataBase {
    private  static List<PrisonCell> cellList = new ArrayList<>();

    // przenieść metodę z bazy danych do oddzielnego dao, wstawionego przy użyciu interfejsu
    public static List<PrisonCell> getCellList() {
        return cellList;
    }
}
