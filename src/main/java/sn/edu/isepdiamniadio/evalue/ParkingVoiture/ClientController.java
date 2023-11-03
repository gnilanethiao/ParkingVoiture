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
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getClients(){
        return this.clientService.getClients();
    }

    @GetMapping("/{id}")
    public Client findClient(@PathVariable Integer id){
        Optional<Client> cli = this.clientService.findClient(id);
        return cli.orElse(null);

        }

        @DeleteMapping("/{id}")
        public void deleteClient(@PathVariable Integer id){
            this.clientService.deleteClient(id);

        }

        @PutMapping
        public void ajouterClient(@RequestBody Client client){
            this.clientService.saveClient(client);
        }
}
