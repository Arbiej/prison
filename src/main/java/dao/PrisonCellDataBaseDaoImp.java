package dao;

import com.sun.org.apache.regexp.internal.RE;
import dataBase.PrisonCellDataBase;
import model.PrisonCell;
import model.Result;

import java.util.List;

public class PrisonCellDataBaseDaoImp implements IPrsionCellDataBaseDao {
    @Override
    public List<PrisonCell> getCellList() { return PrisonCellDataBase.getCellList(); }
    @Override
    public Result addCell(PrisonCell prisonCell) {
        Result result = new Result();
        if (!PrisonCellDataBase.getCellList().contains(prisonCell)) {
            PrisonCellDataBase.getCellList().add(prisonCell);
            result.setErrorCode(0);
        } else {
            result.setErrorCode(-1);
            result.setErrorDescription("Dana cela już istnieje");
        }
        return result;
    }
    @Override
    public Result removeCell(PrisonCell prisonCell) {
        Result result = new Result();
        if (PrisonCellDataBase.getCellList().contains(prisonCell)) {
            PrisonCellDataBase.getCellList().remove(prisonCell);
            result.setErrorCode(0);
        } else {
            result.setErrorCode(-1);
            result.setErrorDescription("Brak celi w więzieniu");
        }
        return result;
    }
    @Override
    public Result updatePrisonCell(PrisonCell prisonCell) {
        Result result = new Result();
        for (PrisonCell p : PrisonCellDataBase.getCellList()) {
            if (p.getId() == prisonCell.getId()) {
                PrisonCellDataBase.getCellList().set(
                        PrisonCellDataBase.getCellList().indexOf(p), prisonCell);
                result.setErrorCode(0);
                break;
            }
        }
        return result;
    }
    @Override
    public PrisonCell getPrisonCell(int id) {
        PrisonCell prisonCell = null;
        for (PrisonCell p : PrisonCellDataBase.getCellList()) {
            if (p.getId() == id) {
                prisonCell = p;
            }
            if (prisonCell == null) {
                throw new NullPointerException("Celi nie ma w więzieniu");
            }
        }
        return prisonCell;
    }
}
