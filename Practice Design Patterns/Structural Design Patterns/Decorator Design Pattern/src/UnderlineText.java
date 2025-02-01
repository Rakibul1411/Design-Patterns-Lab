public class UnderlineText extends TextDecorator{
    public UnderlineText(Text text) {
        super(text);
    }

    public String format() {
        return "<u>" + decoratedText.format() + "</u>";
    }
}
