package dao;

import dataBase.PrisonCellDataBase;
import model.PrisonCell;
import model.Result;

import java.util.List;

public interface IPrsionCellDataBaseDao {

    List<PrisonCell> getCellList();
    Result addCell(PrisonCell prisonCell);
    Result removeCell(PrisonCell prisonCell);
    Result updatePrisonCell (PrisonCell prisonCell);
    PrisonCell getPrisonCell (int id);

}
