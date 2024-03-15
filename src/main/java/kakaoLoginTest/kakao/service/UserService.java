package kakaoLoginTest.kakao.service;

import kakaoLoginTest.kakao.entity.User;
import kakaoLoginTest.kakao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long createUser(String email){
        User user = User.builder()
                .email(email)
                .build();

        userRepository.save(user);
        log.info("새로운 회원 저장 완료!");

        return user.id;
    }


}
