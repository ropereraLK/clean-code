package io.github.ropereralk.clean_code.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Communicator communicator;

    public void notifyUser(String message){
        communicator.sendMessage(message);

    }
}
