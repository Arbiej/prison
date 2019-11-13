package service;

import dao.PrisonCellDataBase;
import model.Customer;
import model.PrisonCell;
import model.Result;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.logging.Logger;

public class PrisonCellService implements  IPrisonCellService {
    private final Logger logger = Logger.getAnonymousLogger();

    @Override
    public List<PrisonCell> getAllCells() {
        return PrisonCellDataBase.getCellList();
    }

    @Override
    public Result putCustomer(Customer customer, int cellId) {
        Result result = new Result();
        PrisonCell prisonCell = PrisonCellDataBase.getCellList().get(cellId);
        if ( prisonCell != null) {
            if ( prisonCell.getSize() > prisonCell.getCustomers().size()) {
                prisonCell.getCustomers().add(customer);
                result.setErrorCode(0);
            } else {
                result.setErrorCode(-1);
                logger.warning("Cela jest przepełniona");
            }
        }
        else {
            result.setErrorCode(-1);
            result.setErrorDescription("Cela nie istnieje.");
            logger.info("Cela nie istnieje");
        }
        return result;
    }
   // C:\kurs programator\kaminsko




}
