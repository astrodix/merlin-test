CREATE TABLE BICICLETA(
  bici_id IDENTITY NOT NULL,
  model character VARYING (20) not null,
  color character VARYING (15) not null,
  price int not null,
  rin_size int
);

ALTER TABLE public.bicicleta
    ADD PRIMARY KEY (bici_id)
;

COMMENT on COLUMN bicicleta.model is 'Modelo de la bicicleta';
COMMENT on COLUMN bicicleta.color is 'Color de la bicicleta';
COMMENT on COLUMN bicicleta.price is 'Precio de la bicicleta';
COMMENT on COLUMN bicicleta.rin_size is 'Tamaño del rin';



