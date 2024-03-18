package kakaoLoginTest.repository;

import kakaoLoginTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
