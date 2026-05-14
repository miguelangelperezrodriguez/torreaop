package com.fi.torreaop.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "usuario")
    public class Usuario {

    private List<Pareja> listaParejas;
    private Integer naturaleza1;
    private Integer naturaleza2;
    private Integer naturaleza3;
    private List<Integer> valores;

    @XmlElement
    public Integer getNaturaleza1() {
        return naturaleza1;
    }
    @XmlElement
    public void setNaturaleza1(Integer naturaleza1) {
        this.naturaleza1 = naturaleza1;
    }

    @XmlElement
    public Integer getNaturaleza2() {
        return naturaleza2;
    }

    @XmlElement
    public void setNaturaleza2(Integer naturaleza2) {
        this.naturaleza2 = naturaleza2;
    }

    @XmlElement
    public Integer getNaturaleza3() {
        return naturaleza3;
    }

    @XmlElement
    public void setNaturaleza3(Integer naturaleza3) {
        this.naturaleza3 = naturaleza3;
    }

    @XmlElementWrapper(name="parejas")
    @XmlElement(name="pareja")
    public List<Pareja> getListaParejas() { return listaParejas;}

    @XmlElementWrapper(name="valores")
    @XmlElement(name="valor")
    public List<Integer> getListaValores() { return valores;}


    }
