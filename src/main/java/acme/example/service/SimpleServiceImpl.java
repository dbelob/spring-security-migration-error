package acme.example.service;

import acme.example.domain.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

@Service
public class SimpleServiceImpl implements SimpleService {
    @Override
    public Message getMessage(String name) {
        String text = String.format("Hello, %s!",
                (name != null) ? HtmlUtils.htmlEscape(name) : "world");

        return new Message(text);
    }
}
