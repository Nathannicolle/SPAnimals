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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "RACE")
public class Race implements Serializable {

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

	@Column(name = "LIBELLE", length = 50)
	private String libelle;

	@Column(name = "DESCRIPTIF")
	private String descriptif;

	@Column(name = "PREREQUIS", length = 50)
	private String prerequis;

	@ManyToOne(optional = false)
	@JoinColumn(name = "IDESPECE", nullable = false)
	private Espece espece;

	@OneToMany(mappedBy = "race")
	@JsonIgnore
	private Set<Animal> animal;

	@OneToMany(mappedBy = "race")
	@JsonIgnore
	private Set<Caracteristiquerace> caracteristiquerace;

	/** Default constructor. */
	public Race() {
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
	 * Access method for libelle.
	 *
	 * @return the current value of libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter method for libelle.
	 *
	 * @param aLibelle the new value for libelle
	 */
	public void setLibelle(String aLibelle) {
		libelle = aLibelle;
	}

	/**
	 * Access method for descriptif.
	 *
	 * @return the current value of descriptif
	 */
	public String getDescriptif() {
		return descriptif;
	}

	/**
	 * Setter method for descriptif.
	 *
	 * @param aDescriptif the new value for descriptif
	 */
	public void setDescriptif(String aDescriptif) {
		descriptif = aDescriptif;
	}

	/**
	 * Access method for prerequis.
	 *
	 * @return the current value of prerequis
	 */
	public String getPrerequis() {
		return prerequis;
	}

	/**
	 * Setter method for prerequis.
	 *
	 * @param aPrerequis the new value for prerequis
	 */
	public void setPrerequis(String aPrerequis) {
		prerequis = aPrerequis;
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
	 * Access method for caracteristiquerace.
	 *
	 * @return the current value of caracteristiquerace
	 */
	public Set<Caracteristiquerace> getCaracteristiquerace() {
		return caracteristiquerace;
	}

	/**
	 * Setter method for caracteristiquerace.
	 *
	 * @param aCaracteristiquerace the new value for caracteristiquerace
	 */
	public void setCaracteristiquerace(Set<Caracteristiquerace> aCaracteristiquerace) {
		caracteristiquerace = aCaracteristiquerace;
	}

	/**
	 * Compares the key for this instance with another Race.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Race and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Race)) {
			return false;
		}
		Race that = (Race) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Race.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Race))
			return false;
		return this.equalKeys(other) && ((Race) other).equalKeys(this);
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
		StringBuffer sb = new StringBuffer("[Race |");
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
