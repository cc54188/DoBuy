package com.example.dobuy.serviceImps;

import com.example.dobuy.models.ProType;
import com.example.dobuy.repositorys.ProTypeRepository;
import com.example.dobuy.services.ProTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProTypeServiceImp implements ProTypeService {

    @Autowired
    ProTypeRepository proTypeRepository;

    private static final Logger log
            = LoggerFactory.getLogger(ProTypeServiceImp.class);

    @Override
    public List<ProType> getAllProType() {
        List<ProType> list = proTypeRepository.findAll();
        log.debug("ser-getAllProType:" + list);
        return list;
    }
}
