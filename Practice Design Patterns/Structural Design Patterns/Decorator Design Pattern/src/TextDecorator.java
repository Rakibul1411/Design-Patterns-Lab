 abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text text) {
        this.decoratedText = text;
    }

     @Override
     public String format() {
         return decoratedText.format();
     }
 }
