// Generated with g9.

package edu.supavenir.model;

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

@Entity(name="CARACTERISTIQUERACE")
@IdClass(Caracteristiquerace.CaracteristiqueraceId.class)
public class Caracteristiquerace implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class CaracteristiqueraceId implements Serializable {
        Caracteristique caracteristique;
        Race race;
    }

    /** Primary key. */
    protected static final String PK = "CaracteristiqueraceConstraint7B";

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

    @Column(name="VALEUR", length=50)
    private String valeur;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDCARACTERISTIQUE", nullable=false)
    private Caracteristique caracteristique;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDRACE", nullable=false)
    private Race race;

    /** Default constructor. */
    public Caracteristiquerace() {
        super();
    }

    /**
     * Access method for valeur.
     *
     * @return the current value of valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * Setter method for valeur.
     *
     * @param aValeur the new value for valeur
     */
    public void setValeur(String aValeur) {
        valeur = aValeur;
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

    /** Temporary value holder for group key fragment raceId */
    private transient int tempRaceId;

    /**
     * Gets the key fragment id for member race.
     * If this.race is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRaceId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Race
     */
    public int getRaceId() {
        return (getRace() == null ? tempRaceId : getRace().getId());
    }

    /**
     * Sets the key fragment id from member race.
     * If this.race is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRaceId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Race
     */
    public void setRaceId(int aId) {
        if (getRace() == null) {
            tempRaceId = aId;
        } else {
            getRace().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another Caracteristiquerace.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Caracteristiquerace and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Caracteristiquerace)) {
            return false;
        }
        Caracteristiquerace that = (Caracteristiquerace) other;
        Object myCaracteristiqueId = this.getCaracteristiqueId();
        Object yourCaracteristiqueId = that.getCaracteristiqueId();
        if (myCaracteristiqueId==null ? yourCaracteristiqueId!=null : !myCaracteristiqueId.equals(yourCaracteristiqueId)) {
            return false;
        }
        if (this.getRaceId() != that.getRaceId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Caracteristiquerace.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Caracteristiquerace)) return false;
        return this.equalKeys(other) && ((Caracteristiquerace)other).equalKeys(this);
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
        if (getCaracteristiqueId() == null) {
            i = 0;
        } else {
            i = getCaracteristiqueId().hashCode();
        }
        result = 37*result + i;
        i = getRaceId();
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
        StringBuffer sb = new StringBuffer("[Caracteristiquerace |");
        sb.append(" caracteristiqueId=").append(getCaracteristiqueId());
        sb.append(" raceId=").append(getRaceId());
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
        ret.put("caracteristiqueId", getCaracteristiqueId());
        ret.put("raceId", Integer.valueOf(getRaceId()));
        return ret;
    }

}
