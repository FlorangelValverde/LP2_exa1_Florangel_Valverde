package pe.edu.upeu.LP2_exa1_Florangel_Valverde.entity;

public class Detalle_pedido {
	private int iddetalle_pedido;
	private double precio;
	private int cantidad;
	private int idplatos;
	private int idpedidos;
	public Detalle_pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle_pedido(int iddetalle_pedido, double precio, int cantidad, int idplatos, int idpedidos) {
		super();
		this.iddetalle_pedido = iddetalle_pedido;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idplatos = idplatos;
		this.idpedidos = idpedidos;
	}
	public int getIddetalle_pedido() {
		return iddetalle_pedido;
	}
	public void setIddetalle_pedido(int iddetalle_pedido) {
		this.iddetalle_pedido = iddetalle_pedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdplatos() {
		return idplatos;
	}
	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}
	public int getIdpedidos() {
		return idpedidos;
	}
	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}

}
