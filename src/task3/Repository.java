package task3;

public abstract class Repository<T> {

    public abstract void save(T data);

    public abstract T findById(int id);


}
