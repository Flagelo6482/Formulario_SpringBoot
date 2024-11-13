package com.v1.formulariosThymeleaf.model;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Dona {


    private Integer cantidad;

    private String sabor;

    private String tamaño;

    private boolean relleno;

    private String lugarParaComer;
}
