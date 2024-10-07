package view;

import model.Tarea;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NuevaTareaView {
    private ArrayList<Tarea> listaTareas;

    public NuevaTareaView(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public JPanel panelTareas(ArrayList<Tarea> listaTareas) {

        JPanel panelTareas = new JPanel();

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(15, 10, 15, 10);
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JLabel titulo = new JLabel("Titulo");
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        panelTareas.add(titulo, restricciones);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        panelTareas.add(textField, restricciones);

        JLabel descrip = new JLabel("Descripcion");
        descrip.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        panelTareas.add(descrip, restricciones);

        JTextField descripcion = new JTextField();
        descripcion.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        panelTareas.add(descripcion, restricciones);

        JLabel fecha = new JLabel("Fecha Limite");
        fecha.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 2;
        restricciones.gridy = 2;
        panelTareas.add(fecha, restricciones);

        JTextField fechaField = new JTextField();
        fechaField.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 2;
        restricciones.gridy = 2;
        panelTareas.add(fechaField, restricciones);

        JLabel Estado = new JLabel("Estado");
        Estado.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 3;
        restricciones.gridy = 3;
        panelTareas.add(Estado, restricciones);

        JTextField estadoField = new JTextField();
        estadoField.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 3;
        restricciones.gridy = 3;
        panelTareas.add(estadoField, restricciones);


        return panelTareas;
    }

}
