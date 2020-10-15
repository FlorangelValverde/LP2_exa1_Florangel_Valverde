package pe.edu.upeu.LP2_exa1_Florangel_Valverde.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);

    int update(Usuario u);

    int delete(int id);

    Usuario read(int id);

    List<Map<String, Object>> readAll();

}

