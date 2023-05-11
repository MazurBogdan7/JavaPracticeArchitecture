package models;

public interface DbModel<T> {
    public void add() throws Exception;
    public void sort() throws Exception;
    public T select() throws Exception;
    public void delete()throws Exception;

}
