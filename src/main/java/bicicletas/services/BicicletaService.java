package bicicletas.services;

import bicicletas.entities.Bicicleta;

/**
 * Created by oscargutierrez on 4/29/19.
 */
public interface BicicletaService {

    Bicicleta crearActualizarBicicleta(Bicicleta bicicleta);

    void borrarBicicletaPorId(Long biciId) ;
}
