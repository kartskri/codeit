package boot.springboot.dto;

public class ResponseTransformer {

    public ResponseTransformer(String s) {
        this.text = s;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
