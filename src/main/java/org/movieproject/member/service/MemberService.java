package org.movieproject.member.service;


import org.movieproject.member.dto.MemberDTO;

public interface MemberService {

    // 아이디/닉네임 중복확인
    public class MemberExistException extends Exception {
        public MemberExistException() {
            super();
        }
        public MemberExistException(String message) {
            super(message);
        }
    }

    // 회원가입
    void memberJoin(MemberDTO memberDTO) throws MemberExistException;

    // 회원정보 삭제
    void deleteMember(Integer memberNo) throws MemberExistException;

}
