package pe.edu.upeu.LP2_exa1_Florangel_Valverde.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Usuario;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.service.UsuarioService;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.dao.UsuarioDao;
@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}
	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
