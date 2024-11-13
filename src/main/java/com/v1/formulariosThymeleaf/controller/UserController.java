package com.v1.formulariosThymeleaf.controller;

import com.v1.formulariosThymeleaf.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> listaDeProfesiones = Arrays.asList("Programador", "Ingeniero", "Contador", "Doctor");
        model.addAttribute("profesiones", listaDeProfesiones);
        return "registrar_form";
    }

    @PostMapping("/registro")
    public String enviarFormulario(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        //Con bindingResult nos permite obtener los errores que tendremos al validar los datos
        //"Valid" se encarga de verificar que condiciones realizamos para los campos del objeto
        //Para recibir desde el front al controlador tenemos que usar el "@ModelAttribute" y asignarle a esta variable "user" sus campos datos correspondientes
        System.out.println(user.toString());

        //Con esto verificamos si tenemos errores, en caso sea asi retornamos nuevamente al formulario para indicar que errores están presentes y corregirlo
        //tambien enviamos la lista nuevamente(de profesiones)
        if(bindingResult.hasErrors()) {
            List<String> listaDeProfesiones = Arrays.asList("Programador", "Ingeniero", "Contador", "Doctor");
            model.addAttribute("profesiones", listaDeProfesiones);
            return "registrar_form";
        }
        return "registro_exitoso";
    }
}
