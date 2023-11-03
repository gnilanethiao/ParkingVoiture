package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/marques")
public class MarqueController {
    
    @Autowired
    private MarqueService marqueService;

    @GetMapping
    public List<Marque> getMarques(){
        return this.marqueService.getMarques();
    }

    @GetMapping("/{code}")
    public Marque findMarque(@PathVariable String code){
        Optional<Marque> mar = this.marqueService.findMarque(code);
        return mar.orElse(null);
    }

    @DeleteMapping("/{code}")
    public void deleteMarque(@PathVariable String code){
        this.marqueService.deleteMarque(code);
    }

    @PutMapping
    public void ajouterMarque(@RequestBody Marque marque){
        this.marqueService.saveMarque(marque);
    }

}