public interface TaskOperations {
    public void addTask(Task task);
    public void removeTask(int id);
    public void showAllTasks();
    public void showTaskById(int id);
    public void modifyTask(int id);
}
