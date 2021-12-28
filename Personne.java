package miniProjet;

public class Personne {
	private int id;
	private String genre;
	private String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Personne(int id, String genre, String nom) {
		super();
		this.id = id;
		this.genre = genre;
		this.nom = nom;
	}

}
