package com.v1.formulariosThymeleaf.model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Persona {

    @NotBlank
    private String nombre;

    @NotBlank
    private String correo;

    @NotBlank
    private String contraseña;
}
