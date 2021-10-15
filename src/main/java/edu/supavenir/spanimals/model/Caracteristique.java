// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="CARACTERISTIQUE")
public class Caracteristique implements Serializable {

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
    @Column(name="ID", unique=true, nullable=false, length=50)
    private String id;
    @Column(name="LIBELLE", length=50)
    private String libelle;
    @OneToMany(mappedBy="caracteristique")
    private Set<Caracteristiquerace> caracteristiquerace;
    @OneToMany(mappedBy="caracteristique")
    private Set<Caracteristiqueespece> caracteristiqueespece;

    /** Default constructor. */
    public Caracteristique() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(String aId) {
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
     * Access method for caracteristiqueespece.
     *
     * @return the current value of caracteristiqueespece
     */
    public Set<Caracteristiqueespece> getCaracteristiqueespece() {
        return caracteristiqueespece;
    }

    /**
     * Setter method for caracteristiqueespece.
     *
     * @param aCaracteristiqueespece the new value for caracteristiqueespece
     */
    public void setCaracteristiqueespece(Set<Caracteristiqueespece> aCaracteristiqueespece) {
        caracteristiqueespece = aCaracteristiqueespece;
    }

    /**
     * Compares the key for this instance with another Caracteristique.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Caracteristique and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Caracteristique)) {
            return false;
        }
        Caracteristique that = (Caracteristique) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Caracteristique.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Caracteristique)) return false;
        return this.equalKeys(other) && ((Caracteristique)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Caracteristique |");
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
        ret.put("id", getId());
        return ret;
    }

}
