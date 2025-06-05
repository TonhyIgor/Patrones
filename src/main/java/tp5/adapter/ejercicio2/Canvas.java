package tp5.adapter.ejercicio2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        var g2d = (Graphics2D) g;
        var adaptador = new AdapterGraphics(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(adaptador);
        }
    }
}
