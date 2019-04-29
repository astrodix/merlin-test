package bicicletas.controller;

import bicicletas.entities.Bicicleta;
import bicicletas.services.BicicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by oscargutierrez on 4/29/19.
 */
public class AdministracionBicicletaV1Controller {

    @Autowired
    private BicicletaService bicicletaService;

    public ResponseEntity<Bicicleta> crearBicicleta(@RequestBody Bicicleta bicicleta){
        return new ResponseEntity<Bicicleta>(bicicletaService.crearActualizarBicicleta(bicicleta), HttpStatus.OK);
    }



}
