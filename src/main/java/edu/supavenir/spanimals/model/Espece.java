// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="ESPECE")
public class Espece implements Serializable {

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
    @Column(name="LIBELLE", nullable=false, length=50)
    private String libelle;
    @Column(name="FRAIS", precision=19, scale=4)
    private BigDecimal frais;
    @OneToMany(mappedBy="espece")
    private Set<Race> race;
    @OneToMany(mappedBy="espece")
    private Set<Animal> animal;
    @OneToMany(mappedBy="espece")
    private Set<Caracteristiqueespece> caracteristiqueespece;

    /** Default constructor. */
    public Espece() {
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
    public Set<Race> getRace() {
        return race;
    }

    /**
     * Setter method for race.
     *
     * @param aRace the new value for race
     */
    public void setRace(Set<Race> aRace) {
        race = aRace;
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
     * Compares the key for this instance with another Espece.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Espece and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Espece)) {
            return false;
        }
        Espece that = (Espece) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Espece.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Espece)) return false;
        return this.equalKeys(other) && ((Espece)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Espece |");
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
