package com.example.dobuy.controllers;

import com.example.dobuy.models.ProType;
import com.example.dobuy.serviceImps.ProTypeServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(ProTypeServiceImp.class);

    @GetMapping("/proType/getAll")
    public ResponseEntity<List<ProType>> getAllProType() throws URISyntaxException {
        List<ProType> list = new ArrayList<>();
        list.add(new ProType(1, "測試28", "testDesc1", 1, Instant.now(), 1, Instant.now()));
        list.add(new ProType(2, "testType2", "testDesc2", 1, Instant.now(), 1, Instant.now()));
        list.add(new ProType(3, "testType3", "testDesc3", 1, Instant.now(), 1, Instant.now()));
        log.info("測試成功");
        return ResponseEntity.ok(list);
    }
}
