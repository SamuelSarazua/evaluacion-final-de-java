package view;

import model.Tarea;
import service.DataTareas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TareasView extends JFrame {

    private int[] pantall = {1300, 800};
    private ArrayList<Tarea> listaTareas;

    public TareasView(ArrayList<Tarea> listaTareas) {
        this.setTitle("Ventana de Tareas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(pantall[0], pantall[1]);
        this.setLayout(new GridLayout(0,2));
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.listaTareas = listaTareas;

        JPanel panelOpciones = new JPanel();
        panelOpciones.setPreferredSize(new Dimension(pantall[0], 400));
        panelOpciones.setBackground(Color.DARK_GRAY);
        panelOpciones.setLayout(new BorderLayout());
        this.add(panelOpciones, BorderLayout.WEST);

        JPanel cuadro1 = new JPanel();
        cuadro1.setPreferredSize(new Dimension(650, 400));
        cuadro1.setBackground(Color.YELLOW);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.insets = new Insets(15, 10, 15, 10);  // Agregar espacio entre los componentes
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        JLabel titulo = new JLabel("Titulo");
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        cuadro1.add(titulo, restricciones);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        cuadro1.add(textField, restricciones);



        JLabel descrip = new JLabel("Descripcion");
        descrip.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        cuadro1.add(descrip, restricciones);

        JTextField descripcion = new JTextField();
        descripcion.setPreferredSize(new Dimension(100,24));
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        cuadro1.add(descripcion, restricciones);

        JLabel fecha = new JLabel("Fecha Limite");
        fecha.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        cuadro1.add(fecha);

        JTextField fechaField = new JTextField();
        fechaField.setPreferredSize(new Dimension(100,24));
        cuadro1.add(fechaField);

        JLabel Estado = new JLabel("Estado");
        Estado.setFont(new Font("Arial", Font.CENTER_BASELINE, 17));
        cuadro1.add(Estado);

        JTextField estadoField = new JTextField();
        estadoField.setPreferredSize(new Dimension(100,24));
        cuadro1.add(estadoField);

        panelOpciones.add(cuadro1, BorderLayout.WEST);

        JPanel cuadro2 = new JPanel();
        cuadro2.setPreferredSize(new Dimension(650, 400));
        cuadro2.setBackground(Color.GREEN);
        panelOpciones.add(cuadro2, BorderLayout.EAST);

        JPanel panelLista = new JPanel();
        panelLista.setPreferredSize(new Dimension(pantall[0], 400));
        panelLista.setBackground(Color.BLUE);
        panelLista.setLayout(new BorderLayout());
        this.add(panelLista, BorderLayout.SOUTH);



        this.setVisible(true);
    }


}


