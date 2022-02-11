package dw.mensalistas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cpagamento;

    @Column
    private int ano;

    @Column
    private int mes;

    @Column
    private float valor;
    
   // @Column
    //private float cjogador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="jogador", nullable = false)    
    private Jogador jogador;

    public Pagamento(int cpagamento, int ano, int mes, float valor, Jogador jogador) {
        this.cpagamento = cpagamento;
        this.ano = ano;
        this.mes = mes;
        this.valor = valor;
        this.jogador=jogador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Pagamento(){
        
    }

    public int getCpagamento() {
        return cpagamento;
    }

    public void setCpagamento(int cpagamento) {
        this.cpagamento = cpagamento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    

    @Override
    public String toString() {
        return "Pagamento [ano=" + ano + ", cpagamento=" + cpagamento + ", mes=" + mes + ", valor=" + valor + "]";
    }

    
    
}
