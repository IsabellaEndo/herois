package ArenaHerois;

public class Gigante extends Personagens{
	
	public Gigante(String nome) {
		super (nome, 200, 40);
	}
	@Override
	public void atacar (Personagens oponente) {
		int distancia = calcularDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano (this.getDanoBase());
			System.out.println(getNome()+"atacou"+oponente.getNome()+"força bruta");
			
		}else {
			System.out.println(getNome()+"esta muito longe para atacar!");
			
		}
	}

}
 