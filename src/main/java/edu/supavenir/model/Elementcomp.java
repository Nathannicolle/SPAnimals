// Generated with g9.

package edu.supavenir.model;

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

@Entity(name="ELEMENTCOMP")
public class Elementcomp implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="LIBELLE", length=50)
    private String libelle;
    @OneToMany(mappedBy="elementcomp")
    private Set<Incompatible> incompatible;

    /** Default constructor. */
    public Elementcomp() {
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
     * Compares the key for this instance with another Elementcomp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Elementcomp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Elementcomp)) {
            return false;
        }
        Elementcomp that = (Elementcomp) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Elementcomp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Elementcomp)) return false;
        return this.equalKeys(other) && ((Elementcomp)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Elementcomp |");
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
