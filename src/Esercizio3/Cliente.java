package Esercizio3;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

public Cliente(String codiceCliente, String nome, String cognome, String email, String dataIscrizione){
    this.codiceCliente = codiceCliente;
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.dataIscrizione = dataIscrizione;
}

public String getCodiceCliente(){
    return codiceCliente;
}

public String getNome() {
    return nome;
}

public String getCognome() {
    return cognome;
}

public String getEmail() {
    return email;
}

public String getDataIscrizione() {
    return dataIscrizione;
}

public String toString() {
    return "Codice cliente: " + codiceCliente + ", Nome: " + nome + " " + cognome + ", Email: " + email + ", Data iscrizione: " + dataIscrizione;
}
}
