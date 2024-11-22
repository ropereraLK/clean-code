package io.github.ropereralk.clean_code.di;

public class EmailServiceImpl implements Communicator {

    @Override
    public void sendMessage(String message) {
        System.out.printf("Message: {%s}", message);
    }

}
