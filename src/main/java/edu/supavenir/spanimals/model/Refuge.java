// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "REFUGE")
public class Refuge implements Serializable {

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
	@Column(name = "NOM", nullable = false, length = 100)
	private String nom;
	@Column(name = "LOCALISATION", length = 50)
	private String localisation;
	@Column(name = "NUMEROETRUE", length = 150)
	private String numeroetrue;
	@Column(name = "COMPLEMENTAD", length = 150)
	private String complementad;
	@Column(name = "CP", length = 5)
	private String cp;
	@Column(name = "VILLE", length = 50)
	private String ville;
	@Column(name = "TEL", length = 10)
	private String tel;
	@Column(name = "DESCRIPTION")
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "refuge")
	private Set<Horaire> horaire;
	
	@JsonIgnore
	@OneToMany(mappedBy = "refuge")
	private Set<Animal> animal;

	/** Default constructor. */
	public Refuge() {
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
	 * Access method for localisation.
	 *
	 * @return the current value of localisation
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * Setter method for localisation.
	 *
	 * @param aLocalisation the new value for localisation
	 */
	public void setLocalisation(String aLocalisation) {
		localisation = aLocalisation;
	}

	/**
	 * Access method for numeroetrue.
	 *
	 * @return the current value of numeroetrue
	 */
	public String getNumeroetrue() {
		return numeroetrue;
	}

	/**
	 * Setter method for numeroetrue.
	 *
	 * @param aNumeroetrue the new value for numeroetrue
	 */
	public void setNumeroetrue(String aNumeroetrue) {
		numeroetrue = aNumeroetrue;
	}

	/**
	 * Access method for complementad.
	 *
	 * @return the current value of complementad
	 */
	public String getComplementad() {
		return complementad;
	}

	/**
	 * Setter method for complementad.
	 *
	 * @param aComplementad the new value for complementad
	 */
	public void setComplementad(String aComplementad) {
		complementad = aComplementad;
	}

	/**
	 * Access method for cp.
	 *
	 * @return the current value of cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * Setter method for cp.
	 *
	 * @param aCp the new value for cp
	 */
	public void setCp(String aCp) {
		cp = aCp;
	}

	/**
	 * Access method for ville.
	 *
	 * @return the current value of ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter method for ville.
	 *
	 * @param aVille the new value for ville
	 */
	public void setVille(String aVille) {
		ville = aVille;
	}

	/**
	 * Access method for tel.
	 *
	 * @return the current value of tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * Setter method for tel.
	 *
	 * @param aTel the new value for tel
	 */
	public void setTel(String aTel) {
		tel = aTel;
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
	 * Access method for horaire.
	 *
	 * @return the current value of horaire
	 */
	public Set<Horaire> getHoraire() {
		return horaire;
	}

	/**
	 * Setter method for horaire.
	 *
	 * @param aHoraire the new value for horaire
	 */
	public void setHoraire(Set<Horaire> aHoraire) {
		horaire = aHoraire;
	}

	/**
	 * Access method for animal.
	 *
	 * @return the current value of animal
	 */
	public Set<Animal> getAnimal() {
		return animal;
	}

	/**
	 * Setter method for animal.
	 *
	 * @param aAnimal the new value for animal
	 */
	public void setAnimal(Set<Animal> aAnimal) {
		animal = aAnimal;
	}

	/**
	 * Compares the key for this instance with another Refuge.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Refuge and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Refuge)) {
			return false;
		}
		Refuge that = (Refuge) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Refuge.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Refuge))
			return false;
		return this.equalKeys(other) && ((Refuge) other).equalKeys(this);
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
		StringBuffer sb = new StringBuffer("[Refuge |");
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
