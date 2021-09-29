package school.cesar.nib.services;

import school.cesar.nib.entities.Client;
import school.cesar.nib.repositories.ClientRepository;
import school.cesar.nib.utils.CPFUtil;

public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(){
        clientRepository = ClientRepository.getInstancia();
    }

    public boolean salvar(Client client){

        if(!CPFUtil.isCPF(client.getCPF())){
            return false;
        }

        clientRepository.salvar(client);
        return true;
    }

    public Client buscar(String cpf){
        return clientRepository.buscar(cpf);
    }
}
