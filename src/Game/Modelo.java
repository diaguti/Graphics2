
package Game;

public class Modelo {
    private VentanaGame ventanaGame;

    public Modelo() {
        ventanaGame = new VentanaGame();
    }
    public void iniciar(){
        ventanaGame.setTitle("Ejercicio 1");
        ventanaGame.setSize(650, 300);
        ventanaGame.setLocationRelativeTo(null);
        ventanaGame.setResizable(false);
        ventanaGame.setVisible(true);
    }

    public VentanaGame getVentanaGame() {
        if(ventanaGame==null){
            ventanaGame = new VentanaGame();
        }
        return ventanaGame;
    } 
}
