package pe.edu.upeu.LP2_exa1_Florangel_Valverde.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.dao.UsuarioDao;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
@Autowired
private JdbcTemplate JdbcTemplate;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "insert into usuario (nomuser, clave,idpersonas values (?,?,?))";
		return JdbcTemplate.update(SQL,u.getNomuser(),u.getClave(),u.getIdpersonas());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "update usuario set nomuser =?, clave =?,idpersonas=? where idusuario=?";
		return JdbcTemplate.update(SQL,u.getNomuser(), u.getClave(),u.getIdpersonas(), u.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from usuario where idusuario=?";
		return JdbcTemplate.update(SQL,id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where idusuario=?";
		return JdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select*from usuario";
		return JdbcTemplate.queryForList(SQL);
	}
	
	@Override
	public Usuario read (String nomuser) {
		String SQL = "select * from usuario where nomuser=?";
				return JdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	
	}

}
