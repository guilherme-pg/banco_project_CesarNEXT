package school.cesar.nib.repositories;

import school.cesar.nib.entities.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    private static final ClientRepository INSTANCIA = new ClientRepository();

    private List<Client> clients;

    private ClientRepository(){
        clients = new ArrayList<>();
    }

    public static ClientRepository getInstancia(){
        return INSTANCIA;
    }

    public void salvar(Client client){
        clients.add(client);
    }

    public Client buscar(String cpf){
        for (int i = 0; i < clients.size(); i++) {
            if(clients.get(i).getCPF().equals(cpf)){
                return clients.get(i);
            }
        }
        return null;
    }
}
