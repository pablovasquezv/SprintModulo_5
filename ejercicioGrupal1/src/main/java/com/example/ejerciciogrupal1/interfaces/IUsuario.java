package com.example.ejerciciogrupal1.interfaces;

import com.example.ejerciciogrupal1.models.Usuario;

import java.util.List;
//Interface IUsuario
public interface IUsuario {
    public boolean createUsuario(Usuario usuario) throws Exception;
    public boolean updateUsuario(Usuario usuario) throws Exception;
    public List<Usuario> listaUsuarios()throws Exception;
    public boolean eliminarUsuario(Usuario usuario) throws Exception;
}
