package com.bang.service.impl;

import com.bang.model.Status;
import com.bang.repository.StatusRepository;
import com.bang.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Iterable<Status> getAllStatuses() {
        return statusRepository.findAll();
    }
}
