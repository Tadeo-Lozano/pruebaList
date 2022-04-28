package edu.uaslp.objetos.taskslist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    ArrayList<Task> taskLinkedList = new ArrayList<>();

    public TaskList(){
    }

    public int getSize() {
        return taskLinkedList.size();
    }

    public void add(Task tarea) {
        taskLinkedList.add(tarea);
    }

    public void remove(Task tarea) {
        taskLinkedList.remove(tarea);

    }

    public Task find(String tarea) throws TaskNotFoundException{
        for(int i=0;i<taskLinkedList.size();i++){
            if(tarea == taskLinkedList.get(i).getTitle()){
                return taskLinkedList.get(i);
            }
        }
        throw new TaskNotFoundException("Task with title 'Hacer ejercicio' not found");
    }

    public void markAsDone(String tarea) {
        Task task = find(tarea);

        task.setDone(true);
        //task.isDone() = true;

    }

    public void markAsNotDone(String tarea) {
        Task task = find(tarea);

        task.setDone(false);
    }

    public Task getNextTask() {

        return new Task();//**
    }

    public List<Task> getNextTasks() {
        return new ArrayList<>();
    }
}
