package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.Client;
import com.FarmApp.FarmApp.Services.ClientsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/clients")
public class ClientsController {

    private final ClientsService clientsService;

    public ClientsController(ClientsService clientsService){
        this.clientsService = clientsService;
    }

    @GetMapping
    public List<Client> getClients(){
        return clientsService.getClients();
    }

    @PostMapping
    public void createClient(@RequestBody Client client) {
        clientsService.createClient(client);
    }

    @PutMapping(path = "{id}")
    public void updateClient(@PathVariable Long id, @RequestBody Client client) {
        clientsService.updateClient(id, client);
    }

    @DeleteMapping(path = "{id}")
    public void deleteClient(@PathVariable Long id){
        clientsService.deleteStudent(id);
    }
}
