package pe.edu.upc.aaw.wattify.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.wattify.dtos.TipoDispositivoDTO;
import pe.edu.upc.aaw.wattify.entities.TipoDispositivo;
import pe.edu.upc.aaw.wattify.serviceinterfaces.ITipoDispositivoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipos-dispositivos")
public class TipoDispositivoController {

    @Autowired
    private ITipoDispositivoService tipoDispositivoService;

    @PostMapping
    public void registrar(@RequestBody TipoDispositivoDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        TipoDispositivo tipoDispositivo = modelMapper.map(dto, TipoDispositivo.class);
        tipoDispositivoService.insert(tipoDispositivo);
    }

    @GetMapping
    public List<TipoDispositivoDTO> listar() {
        return tipoDispositivoService.list().stream().map(x -> {
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, TipoDispositivoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tipoDispositivoService.delete(id);
    }


}
