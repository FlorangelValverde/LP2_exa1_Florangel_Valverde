package pe.edu.upeu.LP2_exa1_Florangel_Valverde.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.dao.Detalle_pedidoDao;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Detalle_pedido;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.service.Detalle_pedidoService;
@Service
public class Detalle_pedidoServiceImpl implements Detalle_pedidoService {
@Autowired
private Detalle_pedidoDao detalle_pedidoDao;
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
		return detalle_pedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}

}
