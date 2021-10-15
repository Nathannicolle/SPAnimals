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

@Entity(name="CARACTERISTIQUEESPECE")
@IdClass(Caracteristiqueespece.CaracteristiqueespeceId.class)
public class Caracteristiqueespece implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class CaracteristiqueespeceId implements Serializable {
        Espece espece;
        Caracteristique caracteristique;
    }

    /** Primary key. */
    protected static final String PK = "CaracteristiqueespeceConstraintC";

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
    @JoinColumn(name="IDESPECE", nullable=false)
    private Espece espece;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDCARACTERISTIQUE", nullable=false)
    private Caracteristique caracteristique;

    /** Default constructor. */
    public Caracteristiqueespece() {
        super();
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
     * Access method for caracteristique.
     *
     * @return the current value of caracteristique
     */
    public Caracteristique getCaracteristique() {
        return caracteristique;
    }

    /**
     * Setter method for caracteristique.
     *
     * @param aCaracteristique the new value for caracteristique
     */
    public void setCaracteristique(Caracteristique aCaracteristique) {
        caracteristique = aCaracteristique;
    }

    /** Temporary value holder for group key fragment especeId */
    private transient int tempEspeceId;

    /**
     * Gets the key fragment id for member espece.
     * If this.espece is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspeceId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Espece
     */
    public int getEspeceId() {
        return (getEspece() == null ? tempEspeceId : getEspece().getId());
    }

    /**
     * Sets the key fragment id from member espece.
     * If this.espece is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspeceId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Espece
     */
    public void setEspeceId(int aId) {
        if (getEspece() == null) {
            tempEspeceId = aId;
        } else {
            getEspece().setId(aId);
        }
    }

    /** Temporary value holder for group key fragment caracteristiqueId */
    private transient String tempCaracteristiqueId;

    /**
     * Gets the key fragment id for member caracteristique.
     * If this.caracteristique is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setCaracteristiqueId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Caracteristique
     */
    public String getCaracteristiqueId() {
        return (getCaracteristique() == null ? tempCaracteristiqueId : getCaracteristique().getId());
    }

    /**
     * Sets the key fragment id from member caracteristique.
     * If this.caracteristique is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getCaracteristiqueId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Caracteristique
     */
    public void setCaracteristiqueId(String aId) {
        if (getCaracteristique() == null) {
            tempCaracteristiqueId = aId;
        } else {
            getCaracteristique().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another Caracteristiqueespece.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Caracteristiqueespece and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Caracteristiqueespece)) {
            return false;
        }
        Caracteristiqueespece that = (Caracteristiqueespece) other;
        if (this.getEspeceId() != that.getEspeceId()) {
            return false;
        }
        Object myCaracteristiqueId = this.getCaracteristiqueId();
        Object yourCaracteristiqueId = that.getCaracteristiqueId();
        if (myCaracteristiqueId==null ? yourCaracteristiqueId!=null : !myCaracteristiqueId.equals(yourCaracteristiqueId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Caracteristiqueespece.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Caracteristiqueespece)) return false;
        return this.equalKeys(other) && ((Caracteristiqueespece)other).equalKeys(this);
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
        i = getEspeceId();
        result = 37*result + i;
        if (getCaracteristiqueId() == null) {
            i = 0;
        } else {
            i = getCaracteristiqueId().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Caracteristiqueespece |");
        sb.append(" especeId=").append(getEspeceId());
        sb.append(" caracteristiqueId=").append(getCaracteristiqueId());
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
        ret.put("especeId", Integer.valueOf(getEspeceId()));
        ret.put("caracteristiqueId", getCaracteristiqueId());
        return ret;
    }

}
