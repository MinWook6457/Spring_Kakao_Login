package kakaoLoginTest.kakao.repository;

import kakaoLoginTest.kakao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
