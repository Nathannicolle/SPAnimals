// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name = "ADOPTION")
public class Adoption implements Serializable {

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
	@Column(name = "DATEADOPTION")
	private LocalDate dateadoption;
	@Column(name = "PARTICIPATION", precision = 19, scale = 4)
	private BigDecimal participation;
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDANIMAL", nullable = false)
	private Animal animal;
	@ManyToOne(optional = false)
	@JoinColumn(name = "IDADOPTANT", nullable = false)
	private Adoptant adoptant;

	/** Default constructor. */
	public Adoption() {
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
	 * Access method for dateadoption.
	 *
	 * @return the current value of dateadoption
	 */
	public LocalDate getDateadoption() {
		return dateadoption;
	}

	/**
	 * Setter method for dateadoption.
	 *
	 * @param aDateadoption the new value for dateadoption
	 */
	public void setDateadoption(LocalDate aDateadoption) {
		dateadoption = aDateadoption;
	}

	/**
	 * Access method for participation.
	 *
	 * @return the current value of participation
	 */
	public BigDecimal getParticipation() {
		return participation;
	}

	/**
	 * Setter method for participation.
	 *
	 * @param aParticipation the new value for participation
	 */
	public void setParticipation(BigDecimal aParticipation) {
		participation = aParticipation;
	}

	/**
	 * Access method for animal.
	 *
	 * @return the current value of animal
	 */
	public Animal getAnimal() {
		return animal;
	}

	/**
	 * Setter method for animal.
	 *
	 * @param aAnimal the new value for animal
	 */
	public void setAnimal(Animal aAnimal) {
		animal = aAnimal;
	}

	/**
	 * Access method for adoptant.
	 *
	 * @return the current value of adoptant
	 */
	public Adoptant getAdoptant() {
		return adoptant;
	}

	/**
	 * Setter method for adoptant.
	 *
	 * @param aAdoptant the new value for adoptant
	 */
	public void setAdoptant(Adoptant aAdoptant) {
		adoptant = aAdoptant;
	}

	/**
	 * Compares the key for this instance with another Adoption.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Adoption and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Adoption)) {
			return false;
		}
		Adoption that = (Adoption) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Adoption.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Adoption))
			return false;
		return this.equalKeys(other) && ((Adoption) other).equalKeys(this);
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
		StringBuffer sb = new StringBuffer("[Adoption |");
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
