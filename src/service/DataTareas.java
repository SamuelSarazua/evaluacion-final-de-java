package service;

import model.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataTareas {

    public static ArrayList listaTareas() {
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Tener un trabajo", "Poder conseguir el trabajo que deseo", LocalDate.of(2025, 1, 10), "Pendiente"));
        tareas.add(new Tarea("Empezar a entrar a la U", "Poder intentar entrar a la U", LocalDate.of(2025, 2, 10), "Completado"));
        tareas.add(new Tarea("Poder independizarme", "Intentar independizarme para tener mis cosas", LocalDate.of(2026, 1, 15), "Pendiente"));
        tareas.add(new Tarea("Comprarme deseos", "Poder conseguir las cosas que siempre desee", LocalDate.of(2026, 7, 20), "Pendiente"));
        tareas.add(new Tarea("Lograr graduarme de la Universidad", "Poder terminar los estudios para ser profesional", LocalDate.of(2030, 10, 25), "Pendiente"));

        return tareas;
    }

}
