package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"ENDERECO\"")
@XmlRootElement
public class Endereco implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String endereco;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pessoa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Pessoa pessoa;
  
  /**
   * Construtor
   * @generated
   */
  public Endereco(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Endereco setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  public java.lang.String getEndereco(){
    return this.endereco;
  }
  
  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Endereco setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }
  
  /**
   * Obtém pessoa
   * return pessoa
   * @generated
   */
  public Pessoa getPessoa(){
    return this.pessoa;
  }
  
  /**
   * Define pessoa
   * @param pessoa pessoa
   * @generated
   */
  public Endereco setPessoa(Pessoa pessoa){
    this.pessoa = pessoa;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Endereco object = (Endereco)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}