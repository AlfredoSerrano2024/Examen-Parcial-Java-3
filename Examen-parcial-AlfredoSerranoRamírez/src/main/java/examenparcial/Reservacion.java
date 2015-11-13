/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Alfredo
 */
@Entity
@Table(name = "reservacion")
public class Reservacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reservacion")
    private Integer idReservacion;
    @Size(max = 128)
    @Column(name = "ciudad_destino")
    private String ciudadDestino;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "id_tarjeta", referencedColumnName = "id_tarjeta")
    @ManyToOne
    private Tarjeta idTarjeta;

    public Reservacion() {
    }

    public Reservacion(String ciudadDestino, Cliente idCliente, Tarjeta idTarjeta) {
        this.ciudadDestino = ciudadDestino;
        this.idCliente = idCliente;
        this.idTarjeta = idTarjeta;
    }

    public Reservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Tarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Tarjeta idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReservacion != null ? idReservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idReservacion == null && other.idReservacion != null) || (this.idReservacion != null && !this.idReservacion.equals(other.idReservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alfredo.examen.parcial.alfredoserrano.Reservacion[ idReservacion=" + idReservacion + " ]";
    }
    
}
