package com.fi.torreaop.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;

public class Pareja {
    private Integer hombre;
    private Integer mujer;

    // Constructor
    public Pareja() {}

    @XmlElement
    public Integer getHombre() {return this.hombre;}
    public void setHombre(Integer hombre) { this.hombre=hombre; }

    @XmlElement
    public Integer getMujer() {return this.mujer;}
    public void setMujer(Integer hombre) { this.hombre=mujer; }


}
