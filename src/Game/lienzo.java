package Game;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class lienzo extends javax.swing.JPanel implements Runnable {

    private Thread hilo;
    private int numPalabras = 15;
    private int vidas = 7;
    private int contadorAciertos;
    private boolean estadoLose;
    private boolean estadoWin;
    private String[] palabras = new String[numPalabras];
    private String palabra;
    private int cantLetras;
    private char[] palabraMostrar;
    private Image[] ahorcado = new Image[1];

    public lienzo() {
        initComponents();
        iniciarValoresJuego();
        hilo = new Thread(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(ahorcado[0], 0, 0, this);

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
            repaint();
        } catch (InterruptedException ex) {
            System.out.println("failRun:" + ex);
        }
    }

    public char[] comprobarLetra(String select) {
        int aux = 0;
        if (contadorAciertos != cantLetras && vidas != 1) {
            if (palabra.contains(select)) {
                for (int i = 0; i < cantLetras; i++) {
                    if (palabra.charAt(i) == select.charAt(0)) {
                        palabraMostrar[i] = select.charAt(0);
                        aux++;
                    }
                }
                contadorAciertos = contadorAciertos + aux;
            } else {
                vidas--;
            }
        }
        ahorcado[0] = loadImage("assets/" + vidas + ".PNG");
        repaint();
        if (vidas == 1) {
            return palabraMostrar = palabra.toCharArray();
        } else {
            return palabraMostrar;
        }
    }

    public boolean getEstadoLose() {
        if (vidas == 1) {
            estadoLose = true;
        } else {
            estadoLose = false;
        }
        return estadoLose;
    }

    public boolean getEstadoWin() {
        if (cantLetras == contadorAciertos) {
            estadoWin = true;
        } else {
            estadoWin = false;
        }
        return estadoWin;
    }

    public char[] getPalabraMostrar() {
        return palabraMostrar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void iniciarValoresJuego() {
        palabras[0] = "algoritmo";
        palabras[1] = "compilador";
        palabras[2] = "instancia";
        palabras[3] = "protegido";
        palabras[4] = "parametro";
        palabras[5] = "sintaxis";
        palabras[6] = "clase";
        palabras[7] = "hexadecimal";
        palabras[8] = "fortran";
        palabras[9] = "agregacion";
        palabras[10] = "bucle";
        palabras[11] = "embebido";
        palabras[12] = "cohesion";
        palabras[13] = "acoplamiento";
        palabras[14] = "paquete";
        palabra = palabras[(int) (Math.random() * 5)];
        cantLetras = palabra.length();
        palabraMostrar = new char[cantLetras];
        for (int i = 0; i < cantLetras; i++) {
            palabraMostrar[i] = '_';
        }
        ahorcado[0] = loadImage("assets/" + 7 + ".PNG");
    }

    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}
