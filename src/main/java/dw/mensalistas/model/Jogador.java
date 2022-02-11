package dw.mensalistas.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "jogador")
public class Jogador {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cjogador;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String datanasc;

    @OneToMany(mappedBy = "jogador",fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<Pagamento> pagamentos;
   

    
    public Jogador(Integer cjogador, String nome, String email, String datanasc) {
        this.cjogador = cjogador;
        this.nome = nome;
        this.email = email;
        this.datanasc = datanasc;
        //this.pagamentos≃pagamentos;
    }
    
    public Jogador(){

    }
    
    public Integer getCjogador() {
        return cjogador;
    }

    public void setCjogador(Integer cjogador) {
        this.cjogador = cjogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
    

    @Override
    public String toString() {
        return "Jogador [cjogador=" + cjogador + ", datanasc=" + datanasc + ", email=" + email + ", nome=" + nome
                + "]";
    } 
    
    
}
