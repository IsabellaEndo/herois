package ArenaHerois;

public abstract class Personagens {
	
	private String nome;
	private int vida;
	private int danoBase;
	private int posicao;
	
	public Personagens (String nome, int vida, int danoBase) {
		this.nome = nome;
		this.vida = vida;
		this.danoBase = danoBase;
		this.posicao = 0;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public void mover (int novaPosicao) {
		this.posicao = novaPosicao;
		System.out.println(nome +"se moveu para posicao" + novaPosicao);
	}
	public abstract void atacar (Personagens oponente);
	
	public void receberDano (int dano) {
		vida -= dano;
		if (vida < 0) {
			vida = 0;
		}
		System.out.println(nome + "recebeu" + dano + "de dano, vida restante:" + vida);
	}
	public int calcularDistancia(Personagens oponente) {
		return Math.abs(this.posicao = oponente.getPosicao());
	}

}
