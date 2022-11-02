package com.cheque.notificador.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class cheque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Integer id;
    private String numero;
    private Double valor;
    private Date pagamento;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonIgnore
    private cliente cliente;



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }
}
