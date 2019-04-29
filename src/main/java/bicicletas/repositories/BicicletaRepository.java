package bicicletas.repositories;

import bicicletas.entities.Bicicleta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by oscargutierrez on 4/29/19.
 */
@Service
public interface BicicletaRepository extends CrudRepository<Bicicleta, Long> {

}
