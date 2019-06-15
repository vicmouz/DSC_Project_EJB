/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarecorporativo.entidade;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import static javax.persistence.DiscriminatorType.STRING;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import softwarecorporativo.acesso.Grupo;


/**
 *
 * @author marcosbrasileiro
 */
@Entity
@Table (name="TB_USUARIOGERAL")
@Access(AccessType.FIELD)

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "USUARIO_TIPO",discriminatorType = STRING, length = 1)
public abstract class UsuarioGeral extends Entidade implements Serializable {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name="USUARIO_ID")
private Long id;

@NotBlank(message = "Nome do usuário não pode ser null")
@Size(max=100)
@Column (name="USUARIO_NOME", length=100)
private String nome;

@NotBlank(message = "Email do usuário não pode ser null")
@Size(max=40)
@Email
@Column(name="USUARIO_EMAIL",length=40)
private String email;

@NotBlank(message = "CPF não pode ser null")
@CPF
@Size(max=30)
@Column(name="USUARIO_CPF")
private String cpf;

@NotBlank(message = "Senha não pode ser null")

@Size(max=30)
@Column(name="USUARIO_SENHA")
private String senha;

@Size(max=30)
@Column(name="USUARIO_SAL")
private String sal;

@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tb_usuario_grupo", joinColumns = {
        @JoinColumn(name = "ID_USUARIO")},
            inverseJoinColumns = {
                @JoinColumn(name = "ID_GRUPO")})
    private List<Grupo> grupos;

@PrePersist
    public void gerarHash() {
        try {
            gerarSal();
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            setSenha(sal + senha);
            digest.update(senha.getBytes(Charset.forName("UTF-8")));
            setSenha(Base64.getEncoder().encodeToString(digest.digest()));
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void gerarSal() throws NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] randomBytes = new byte[32];
        secureRandom.nextBytes(randomBytes);
        setSal(Base64.getEncoder().encodeToString(randomBytes));
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }
    

    public boolean possui(String nome){
        return nome.contains(nome);
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void adicionarGrupo(Grupo grupo) {
        if (this.grupos == null) {
            this.grupos = new ArrayList<>();
        }
        
        this.grupos.add(grupo);
    }
    
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.nome);
        sb.append(", ");
        sb.append(this.email);
        sb.append(", ");
        sb.append(this.cpf);
        
        return sb.toString();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  


   
  

}
