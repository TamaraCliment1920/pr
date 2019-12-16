package serpis.ad;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Data fecha;
	private String nombre;
	private BigDecimal importe;
	
	public Long getId() {
		return id;
	}
	
	public void setId (Long id) {
		this.id =id;
	}
	public Data getfecha() {
		return fecha;
		}
	
	public void setfecha (Data fecha) {
		this.fecha =fecha;
	}
	public String getnombre() {
		return nombre;
		}
	
	public void setnombre (String nombre) {
		this.nombre =nombre;
	}
	public BigDecimal getimporte() {
		return importe;
		}
	
	public void setimporte (BigDecimal importe) {
		this.importe =importe;
	}
}
