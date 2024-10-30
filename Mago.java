package ArenaHerois;

public class Mago extends Personagens{
	private int mana;
	
	public Mago(String nome) {
		super(nome, 100, 25);
		this.mana = 50;
	}
	@Override
	public void atacar (Personagens oponente) {
		if (mana >= 10) {
		    oponente.receberDano(this.getDanoBase() +15);
		    mana =- 18;
		    System.out.println(getNome()+"lançou um feitiço em" + oponente.getNome()+"a distancia");
	} else {
	
	System.out.println(getNome()+"nao tem mana o suficiente para atacar!");
}

}
}