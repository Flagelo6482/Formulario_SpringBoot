package com.v1.formulariosThymeleaf.controller;

import com.v1.formulariosThymeleaf.model.Dona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DonaController {

    @GetMapping("/pedido")
    public String pedidoDeDona(Model model) {
        Dona dona = new Dona();
        model.addAttribute("dona", dona);

        List<String> sabores = Arrays.asList("Fresa", "Chocolate", "Vainilla", "Frambuesa");
        model.addAttribute("listaDeSabores", sabores);
        return "pedido_form";
    }

    @PostMapping("/pedido")
    public String mostrarPedido(@ModelAttribute Dona dona) {
        //Recibimos el modelo "Dona" rellenado del formulario
        System.out.println(dona.toString());
        return "pedido_dona_exitoso";
    }
}
