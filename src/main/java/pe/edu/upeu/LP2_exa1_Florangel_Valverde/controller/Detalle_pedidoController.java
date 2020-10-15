package pe.edu.upeu.LP2_exa1_Florangel_Valverde.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity.Detalle_pedido;
import pe.edu.upeu.LP2_exa1_Florangel_Valverde.service.Detalle_pedidoService;


@RestController
@RequestMapping("/detalle_pedido")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>>listar(){
		return detalle_pedidoService.readAll();
	}
	@GetMapping("/{id}")
	public Detalle_pedido read (@PathVariable int id) {
		return detalle_pedidoService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return detalle_pedidoService.delete(id);
	}
	@PostMapping("/detalle_venta")
	public int create (@RequestBody Detalle_pedido detalle_pedido) {
		return detalle_pedidoService.create(detalle_pedido);
	}
	@PutMapping("edit/{id}")
	public int update (@RequestBody Detalle_pedido detalle_pedido, @PathVariable int id) {
		 Detalle_pedido d = detalle_pedidoService.read(id);
		d.setPrecio(detalle_pedido.getPrecio());
		d.setCantidad(detalle_pedido.getCantidad());
		d.setIdplatos(detalle_pedido.getIdplatos());
		d.setIdpedidos(detalle_pedido.getIddetalle_pedido());
		return detalle_pedidoService.update(d);
	}
	

}
