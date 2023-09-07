package pe.edu.upc.aaw.wattify.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.aaw.wattify.dtos.DetallePagoDTO;

import pe.edu.upc.aaw.wattify.entities.Detalle_pago;

import pe.edu.upc.aaw.wattify.serviceinterfaces.IDetallepagoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantepago")

public class DetallePagoController {

    @Autowired
    private IDetallepagoService mS;

    @PostMapping
    public void registrar(@RequestBody DetallePagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Detalle_pago dp = m.map(dto, Detalle_pago.class);
        mS.insert(dp);
    }

    @GetMapping
    public List<DetallePagoDTO> listar() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetallePagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @PostMapping("/buscarc")
    public List<DetallePagoDTO> buscar(@RequestBody int sub) {
        return mS.findBySub_total_pago(sub).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetallePagoDTO.class);
        }).collect(Collectors.toList());
    }
}
