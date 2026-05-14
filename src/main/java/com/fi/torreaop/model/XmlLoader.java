package com.fi.torreaop.model;

import com.fi.torreaop.model.Usuario;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlLoader {
    public Usuario cargarUsuario(String rutaArchivo) throws Exception {
        File file = new File(rutaArchivo);
        JAXBContext jaxbContext = JAXBContext.newInstance(Usuario.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Usuario) jaxbUnmarshaller.unmarshal(file);
    }
}
