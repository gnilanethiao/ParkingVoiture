package sn.edu.isepdiamniadio.evalue.ParkingVoiture;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients() {
        return this.clientRepository.findAll();
    }

    public Optional<Client> findClient(Integer id) {
        return this.clientRepository.findById(id);
    }

    public void saveClient(Client client) {
        this.clientRepository.save(client);
    }

    public void deleteClient(Integer id) {
        this.clientRepository.deleteById(id);
    }
}
