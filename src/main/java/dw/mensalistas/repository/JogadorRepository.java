package dw.mensalistas.repository;
//import org.springframework.*;
import org.springframework.data.jpa.repository.JpaRepository;
import dw.mensalistas.model.Jogador;
import java.util.List;


public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

	
    List<Jogador> findByCjogador(Integer cjogador);

    List<Jogador> findByNomeContaining(String nome);

    
}
