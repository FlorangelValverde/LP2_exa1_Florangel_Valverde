package pe.edu.upeu.LP2_exa1_Florangel_Valverde.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.dao.Detalle_pedidoDao;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Detalle_pedido;

@Repository
public class Detalle_pedidoDaoImpl implements Detalle_pedidoDao {
@Autowired
private JdbcTemplate JdbcTemplate;
	@Override
	public int create(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle_pedido d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_pedido where iddetalle_pedido=?";
		return JdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Detalle_pedido>(Detalle_pedido.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select*from detalle_pedidp";
		return JdbcTemplate.queryForList(SQL);
	}

}
