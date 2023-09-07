package pe.edu.upc.aaw.wattify.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.wattify.dtos.ComprobantePagoDTO;
import pe.edu.upc.aaw.wattify.entities.Comprobante_pago;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IComprobantePagoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantepago")

public class ComprobantePagoController {

    @Autowired
    private IComprobantePagoService mS;

    @PostMapping
    public void registrar(@RequestBody ComprobantePagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Comprobante_pago cp = m.map(dto, Comprobante_pago.class);
        mS.insert(cp);
    }

    @GetMapping
    public List<ComprobantePagoDTO> listar() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComprobantePagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }


}

