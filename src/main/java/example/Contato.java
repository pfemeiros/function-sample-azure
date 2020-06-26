package example;

import javax.persistence.*;

@Entity
@Table(name = "contatos_doadores_produtos")
public class Contato {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id = 0L;

}
