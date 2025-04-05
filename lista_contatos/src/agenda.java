import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<contato> contatos;

    public agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public contato buscarContato(String nome){
        for(contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }

    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("nenhum contato na agenda.");
        }
        else {
            for(contato contato : contatos){
                System.out.println(contato);
            }
        }
    }

    public void atualizarContato(String nome, String novoTelefone, String novoEmail) {
        contato contato = buscarContato(nome);
        if(contato != null) {
            contato.setTelefone(novoTelefone);
            contato.setEmail(novoEmail);
            System.out.println("contato atualizado com sucesso!");
        }
        else{
            System.out.println("contato nao encontrado.");
        }
    }

    public void removerContato(String nome){
        contato contato = buscarContato(nome);
        if(contato != null){
            contatos.remove(contato);
            System.out.println("contato removido com sucesso!");
        }
        else {
            System.out.println("Contato nao encontrado");
        }
    }

}
