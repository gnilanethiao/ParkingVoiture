package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueService {

    @Autowired
    private MarqueRepository marqueRepository;
    public List<Marque> getMarques(){
        return this.marqueRepository.findAll();
    }

    public Optional<Marque> findMarque(String code){
        return this.marqueRepository.findById(code);
    }

    public void saveMarque(Marque marque){
        this.marqueRepository.save(marque);
    }

    public void deleteMarque(String code){
        this.marqueRepository.deleteById(code);
    }
    
}

