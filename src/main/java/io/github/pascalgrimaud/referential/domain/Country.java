package io.github.pascalgrimaud.referential.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Country.
 */
@Entity
@Table(name = "country")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "code_alpha_2", nullable = false, unique = true)
    private String codeAlpha2;

    @NotNull
    @Column(name = "code_alpha_3", nullable = false)
    private String codeAlpha3;

    @Column(name = "continent")
    private String continent;

    @Column(name = "indicatif")
    private String indicatif;

    @Column(name = "source")
    private String source;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Country name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeAlpha2() {
        return codeAlpha2;
    }

    public Country codeAlpha2(String codeAlpha2) {
        this.codeAlpha2 = codeAlpha2;
        return this;
    }

    public void setCodeAlpha2(String codeAlpha2) {
        this.codeAlpha2 = codeAlpha2;
    }

    public String getCodeAlpha3() {
        return codeAlpha3;
    }

    public Country codeAlpha3(String codeAlpha3) {
        this.codeAlpha3 = codeAlpha3;
        return this;
    }

    public void setCodeAlpha3(String codeAlpha3) {
        this.codeAlpha3 = codeAlpha3;
    }

    public String getContinent() {
        return continent;
    }

    public Country continent(String continent) {
        this.continent = continent;
        return this;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIndicatif() {
        return indicatif;
    }

    public Country indicatif(String indicatif) {
        this.indicatif = indicatif;
        return this;
    }

    public void setIndicatif(String indicatif) {
        this.indicatif = indicatif;
    }

    public String getSource() {
        return source;
    }

    public Country source(String source) {
        this.source = source;
        return this;
    }

    public void setSource(String source) {
        this.source = source;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Country)) {
            return false;
        }
        return id != null && id.equals(((Country) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Country{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", codeAlpha2='" + getCodeAlpha2() + "'" +
            ", codeAlpha3='" + getCodeAlpha3() + "'" +
            ", continent='" + getContinent() + "'" +
            ", indicatif='" + getIndicatif() + "'" +
            ", source='" + getSource() + "'" +
            "}";
    }
}
