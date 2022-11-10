package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Client;
import com.FarmApp.FarmApp.Repositories.ClientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {

    public final ClientsRepository clientsRepository;

    public ClientsService(ClientsRepository clientsRepository){
        this.clientsRepository = clientsRepository;
    }

    public List<Client> getClients(){
        return clientsRepository.findAll();
    }

    public void createClient(Client client) {
        clientsRepository.save(client);

    }

    public void updateClient(Long id, Client client) {
        Client clientToUpdate = clientsRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("ceva")));
        clientToUpdate.setName(client.getName());
        clientToUpdate.setAddress(client.getAddress());
        clientToUpdate.setEmail(client.getEmail());
        clientToUpdate.setPhone(client.getPhone());
        clientToUpdate.setLocation(client.getLocation());
        clientsRepository.save(clientToUpdate);
    }

    public void deleteStudent(Long id){
        clientsRepository.deleteById(id);
    }
}
