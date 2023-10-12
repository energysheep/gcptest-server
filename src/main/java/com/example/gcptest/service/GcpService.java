package com.example.gcptest.service;


import com.example.gcptest.domain.entity.Member;
import com.example.gcptest.domain.request.MemberRequest;
import com.example.gcptest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GcpService {

    private final MemberRepository memberRepository;

    public void save(MemberRequest memberRequest){
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }

    public List<Member> getAll(){
         return memberRepository.findAll();
    }
}
