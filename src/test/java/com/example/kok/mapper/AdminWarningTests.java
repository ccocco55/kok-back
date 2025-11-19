package com.example.kok.mapper;

import com.example.kok.enumeration.PostWarningStatus;
import com.example.kok.service.AdminWarningMemberService;
import com.example.kok.util.Criteria;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class AdminWarningTests {
    @Autowired
    private AdminWarningMemberService adminWarningMemberService;
    @Autowired
    private CommunityPostMapper communityPostMapper;

    @Test
    void getAllAdminWarningMembers() {
        System.out.println(adminWarningMemberService.banPostCountByMemberId(30L));;
    }

    @Test
    void getAllAdminWarningPosts() {
        Criteria criteria = new Criteria(1, 10);

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        log.info("getAllAdminWarningPosts: {}" , communityPostMapper.selectWarningPosts(criteria, ids, PostWarningStatus.DELETE);
    }

}


