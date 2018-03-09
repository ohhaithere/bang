package com.bang.service;

import com.bang.model.Status;
import org.springframework.stereotype.Service;

@Service
public interface StatusService {

    Iterable<Status> getAllStatuses();

}
