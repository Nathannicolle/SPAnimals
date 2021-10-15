// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="INCOMPATIBLE")
@IdClass(Incompatible.IncompatibleId.class)
public class Incompatible implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class IncompatibleId implements Serializable {
        Animal animal;
        Elementcomp elementcomp;
    }

    /** Primary key. */
    protected static final String PK = "IncompatibleConstraint7A";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
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

    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDANIMAL", nullable=false)
    private Animal animal;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDELEMENT", nullable=false)
    private Elementcomp elementcomp;

    /** Default constructor. */
    public Incompatible() {
        super();
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
     * Access method for elementcomp.
     *
     * @return the current value of elementcomp
     */
    public Elementcomp getElementcomp() {
        return elementcomp;
    }

    /**
     * Setter method for elementcomp.
     *
     * @param aElementcomp the new value for elementcomp
     */
    public void setElementcomp(Elementcomp aElementcomp) {
        elementcomp = aElementcomp;
    }

    /** Temporary value holder for group key fragment animalId */
    private transient int tempAnimalId;

    /**
     * Gets the key fragment id for member animal.
     * If this.animal is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setAnimalId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Animal
     */
    public int getAnimalId() {
        return (getAnimal() == null ? tempAnimalId : getAnimal().getId());
    }

    /**
     * Sets the key fragment id from member animal.
     * If this.animal is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getAnimalId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Animal
     */
    public void setAnimalId(int aId) {
        if (getAnimal() == null) {
            tempAnimalId = aId;
        } else {
            getAnimal().setId(aId);
        }
    }

    /** Temporary value holder for group key fragment elementcompId */
    private transient int tempElementcompId;

    /**
     * Gets the key fragment id for member elementcomp.
     * If this.elementcomp is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setElementcompId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Elementcomp
     */
    public int getElementcompId() {
        return (getElementcomp() == null ? tempElementcompId : getElementcomp().getId());
    }

    /**
     * Sets the key fragment id from member elementcomp.
     * If this.elementcomp is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getElementcompId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Elementcomp
     */
    public void setElementcompId(int aId) {
        if (getElementcomp() == null) {
            tempElementcompId = aId;
        } else {
            getElementcomp().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another Incompatible.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Incompatible and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Incompatible)) {
            return false;
        }
        Incompatible that = (Incompatible) other;
        if (this.getAnimalId() != that.getAnimalId()) {
            return false;
        }
        if (this.getElementcompId() != that.getElementcompId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Incompatible.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Incompatible)) return false;
        return this.equalKeys(other) && ((Incompatible)other).equalKeys(this);
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
        i = getAnimalId();
        result = 37*result + i;
        i = getElementcompId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Incompatible |");
        sb.append(" animalId=").append(getAnimalId());
        sb.append(" elementcompId=").append(getElementcompId());
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
        ret.put("animalId", Integer.valueOf(getAnimalId()));
        ret.put("elementcompId", Integer.valueOf(getElementcompId()));
        return ret;
    }

}
