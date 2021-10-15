// Generated with g9.

package edu.supavenir.spanimals.model;

import java.io.Serializable;
import java.sql.Clob;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ADOPTANT")
public class Adoptant implements Serializable {

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
    @Column(name="ID", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="NOM", nullable=false, length=50)
    private String nom;
    @Column(name="PRENOM", nullable=false, length=50)
    private String prenom;
    @Column(name="DATENAISS", nullable=false)
    private LocalDate datenaiss;
    @Column(name="NUMEROETRUE", length=50)
    private String numeroetrue;
    @Column(name="COMPLEMENTAD", nullable=false, length=100)
    private String complementad;
    @Column(name="CP", nullable=false, length=5)
    private String cp;
    @Column(name="VILLE", nullable=false, length=50)
    private String ville;
    @Column(name="MAIL", nullable=false, length=50)
    private String mail;
    @Column(name="TELMOBILE", nullable=false, length=10)
    private String telmobile;
    @Column(name="TELFIXE", nullable=false, length=10)
    private String telfixe;
    @Column(name="INFOCOMPLEMENTAIRES", nullable=false)
    private Clob infocomplementaires;
    @OneToMany(mappedBy="adoptant")
    private Set<Adoption> adoption;

    /** Default constructor. */
    public Adoptant() {
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
     * Access method for prenom.
     *
     * @return the current value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter method for prenom.
     *
     * @param aPrenom the new value for prenom
     */
    public void setPrenom(String aPrenom) {
        prenom = aPrenom;
    }

    /**
     * Access method for datenaiss.
     *
     * @return the current value of datenaiss
     */
    public LocalDate getDatenaiss() {
        return datenaiss;
    }

    /**
     * Setter method for datenaiss.
     *
     * @param aDatenaiss the new value for datenaiss
     */
    public void setDatenaiss(LocalDate aDatenaiss) {
        datenaiss = aDatenaiss;
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
     * Access method for mail.
     *
     * @return the current value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Setter method for mail.
     *
     * @param aMail the new value for mail
     */
    public void setMail(String aMail) {
        mail = aMail;
    }

    /**
     * Access method for telmobile.
     *
     * @return the current value of telmobile
     */
    public String getTelmobile() {
        return telmobile;
    }

    /**
     * Setter method for telmobile.
     *
     * @param aTelmobile the new value for telmobile
     */
    public void setTelmobile(String aTelmobile) {
        telmobile = aTelmobile;
    }

    /**
     * Access method for telfixe.
     *
     * @return the current value of telfixe
     */
    public String getTelfixe() {
        return telfixe;
    }

    /**
     * Setter method for telfixe.
     *
     * @param aTelfixe the new value for telfixe
     */
    public void setTelfixe(String aTelfixe) {
        telfixe = aTelfixe;
    }

    /**
     * Access method for infocomplementaires.
     *
     * @return the current value of infocomplementaires
     */
    public Clob getInfocomplementaires() {
        return infocomplementaires;
    }

    /**
     * Setter method for infocomplementaires.
     *
     * @param aInfocomplementaires the new value for infocomplementaires
     */
    public void setInfocomplementaires(Clob aInfocomplementaires) {
        infocomplementaires = aInfocomplementaires;
    }

    /**
     * Access method for adoption.
     *
     * @return the current value of adoption
     */
    public Set<Adoption> getAdoption() {
        return adoption;
    }

    /**
     * Setter method for adoption.
     *
     * @param aAdoption the new value for adoption
     */
    public void setAdoption(Set<Adoption> aAdoption) {
        adoption = aAdoption;
    }

    /**
     * Compares the key for this instance with another Adoptant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Adoptant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Adoptant)) {
            return false;
        }
        Adoptant that = (Adoptant) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Adoptant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Adoptant)) return false;
        return this.equalKeys(other) && ((Adoptant)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Adoptant |");
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
