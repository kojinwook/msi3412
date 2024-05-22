package com.example.ms1.note.member;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    public Member create(String loginId, String password, String nickname, String email){
        Member member = new Member();
        member.setLoginId(loginId);
        member.setPassword(passwordEncoder.encode(password));
        member.setCreateDate(LocalDateTime.now());
        member.setNickname(nickname);
        member.setEmail(email);
        this.memberRepository.save(member);
        return member;
    }




}
