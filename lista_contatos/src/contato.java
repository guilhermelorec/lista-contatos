public class contato {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public contato(String nome, String telefone, String email, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String toString(){
        return "\nnome: " + nome + "\ntelefone: " + telefone + "\nemail: " + email + "\ncpf: " + cpf ;
    }
}
