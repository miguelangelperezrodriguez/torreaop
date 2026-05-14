package com.fi.torreaop.model.service;

import com.fi.torreaop.model.Usuario;
import com.fi.torreaop.model.XmlLoader;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public void procesarXml() {
        try {
            XmlLoader loader = new XmlLoader();
            Usuario user = loader.cargarUsuario("src/main/resources/usuario.xml");
            System.out.println(user.getNaturaleza1());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
