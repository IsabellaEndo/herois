package ArenaHerois;

public class Guerreiro extends Personagens{
	

	public Guerreiro (String nome) {
		super (nome, 150, 30);
	}
	@Override
	public void atacar (Personagens oponente) {
		int distancia = calcularDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano (this.getDanoBase());
			System.out.println(getNome()+"atacou"+oponente.getNome()+"com sua espada");
			
		}else {
			System.out.println(getNome()+"esta muito longe para atacar!");
			
		}
}
	}
