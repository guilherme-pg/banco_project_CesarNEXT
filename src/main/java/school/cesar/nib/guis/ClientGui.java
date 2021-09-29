package school.cesar.nib.guis;

import school.cesar.nib.entities.Client;
import school.cesar.nib.services.ClientService;

import java.util.Scanner;

public class ClientGui {
    private ClientService clientService;

    public ClientGui(){
        clientService = new ClientService();
    }

    public void showMenu(){
        Scanner leTeclado = new Scanner(System.in);

        int menuOption = 0;

        do{
            System.out.println("Select an option:");
            System.out.println(" 1 - Cadastrar Cliente");
            System.out.println(" 2 - Consultar Cliente");
            System.out.println(" 3 - Sair");

            menuOption = leTeclado.nextInt();

            switch (menuOption){
                case 1:
                    save(leTeclado);
                    break;
                case 2:
                    buscar(leTeclado);
                    break;
                case 3:
                    break;
            }

        }while (menuOption != 3);

        System.out.println("Obrigado por usar o NIB");
        leTeclado.close();
    }

    private void save(Scanner leTeclado){
        System.out.println("Digite o CPF do cliente");
        String CPF = leTeclado.next();

        System.out.println("Digite o nome do Cliente");
        String name = leTeclado.next();

        Client client = new Client(CPF, name, null);

        boolean clientWasCreated = clientService.salvar(client);

        if(clientWasCreated){
            System.out.println("O cliente foi cadastrado com sucesso");
        }else{
            System.out.println("Erro ao cadastrar cliente. Verifique os dados e tente novamente.");
        }
    }

    private void buscar(Scanner leTeclado){
        System.out.println("Digite o cpf");
        String cpf = leTeclado.next();

        Client client = clientService.buscar(cpf);
        if(client == null){
            System.out.println("Cpf não encontrado");
        }else{
            System.out.println("Cliente: " + client);
        }
    }
}
