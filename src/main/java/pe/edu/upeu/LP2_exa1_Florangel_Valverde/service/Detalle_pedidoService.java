package pe.edu.upeu.LP2_exa1_Florangel_Valverde.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	int create (Detalle_pedido d);
	int update (Detalle_pedido d);
	int delete (int id);
	Detalle_pedido read (int id);
	List<Map<String, Object>>readAll();

}
