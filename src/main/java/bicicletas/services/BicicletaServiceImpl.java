package bicicletas.services;

import bicicletas.entities.Bicicleta;
import bicicletas.repositories.BicicletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by oscargutierrez on 4/29/19.
 */
@Service
public class BicicletaServiceImpl implements BicicletaService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    public Bicicleta crearActualizarBicicleta(Bicicleta bicicleta) {
        return bicicletaRepository.save(bicicleta);
    }

    public void borrarBicicletaPorId(Long biciId) {
        bicicletaRepository.deleteById(biciId);
    }
}
