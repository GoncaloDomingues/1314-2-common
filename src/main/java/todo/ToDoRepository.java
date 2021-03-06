package todo;

public interface ToDoRepository{
    public Iterable<ToDo> getAll();
    public ToDo getById(int id);
    public void add(ToDo t);
    public boolean remove(int id);
}