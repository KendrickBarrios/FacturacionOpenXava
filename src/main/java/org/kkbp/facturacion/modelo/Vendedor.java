package org.kkbp.facturacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Vendedor {
	@Id
	@Column(length = 3)
	@Required
	int numero;
	
	@Column(length = 50)
	@Required
	String nombre;
	
	@Column(length = 8)
	@Required
	String telefono;
}
