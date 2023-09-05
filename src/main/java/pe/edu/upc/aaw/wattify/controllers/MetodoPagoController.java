

// MetodoPagoController.java
package pe.edu.upc.aaw.wattify.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.wattify.dtos.MetodoPagoDTO;
import pe.edu.upc.aaw.wattify.entities.MetodoPago;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metodosPago")  // Cambiado de "/membresias" a "/metodosPago"
public class MetodoPagoController {

    @Autowired
    private IMetodoPagoService mS;

    @Autowired  // Inyecta el ModelMapper
    private ModelMapper modelMapper;

    @PostMapping
    public void registrar(@RequestBody MetodoPagoDTO dto) {
        MetodoPago mb = modelMapper.map(dto, MetodoPago.class);
        mS.insert(mb);
    }

    @GetMapping
    public List<MetodoPagoDTO> listar() {
        return mS.list().stream().map(x -> modelMapper.map(x, MetodoPagoDTO.class)).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }
}
