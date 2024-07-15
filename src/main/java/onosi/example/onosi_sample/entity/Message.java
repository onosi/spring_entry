package onosi.example.onosi_sample.entity;

import java.io.Serializable;

public class Message implements Serializable {
    private String text = null;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
