package hello.hellospring.domain;

import jakarta.persistence.*;

//JPA가 관리하는 entity라는 표시를 나타내는 어노테이션
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    //@Column(name= "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
