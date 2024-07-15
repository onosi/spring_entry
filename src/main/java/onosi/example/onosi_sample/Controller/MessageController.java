package onosi.example.onosi_sample.Controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import onosi.example.onosi_sample.entity.Message;

@RestController
public class MessageController {

    // TODO: CopyOnWriteArrayListを使う理由を調査
    final List<Message> messages = new CopyOnWriteArrayList<>();

    @GetMapping("messages")
    public List<Message> getMessages() {
        return messages;
    }

    @PostMapping("messages")
    public Message postMessages(@RequestBody Message message) {
        messages.add(message);
        return message;

    }
}
