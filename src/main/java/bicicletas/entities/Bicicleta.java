package bicicletas.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by oscargutierrez on 4/29/19.
 */
@Entity
@Data
public class Bicicleta {

    @Id
    @Column(name = "bici_id")
    private Long biciId;

    private String model;

    private String color;

    private int price;

    @Column(name = "rin_size")
    private int rinSize;


}
