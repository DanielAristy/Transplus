package co.edu.uco.facturanet.transversal.enumeracion;

public enum CapaEnum {

	DATOS ("DATOS", "Capa de Datos de la aplicaci�n"),
	DOMINIO ("DOMINIO", "Capa de Dominio de la aplicaci�n"), 
	NEGOCIO ("NEGOCIO", "Capa de Negocio de la aplicaci�n"), 
	FACHADA ("FACHADA", "Capa de Fachada de la aplicaci�n"), 
	API ("API", "Capa Api de la aplicaci�n"), 
	DTO ("DTO", "Capa DTO de la aplicaci�n"), 
	TRANSVERSAL ("TRANSVERSAL", "Capa Transversal de la aplicaci�n"), 
	BACKEND ("BACKEND", "Capa BACKEND de la aplicaci�n");
	
	private String codigo;
	private String descripcion;
	
	private CapaEnum(String codigo, String descripcion) {
		setCodigo(codigo);
		setDescripcion(descripcion);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
}
