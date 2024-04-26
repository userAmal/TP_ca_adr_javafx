package application;

public class Person {
	public String prenom;
	public String nom;
	public String adremail;
	public Person(String prenom, String nom, String adremail) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.adremail = adremail;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdremail() {
		return adremail;
	}
	public void setAdremail(String adremail) {
		this.adremail = adremail;
	}
	@Override
	public String toString() {
		return "Person [prenom=" + prenom + ", nom=" + nom + ", adremail=" + adremail + "]";
	}
	
	
}
