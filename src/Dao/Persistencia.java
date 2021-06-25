package Dao;

import java.util.List;

public interface Persistencia<T> {
    public int create (T obj);
    public T findByCodigo (int id);
    public void delete (int id);
    public void update (T obj);
    public List<T> read();
}
