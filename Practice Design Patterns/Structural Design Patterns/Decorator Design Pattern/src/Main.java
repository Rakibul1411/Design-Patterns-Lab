public class Main {
    public static void main(String[] args) {
        Text text = new PlainText("Hello World");
        System.out.println(text.format());

        text = new BoldText(text);
        System.out.println(text.format());

        text = new ItalicText(text);
        System.out.println(text.format());

        text = new UnderlineText(text);
        System.out.println(text.format());
    }
}
