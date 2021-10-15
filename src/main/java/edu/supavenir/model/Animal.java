// Generated with g9.

package edu.supavenir.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name = "ANIMAL")
public class Animal implements Serializable {

	/** Primary key. */
	protected static final String PK = "id";

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	/**
	 * Access method for the lockFlag property.
	 *
	 * @return the current value of the lockFlag property
	 */
	public Integer getLockFlag() {
		return lockFlag;
	}

	/**
	 * Sets the value of the lockFlag property.
	 *
	 * @param aLockFlag the new value of the lockFlag property
	 */
	public void setLockFlag(Integer aLockFlag) {
		lockFlag = aLockFlag;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "DNAISSANCE")
	private LocalDate dnaissance;
	@Column(name = "SEXE", length = 50)
	private String sexe;
	@Column(name = "NOM", length = 50)
	private String nom;
	@Column(name = "DESCRIPTION", length = 500)
	private String description;
	@Column(name = "COULEUR", length = 50)
	private String couleur;
	@Column(name = "SOS", length = 1)
	private boolean sos;
	@Column(name = "ADOPTE", length = 1)
	private boolean adopte;
	@Column(name = "FRAIS", precision = 19, scale = 4)
	private BigDecimal frais;
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDRACE", nullable = true)
	private Race race;
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDESPECE", nullable = true)
	private Espece espece;
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDREFUGE", nullable = true) // nullable à mettre à false
	private Refuge refuge;
	@OneToMany(mappedBy = "animal")
	private Set<Incompatible> incompatible;
	@OneToMany(mappedBy = "animal")
	private Set<Adoption> adoption;

	/** Default constructor. */
	public Animal() {
		super();
	}

	/**
	 * Access method for id.
	 *
	 * @return the current value of id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter method for id.
	 *
	 * @param aId the new value for id
	 */
	public void setId(int aId) {
		id = aId;
	}

	/**
	 * Access method for dnaissance.
	 *
	 * @return the current value of dnaissance
	 */
	public LocalDate getDnaissance() {
		return dnaissance;
	}

	/**
	 * Setter method for dnaissance.
	 *
	 * @param aDnaissance the new value for dnaissance
	 */
	public void setDnaissance(LocalDate aDnaissance) {
		dnaissance = aDnaissance;
	}

	/**
	 * Access method for sexe.
	 *
	 * @return the current value of sexe
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * Setter method for sexe.
	 *
	 * @param aSexe the new value for sexe
	 */
	public void setSexe(String aSexe) {
		sexe = aSexe;
	}

	/**
	 * Access method for nom.
	 *
	 * @return the current value of nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter method for nom.
	 *
	 * @param aNom the new value for nom
	 */
	public void setNom(String aNom) {
		nom = aNom;
	}

	/**
	 * Access method for description.
	 *
	 * @return the current value of description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter method for description.
	 *
	 * @param aDescription the new value for description
	 */
	public void setDescription(String aDescription) {
		description = aDescription;
	}

	/**
	 * Access method for couleur.
	 *
	 * @return the current value of couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * Setter method for couleur.
	 *
	 * @param aCouleur the new value for couleur
	 */
	public void setCouleur(String aCouleur) {
		couleur = aCouleur;
	}

	/**
	 * Access method for sos.
	 *
	 * @return true if and only if sos is currently true
	 */
	public boolean getSos() {
		return sos;
	}

	/**
	 * Setter method for sos.
	 *
	 * @param aSos the new value for sos
	 */
	public void setSos(boolean aSos) {
		sos = aSos;
	}

	/**
	 * Access method for adopte.
	 *
	 * @return true if and only if adopte is currently true
	 */
	public boolean getAdopte() {
		return adopte;
	}

	/**
	 * Setter method for adopte.
	 *
	 * @param aAdopte the new value for adopte
	 */
	public void setAdopte(boolean aAdopte) {
		adopte = aAdopte;
	}

	/**
	 * Access method for frais.
	 *
	 * @return the current value of frais
	 */
	public BigDecimal getFrais() {
		return frais;
	}

	/**
	 * Setter method for frais.
	 *
	 * @param aFrais the new value for frais
	 */
	public void setFrais(BigDecimal aFrais) {
		frais = aFrais;
	}

	/**
	 * Access method for race.
	 *
	 * @return the current value of race
	 */
	public Race getRace() {
		return race;
	}

	/**
	 * Setter method for race.
	 *
	 * @param aRace the new value for race
	 */
	public void setRace(Race aRace) {
		race = aRace;
	}

	/**
	 * Access method for espece.
	 *
	 * @return the current value of espece
	 */
	public Espece getEspece() {
		return espece;
	}

	/**
	 * Setter method for espece.
	 *
	 * @param aEspece the new value for espece
	 */
	public void setEspece(Espece aEspece) {
		espece = aEspece;
	}

	/**
	 * Access method for refuge.
	 *
	 * @return the current value of refuge
	 */
	public Refuge getRefuge() {
		return refuge;
	}

	/**
	 * Setter method for refuge.
	 *
	 * @param aRefuge the new value for refuge
	 */
	public void setRefuge(Refuge aRefuge) {
		refuge = aRefuge;
	}

	/**
	 * Access method for incompatible.
	 *
	 * @return the current value of incompatible
	 */
	public Set<Incompatible> getIncompatible() {
		return incompatible;
	}

	/**
	 * Setter method for incompatible.
	 *
	 * @param aIncompatible the new value for incompatible
	 */
	public void setIncompatible(Set<Incompatible> aIncompatible) {
		incompatible = aIncompatible;
	}

	/**
	 * Access method for adoption.
	 *
	 * @return the current value of adoption
	 */
	public Set<Adoption> getAdoption() {
		return adoption;
	}

	/**
	 * Setter method for adoption.
	 *
	 * @param aAdoption the new value for adoption
	 */
	public void setAdoption(Set<Adoption> aAdoption) {
		adoption = aAdoption;
	}

	/**
	 * Compares the key for this instance with another Animal.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Animal and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Animal)) {
			return false;
		}
		Animal that = (Animal) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Animal.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Animal))
			return false;
		return this.equalKeys(other) && ((Animal) other).equalKeys(this);
	}

	/**
	 * Returns a hash code for this instance.
	 *
	 * @return Hash code
	 */
	@Override
	public int hashCode() {
		int i;
		int result = 17;
		i = getId();
		result = 37 * result + i;
		return result;
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Animal |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

	/**
	 * Return all elements of the primary key.
	 *
	 * @return Map of key names to values
	 */
	public Map<String, Object> getPrimaryKey() {
		Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
		ret.put("id", Integer.valueOf(getId()));
		return ret;
	}

}
