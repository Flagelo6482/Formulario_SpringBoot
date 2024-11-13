package com.v1.formulariosThymeleaf.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {

    @Size(max = 20)
    @NotBlank
    private String nombre;

    @NotBlank
    @Email(message = "Ingrese el correo en formato email")
    private String email;

    @NotBlank
    @Size(min = 8, max = 15)
    private String password;

    @NotBlank
    private String genero;

    @Size(min = 5, max = 100)
    private String nota;

    @AssertTrue //Indica que este valor nos tiene que retornar un boolean y tiene que ser true el esperado
    private boolean matrimonio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @NotBlank
    private String profesion;

    @Min(value = 20000)
    @Max(value = 200_000)
    private long ingreso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isMatrimonio() {
        return matrimonio;
    }

    public void setMatrimonio(boolean matrimonio) {
        this.matrimonio = matrimonio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }
}
