package ma.enset.supplierservice.web;

import ma.enset.supplierservice.entities.Supplier;
import ma.enset.supplierservice.repositories.SupplierRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuppController {
    private SupplierRepository supplierRepository;

    public SuppController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    @GetMapping("/suppliers")
    List<Supplier> getall(){
        return supplierRepository.findAll();
    }

    @GetMapping("/suppliers/{id}")
    Supplier getbyId(@PathVariable("id") Long id){
        return supplierRepository.findById(id).get();
    }
}
