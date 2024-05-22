package com.example.ms1.note.member;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자 ID는 필수항목입니다.")
    private String loginId;
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;
    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String password2;
    @NotEmpty(message = "Email 은 필수항목입니다.")
    @Email(message = "이메일 형식이 아닙니다.")
    private String email;
    @NotEmpty(message = "닉네임은 필수항목입니다.")
    private String nickname;
}
