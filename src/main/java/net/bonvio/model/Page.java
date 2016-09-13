package net.bonvio.model;


import java.util.List;

public class Page<T>{

    private List<T> rows;
    private long count;

    public Page(List<T> rows, long count) {
        this.rows = rows;
        this.count = count;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
