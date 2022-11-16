package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
public class Produit {
	
	enum scoreNutrionnel {
		A,
		B,
		C,
		D,
		E,
		F
		
	};
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "Marque")
	private Marque marque;
	
	@Column(name = "Nom" , nullable = false, unique = true)
	private String nom;
	
	@Column(name = "ScoreNutritionnel" , nullable = false)
	scoreNutrionnel scoreNutr;
	
	@ManyToMany
	@JoinColumn(name = "Ingredients")
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	@Column(name = "Energies" , nullable = true)
	private int energie;
	
	@Column(name = "Graisses" , nullable = true)
	private int graisse;
	
	@Column(name = "Sucres" , nullable = true)
	private int sucre;
	
	@Column(name = "Fibres" , nullable = true)
	private int fibre;
	
	@Column(name = "Proteines" , nullable = true)
	private int proteines;
	
	@Column(name = "Sel" , nullable = true)
	private int sel;
	
	@Column(name = "VitamineA100G" , nullable = true)
	private int vitA;
	
	@Column(name = "VitamineD100G" , nullable = true)
	private int vitD;
	
	@Column(name = "VitamineE100G" , nullable = true)
	private int vitE;
	
	@Column(name = "VitamineK100G" , nullable = true)
	private int vitK;
	
	@Column(name = "VitamineC100G" , nullable = true)
	private int vitC;
	
	@Column(name = "VitamineB1100G" , nullable = true)
	private int vitB;
	
	@Column(name = "VitamineB2100G" , nullable = true)
	private int vitB2;
	
	@Column(name = "VitaminePP100G" , nullable = true)
	private int vitPP;
	
	@Column(name = "VitamineB6100G" , nullable = true)
	private int vitB6;
	
	@Column(name = "VitamineB9100G" , nullable = true)
	private int vitB9;
	
	@Column(name = "VitamineB12100G" , nullable = true)
	private int vitB12;
	
	@Column(name = "Calcium100G" , nullable = true)
	private int cal;
	
	@Column(name = "Magnesium100G" , nullable = true)
	private int mag;
	
	@Column(name = "Iron100G" , nullable = true)
	private int iron;
	
	@Column(name = "Fer100G" , nullable = true)
	private int fer;
	
	@Column(name = "BetaCarotene100G" , nullable = true)
	private int beta;
	
	@Column(name = "HuilePalme" , nullable = true)
	private boolean huilePalm;
	
	@ManyToMany
	@JoinColumn(name = "Allergenes")
	private List<Allergene> allergenes = new ArrayList<Allergene>();
	
	@ManyToMany
	@JoinColumn(name = "Additifs")
	private List<Additif> additifs = new ArrayList<Additif>();

	/** Getter pour l'attribut id
	 * @return id renvois id 
	 */
	public Integer getId() {
		return id;
	}

	/** Getter pour l'attribut marque
	 * @return marque renvois marque 
	 */
	public Marque getMarque() {
		return marque;
	}

	/** Getter pour l'attribut nom
	 * @return nom renvois nom 
	 */
	public String getNom() {
		return nom;
	}

	/** Getter pour l'attribut scoreNutr
	 * @return scoreNutr renvois scoreNutr 
	 */
	public scoreNutrionnel getScoreNutr() {
		return scoreNutr;
	}

	/** Getter pour l'attribut ingredients
	 * @return ingredients renvois ingredients 
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/** Getter pour l'attribut energie
	 * @return energie renvois energie 
	 */
	public int getEnergie() {
		return energie;
	}

	/** Getter pour l'attribut graisse
	 * @return graisse renvois graisse 
	 */
	public int getGraisse() {
		return graisse;
	}

	/** Getter pour l'attribut sucre
	 * @return sucre renvois sucre 
	 */
	public int getSucre() {
		return sucre;
	}

	/** Getter pour l'attribut fibre
	 * @return fibre renvois fibre 
	 */
	public int getFibre() {
		return fibre;
	}

	/** Getter pour l'attribut proteines
	 * @return proteines renvois proteines 
	 */
	public int getProteines() {
		return proteines;
	}

	/** Getter pour l'attribut sel
	 * @return sel renvois sel 
	 */
	public int getSel() {
		return sel;
	}

	/** Getter pour l'attribut vitA
	 * @return vitA renvois vitA 
	 */
	public int getVitA() {
		return vitA;
	}

	/** Getter pour l'attribut vitD
	 * @return vitD renvois vitD 
	 */
	public int getVitD() {
		return vitD;
	}

	/** Getter pour l'attribut vitE
	 * @return vitE renvois vitE 
	 */
	public int getVitE() {
		return vitE;
	}

	/** Getter pour l'attribut vitK
	 * @return vitK renvois vitK 
	 */
	public int getVitK() {
		return vitK;
	}

	/** Getter pour l'attribut vitC
	 * @return vitC renvois vitC 
	 */
	public int getVitC() {
		return vitC;
	}

	/** Getter pour l'attribut vitB
	 * @return vitB renvois vitB 
	 */
	public int getVitB() {
		return vitB;
	}

	/** Getter pour l'attribut vitB2
	 * @return vitB2 renvois vitB2 
	 */
	public int getVitB2() {
		return vitB2;
	}

	/** Getter pour l'attribut vitPP
	 * @return vitPP renvois vitPP 
	 */
	public int getVitPP() {
		return vitPP;
	}

	/** Getter pour l'attribut vitB6
	 * @return vitB6 renvois vitB6 
	 */
	public int getVitB6() {
		return vitB6;
	}

	/** Getter pour l'attribut vitB9
	 * @return vitB9 renvois vitB9 
	 */
	public int getVitB9() {
		return vitB9;
	}

	/** Getter pour l'attribut vitB12
	 * @return vitB12 renvois vitB12 
	 */
	public int getVitB12() {
		return vitB12;
	}

	/** Getter pour l'attribut cal
	 * @return cal renvois cal 
	 */
	public int getCal() {
		return cal;
	}

	/** Getter pour l'attribut mag
	 * @return mag renvois mag 
	 */
	public int getMag() {
		return mag;
	}

	/** Getter pour l'attribut iron
	 * @return iron renvois iron 
	 */
	public int getIron() {
		return iron;
	}

	/** Getter pour l'attribut fer
	 * @return fer renvois fer 
	 */
	public int getFer() {
		return fer;
	}

	/** Getter pour l'attribut beta
	 * @return beta renvois beta 
	 */
	public int getBeta() {
		return beta;
	}

	/** Getter pour l'attribut huilePalm
	 * @return huilePalm renvois huilePalm 
	 */
	public boolean isHuilePalm() {
		return huilePalm;
	}

	/** Getter pour l'attribut allergenes
	 * @return allergenes renvois allergenes 
	 */
	public List<Allergene> getAllergenes() {
		return allergenes;
	}

	/** Getter pour l'attribut additifs
	 * @return additifs renvois additifs 
	 */
	public List<Additif> getAdditifs() {
		return additifs;
	}

	/** Setter pour l'attribut id
	 * @param id the id sauvegarde la valeur dans id the id  
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Setter pour l'attribut marque
	 * @param marque the marque sauvegarde la valeur dans marque the marque  
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom sauvegarde la valeur dans nom the nom  
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Setter pour l'attribut scoreNutr
	 * @param scoreNutr the scoreNutr sauvegarde la valeur dans scoreNutr the scoreNutr  
	 */
	public void setScoreNutr(scoreNutrionnel scoreNutr) {
		this.scoreNutr = scoreNutr;
	}

	/** Setter pour l'attribut ingredients
	 * @param ingredients the ingredients sauvegarde la valeur dans ingredients the ingredients  
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/** Setter pour l'attribut energie
	 * @param energie the energie sauvegarde la valeur dans energie the energie  
	 */
	public void setEnergie(int energie) {
		this.energie = energie;
	}

	/** Setter pour l'attribut graisse
	 * @param graisse the graisse sauvegarde la valeur dans graisse the graisse  
	 */
	public void setGraisse(int graisse) {
		this.graisse = graisse;
	}

	/** Setter pour l'attribut sucre
	 * @param sucre the sucre sauvegarde la valeur dans sucre the sucre  
	 */
	public void setSucre(int sucre) {
		this.sucre = sucre;
	}

	/** Setter pour l'attribut fibre
	 * @param fibre the fibre sauvegarde la valeur dans fibre the fibre  
	 */
	public void setFibre(int fibre) {
		this.fibre = fibre;
	}

	/** Setter pour l'attribut proteines
	 * @param proteines the proteines sauvegarde la valeur dans proteines the proteines  
	 */
	public void setProteines(int proteines) {
		this.proteines = proteines;
	}

	/** Setter pour l'attribut sel
	 * @param sel the sel sauvegarde la valeur dans sel the sel  
	 */
	public void setSel(int sel) {
		this.sel = sel;
	}

	/** Setter pour l'attribut vitA
	 * @param vitA the vitA sauvegarde la valeur dans vitA the vitA  
	 */
	public void setVitA(int vitA) {
		this.vitA = vitA;
	}

	/** Setter pour l'attribut vitD
	 * @param vitD the vitD sauvegarde la valeur dans vitD the vitD  
	 */
	public void setVitD(int vitD) {
		this.vitD = vitD;
	}

	/** Setter pour l'attribut vitE
	 * @param vitE the vitE sauvegarde la valeur dans vitE the vitE  
	 */
	public void setVitE(int vitE) {
		this.vitE = vitE;
	}

	/** Setter pour l'attribut vitK
	 * @param vitK the vitK sauvegarde la valeur dans vitK the vitK  
	 */
	public void setVitK(int vitK) {
		this.vitK = vitK;
	}

	/** Setter pour l'attribut vitC
	 * @param vitC the vitC sauvegarde la valeur dans vitC the vitC  
	 */
	public void setVitC(int vitC) {
		this.vitC = vitC;
	}

	/** Setter pour l'attribut vitB
	 * @param vitB the vitB sauvegarde la valeur dans vitB the vitB  
	 */
	public void setVitB(int vitB) {
		this.vitB = vitB;
	}

	/** Setter pour l'attribut vitB2
	 * @param vitB2 the vitB2 sauvegarde la valeur dans vitB2 the vitB2  
	 */
	public void setVitB2(int vitB2) {
		this.vitB2 = vitB2;
	}

	/** Setter pour l'attribut vitPP
	 * @param vitPP the vitPP sauvegarde la valeur dans vitPP the vitPP  
	 */
	public void setVitPP(int vitPP) {
		this.vitPP = vitPP;
	}

	/** Setter pour l'attribut vitB6
	 * @param vitB6 the vitB6 sauvegarde la valeur dans vitB6 the vitB6  
	 */
	public void setVitB6(int vitB6) {
		this.vitB6 = vitB6;
	}

	/** Setter pour l'attribut vitB9
	 * @param vitB9 the vitB9 sauvegarde la valeur dans vitB9 the vitB9  
	 */
	public void setVitB9(int vitB9) {
		this.vitB9 = vitB9;
	}

	/** Setter pour l'attribut vitB12
	 * @param vitB12 the vitB12 sauvegarde la valeur dans vitB12 the vitB12  
	 */
	public void setVitB12(int vitB12) {
		this.vitB12 = vitB12;
	}

	/** Setter pour l'attribut cal
	 * @param cal the cal sauvegarde la valeur dans cal the cal  
	 */
	public void setCal(int cal) {
		this.cal = cal;
	}

	/** Setter pour l'attribut mag
	 * @param mag the mag sauvegarde la valeur dans mag the mag  
	 */
	public void setMag(int mag) {
		this.mag = mag;
	}

	/** Setter pour l'attribut iron
	 * @param iron the iron sauvegarde la valeur dans iron the iron  
	 */
	public void setIron(int iron) {
		this.iron = iron;
	}

	/** Setter pour l'attribut fer
	 * @param fer the fer sauvegarde la valeur dans fer the fer  
	 */
	public void setFer(int fer) {
		this.fer = fer;
	}

	/** Setter pour l'attribut beta
	 * @param beta the beta sauvegarde la valeur dans beta the beta  
	 */
	public void setBeta(int beta) {
		this.beta = beta;
	}

	/** Setter pour l'attribut huilePalm
	 * @param huilePalm the huilePalm sauvegarde la valeur dans huilePalm the huilePalm  
	 */
	public void setHuilePalm(boolean huilePalm) {
		this.huilePalm = huilePalm;
	}

	/** Setter pour l'attribut allergenes
	 * @param allergenes the allergenes sauvegarde la valeur dans allergenes the allergenes  
	 */
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	/** Setter pour l'attribut additifs
	 * @param additifs the additifs sauvegarde la valeur dans additifs the additifs  
	 */
	public void setAdditifs(List<Additif> additifs) {
		this.additifs = additifs;
	}
	
	
	
	
	
}
