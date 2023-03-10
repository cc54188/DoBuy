package com.example.dobuy.controllers;

import com.example.dobuy.models.ProType;
import com.example.dobuy.serviceImps.ProTypeServiceImp;
import com.example.dobuy.services.ProTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProTypeController {

    @Autowired
    ProTypeService proTypeService;

    private static final Logger log = LoggerFactory.getLogger(ProTypeServiceImp.class);

    @GetMapping("/proType/getAll")
    public ResponseEntity<List<ProType>> getAllProType() throws URISyntaxException {
        List<ProType> list = proTypeService.getAllProType();
        return ResponseEntity.ok(list);
    }
}
