package kakaoLoginTest.kakao.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name="user_table")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id; // public 문제 되진 않는지?

    private String email;

    @Builder
    public User(Long id,String email){
        this.id = id;
        this.email = email;
    }

}
