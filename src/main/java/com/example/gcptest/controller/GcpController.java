package com.example.gcptest.controller;


import com.example.gcptest.domain.entity.Member;
import com.example.gcptest.domain.request.MemberRequest;
import com.example.gcptest.repository.MemberRepository;
import com.example.gcptest.service.GcpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
@CrossOrigin({"http://localhost:3000", "http://34.30.119.210"})
public class GcpController {
    private final GcpService gcpService;
    @PostMapping
    public void save(@RequestBody MemberRequest memberRequest){
        gcpService.save(memberRequest);
    }

    @GetMapping
    public List<Member> getAll(){
        return  gcpService.getAll();
    }
}
