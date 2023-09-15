package com.example.clase4gtics.controller;

import com.example.clase4gtics.entity.Mascotas;
import com.example.clase4gtics.repository.MascotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/mascotas")
public class MascotasController {

    final MascotaRepository mascotaRepository;

    public MascotasController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping(value = {"/list", ""})
    public String listarMascotas(Model model) {

        List<Mascotas> listamascotas = mascotaRepository.findAll();
        model.addAttribute("listamascotashtml", listamascotas);

        return "mascotas/list";
    }

    @GetMapping("/new")
    public String nuevaMascotaFrm() {
        return "mascotas/newFrm";
    }

    @PostMapping("/save")
    public String guardarNuevaMascotaFrm(Mascotas mascotas, RedirectAttributes attr) {
        mascotaRepository.save(mascotas);
        return "redirect:/mascotas/list";
    }

    @GetMapping("/edit")
    public String editarTransportista(Model model,
                                      @RequestParam("id") int id) {

        Optional<Mascotas> optMascotas = mascotaRepository.findById(id);

        if (optMascotas.isPresent()) {
            Mascotas mascotas = optMascotas.get();
            model.addAttribute("mascotas", mascotas);
            return "mascotas/editFrm";
        } else {
            return "redirect:/mascotas/list";
        }
    }

    @GetMapping("/delete")
    public String borrarMascota(Model model,
                                      @RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<Mascotas> optMascotas = mascotaRepository.findById(id);

        if (optMascotas.isPresent()) {
            mascotaRepository.deleteById(id);
        }
        return "redirect:/mascotas/list";
    }
}
