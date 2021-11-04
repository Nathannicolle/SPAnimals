// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="HORAIRE")
@IdClass(Horaire.HoraireId.class)
public class Horaire implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class HoraireId implements Serializable {
        Refuge refuge;
        Joursemaine joursemaine;
        Plage plage;
        public HoraireId(){}
    }

    /** Primary key. */
    protected static final String PK = "HoraireConstraint6";

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

    @JsonIgnore
    @Column(name="HDEBUT")
    private LocalTime hdebut;
    
    @JsonIgnore
    @Column(name="HFIN")
    private LocalTime hfin;
    
    @JsonIgnore
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDREFUGE", nullable=false)
    private Refuge refuge;
    
    @JsonIgnore
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDJOUR", nullable=false)
    private Joursemaine joursemaine;
    
    @JsonIgnore
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="IDPLAGE", nullable=false)
    private Plage plage;

    /** Default constructor. */
    public Horaire() {
        super();
    }

    /**
     * Access method for hdebut.
     *
     * @return the current value of hdebut
     */
    public LocalTime getHdebut() {
        return hdebut;
    }

    /**
     * Setter method for hdebut.
     *
     * @param aHdebut the new value for hdebut
     */
    public void setHdebut(LocalTime aHdebut) {
        hdebut = aHdebut;
    }

    /**
     * Access method for hfin.
     *
     * @return the current value of hfin
     */
    public LocalTime getHfin() {
        return hfin;
    }

    /**
     * Setter method for hfin.
     *
     * @param aHfin the new value for hfin
     */
    public void setHfin(LocalTime aHfin) {
        hfin = aHfin;
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
     * Access method for joursemaine.
     *
     * @return the current value of joursemaine
     */
    public Joursemaine getJoursemaine() {
        return joursemaine;
    }

    /**
     * Setter method for joursemaine.
     *
     * @param aJoursemaine the new value for joursemaine
     */
    public void setJoursemaine(Joursemaine aJoursemaine) {
        joursemaine = aJoursemaine;
    }

    /**
     * Access method for plage.
     *
     * @return the current value of plage
     */
    public Plage getPlage() {
        return plage;
    }

    /**
     * Setter method for plage.
     *
     * @param aPlage the new value for plage
     */
    public void setPlage(Plage aPlage) {
        plage = aPlage;
    }

    /** Temporary value holder for group key fragment refugeId */
    private transient int tempRefugeId;

    /**
     * Gets the key fragment id for member refuge.
     * If this.refuge is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRefugeId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Refuge
     */
    public int getRefugeId() {
        return (getRefuge() == null ? tempRefugeId : getRefuge().getId());
    }

    /**
     * Sets the key fragment id from member refuge.
     * If this.refuge is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRefugeId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Refuge
     */
    public void setRefugeId(int aId) {
        if (getRefuge() == null) {
            tempRefugeId = aId;
        } else {
            getRefuge().setId(aId);
        }
    }

    /** Temporary value holder for group key fragment joursemaineId */
    private transient int tempJoursemaineId;

    /**
     * Gets the key fragment id for member joursemaine.
     * If this.joursemaine is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setJoursemaineId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Joursemaine
     */
    public int getJoursemaineId() {
        return (getJoursemaine() == null ? tempJoursemaineId : getJoursemaine().getId());
    }

    /**
     * Sets the key fragment id from member joursemaine.
     * If this.joursemaine is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getJoursemaineId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Joursemaine
     */
    public void setJoursemaineId(int aId) {
        if (getJoursemaine() == null) {
            tempJoursemaineId = aId;
        } else {
            getJoursemaine().setId(aId);
        }
    }

    /** Temporary value holder for group key fragment plageId */
    private transient int tempPlageId;

    /**
     * Gets the key fragment id for member plage.
     * If this.plage is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setPlageId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Plage
     */
    public int getPlageId() {
        return (getPlage() == null ? tempPlageId : getPlage().getId());
    }

    /**
     * Sets the key fragment id from member plage.
     * If this.plage is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getPlageId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Plage
     */
    public void setPlageId(int aId) {
        if (getPlage() == null) {
            tempPlageId = aId;
        } else {
            getPlage().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another Horaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Horaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Horaire)) {
            return false;
        }
        Horaire that = (Horaire) other;
        if (this.getRefugeId() != that.getRefugeId()) {
            return false;
        }
        if (this.getJoursemaineId() != that.getJoursemaineId()) {
            return false;
        }
        if (this.getPlageId() != that.getPlageId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Horaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Horaire)) return false;
        return this.equalKeys(other) && ((Horaire)other).equalKeys(this);
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
        i = getRefugeId();
        result = 37*result + i;
        i = getJoursemaineId();
        result = 37*result + i;
        i = getPlageId();
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
        StringBuffer sb = new StringBuffer("[Horaire |");
        sb.append(" refugeId=").append(getRefugeId());
        sb.append(" joursemaineId=").append(getJoursemaineId());
        sb.append(" plageId=").append(getPlageId());
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
        ret.put("refugeId", Integer.valueOf(getRefugeId()));
        ret.put("joursemaineId", Integer.valueOf(getJoursemaineId()));
        ret.put("plageId", Integer.valueOf(getPlageId()));
        return ret;
    }

}
