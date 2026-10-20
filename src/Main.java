import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*===============================
        VENTANA
        ================================*/
        JFrame ventana = new JFrame("laberinto"); //ventana del juego
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana se cierra el programa
        ventana.setSize(800, 600); //tamaño de la ventana
        ventana.setLocationRelativeTo(null); //centra la ventana
        ventana.setVisible(true);//muestra la ventana

        /*===============================
        * FONDO Y DIBUJO DE LA PELOTICA
        * ==============================*/
        JPanel juego = new JPanel(){protected void paintComponent(Graphics g) { // Permite dibujar en el panel

            //JPanel es por asi decirlo donde vamos a dibujar
            super.paintComponent(g);  // Pinta de nuevo el fondo del panel

            // Dibujar la pelotica
            g.setColor(Color.red);// color de la pelotica
            g.fillOval(300, 400, 100, 100); //tamaño y movimiento de la pelotica
             }
         };
           juego.setBackground(Color.black); // el color del fondo
           ventana.add(juego); // Agrega el fondo a la ventana


    }
}
