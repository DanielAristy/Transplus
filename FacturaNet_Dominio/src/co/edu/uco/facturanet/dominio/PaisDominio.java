package co.edu.uco.facturanet.dominio;

import org.apache.commons.lang3.StringUtils;

import co.edu.uco.facturanet.transversal.enumeracion.CapaEnum;
import co.edu.uco.facturanet.transversal.excepcion.FacturanetException;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name= "FAC_PAIS_TBL", schema = "dbo")
public class PaisDominio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IN_CODIGO", nullable = false)
	private int codigo;
	
	@Column(name = "NV_NOMBRE", nullable = false, length = 500)
	private String nombre;
	
	public PaisDominio() {
		setNombre(null);
	}
	
	public PaisDominio(int codigo, String nombre) {
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	public void setCodigo(int codigo) {
		
		if (codigo < 0) {
				throw FacturanetException.CREAR("El codigo de un pa�s no puede ser menor que 0", CapaEnum.DOMINIO);
			}
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		String nombreTmp = StringUtils.trimToEmpty(nombre);
		if (nombreTmp.length() > 0 ) {
			if (nombreTmp.length() > 500 ) {
				throw FacturanetException.CREAR("El nombre del pa�s no puede tener mas de 500 caracteres", CapaEnum.DOMINIO);
			}
			if (!nombreTmp.matches("^[a-zA-Z������������ ]+$")) {
				throw FacturanetException.CREAR("El nombre del pa�s ingresado no es valido", CapaEnum.DOMINIO);
			}
		}
		this.nombre = nombreTmp;
	}
	

}
