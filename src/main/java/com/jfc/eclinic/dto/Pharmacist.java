/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dto;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jfc
 */
@Entity
@Table(name = "pharmacist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pharmacist.findAll", query = "SELECT p FROM Pharmacist p")
    , @NamedQuery(name = "Pharmacist.findByPassCode", query = "SELECT p FROM Pharmacist p WHERE p.passCode = :passCode")
    , @NamedQuery(name = "Pharmacist.findByPharmacistId", query = "SELECT p FROM Pharmacist p WHERE p.pharmacistId = :pharmacistId")})
public class Pharmacist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "PassCode")
    private String passCode;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PharmacistId")
    private Integer pharmacistId;
    @JoinColumn(name = "PersonId", referencedColumnName = "PersonId")
    @ManyToOne(optional = false)
    private Person personId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacistId")
    private Collection<Order1> order1Collection;

    public Pharmacist() {
    }

    public Pharmacist(Integer pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public Pharmacist(Integer pharmacistId, String passCode) {
        this.pharmacistId = pharmacistId;
        this.passCode = passCode;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public Integer getPharmacistId() {
        return pharmacistId;
    }

    public void setPharmacistId(Integer pharmacistId) {
        this.pharmacistId = pharmacistId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @XmlTransient
    public Collection<Order1> getOrder1Collection() {
        return order1Collection;
    }

    public void setOrder1Collection(Collection<Order1> order1Collection) {
        this.order1Collection = order1Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pharmacistId != null ? pharmacistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pharmacist)) {
            return false;
        }
        Pharmacist other = (Pharmacist) object;
        if ((this.pharmacistId == null && other.pharmacistId != null) || (this.pharmacistId != null && !this.pharmacistId.equals(other.pharmacistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jfc.eclinic.dto.Pharmacist[ pharmacistId=" + pharmacistId + " ]";
    }
    
}
