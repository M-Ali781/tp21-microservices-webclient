package ma.fstg.client.controllers;

import ma.fstg.client.entities.Client;
import ma.fstg.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception {
        return clientRepository.findById(id)
                .orElseThrow(() -> new Exception("Client introuvable avec l'id : " + id));
    }

    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
