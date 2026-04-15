public class Usuario {
    // Atributos que mapeiam as colunas do banco [cite: 41]
    private int id;
    private String nome;
    private String email;
    private String senhaHash;
    private String tokenRecuperacao;

    // Construtor vazio (necessário para várias bibliotecas Java)
    public Usuario() {}

    // Getters e Setters (permitem ler e alterar os dados com segurança)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenhaHash() { return senhaHash; }
    public void setSenhaHash(String senhaHash) { this.senhaHash = senhaHash; }

    public String getTokenRecuperacao() { return tokenRecuperacao; }
    public void setTokenRecuperacao(String tokenRecuperacao) { this.tokenRecuperacao = tokenRecuperacao; }
}