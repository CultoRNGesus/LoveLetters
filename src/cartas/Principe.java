package cartas;

import jugador.Jugador;

public class Principe extends Carta {

	public Principe() {
		super("Principe", 5);
	}

	@Override
	public void descartar(Jugador jugador) {
		Jugador otro = jugador.seleccionarOtroJugador();
		cambiarCarta(otro);
	}
	
	public void cambiarCarta(Jugador otro) {
		otro.cambiarCarta();
	}

}
