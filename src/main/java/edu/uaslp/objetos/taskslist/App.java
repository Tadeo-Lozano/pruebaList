package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        // Given: (Inicialización)
        TaskList taskList = new TaskList();
        LocalDateTime dateInFuture = LocalDateTime.now().plusWeeks(20);
        Task task = new Task("Lavar los trastes", "Lavar los trastes sin tirar mucha agua", dateInFuture, false);
        Task task2 = new Task("Cola Hola", "Lavar los trastes sin tirar mucha agua", dateInFuture, false);

        // When: (Ejecución)
        taskList.add(task);
        taskList.add(task2);

        System.out.println("Titulo: " + task.getTitle());
        System.out.println("Titulo: " + task2.getTitle());
    }
}


// -> ¿Qué pruebas se van a crear?
// -> Las que cumplen con un requerimiento
