package pe.edu.upc.aaw.wattify.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.wattify.dtos.MembresiaDTO;
import pe.edu.upc.aaw.wattify.entities.Membresia;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IMembresiaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresias")

public class MembresiaController {

    @Autowired
    private IMembresiaService mS;

    @PostMapping
    public void registrar(@RequestBody MembresiaDTO dto) {
        ModelMapper m = new ModelMapper();
        Membresia mb = m.map(dto, Membresia.class);
        mS.insert(mb);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MembresiaDTO> listar() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MembresiaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }


    @PostMapping("/buscarMembresia")
    public List<MembresiaDTO> buscar(@RequestBody LocalDate fecha) {
        return mS.findByFechaInicio(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MembresiaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody MembresiaDTO dto) {
        ModelMapper m = new ModelMapper();
        Membresia mb = m.map(dto, Membresia.class);
        mS.insert(mb);
    }
}
