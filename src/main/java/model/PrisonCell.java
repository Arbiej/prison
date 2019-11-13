package model;

import dao.PrisonCellDataBase;

import java.util.List;

public class PrisonCell {
    private List<Customer> customers;
    private int id;
    private int size;

    public PrisonCell(List<Customer> customers, int size) {
        this.customers = customers;
        this.id = PrisonCellDataBase.getCellList().size() +1;
        this.size = size;
        PrisonCellDataBase.getCellList().add(this);
    }

    public PrisonCell() {
    }


    public List<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrisonCell)) return false;

        PrisonCell that = (PrisonCell) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        return customers != null ? customers.equals(that.customers) : that.customers == null;
    }
    @Override
    public int hashCode() {
        int result = customers != null ? customers.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + size;
        return result;
    }
    @Override
    public String toString() {
        return "PrisonCell{" +
                "customers=" + customers +
                ", id=" + id +
                ", size=" + size +
                '}';
    }
}
