package ArenaHerois;

public class Arqueiro extends Personagens{
	

	public Arqueiro (String nome) {
		super (nome, 80, 20);
	}
	@Override
	public void atacar (Personagens oponente) {
		oponente.receberDano(this.getDanoBase());
		System.out.println(getNome()+"disparou a flecha em"+oponente.getNome()+"a distancia");
		
		}
	}

