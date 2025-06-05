package tp5.adapter.ejercicio2;

import java.awt.*;

public class AdapterGraphics implements Panel {
    private Graphics2D grafico;

    public AdapterGraphics(Graphics2D grafico) {
        this.grafico = grafico;
    }

    @Override
    public void dibujarCirculo(int x, int y, int ancho, int alto) {
        this.grafico.drawOval(x, y, ancho, alto);
    }

    @Override
    public void dibujarLinea(int x1, int y1, int x2, int y2) {
        this.grafico.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        this.grafico.drawString(texto, x, y);
    }
}
