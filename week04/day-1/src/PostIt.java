public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        PostIt example1 = new PostIt("Orange", "Idea 1", "Blue text");
        PostIt example2 = new PostIt("Pink", "Awesome", "Black text");
        PostIt example3 = new PostIt("Yellow", "Superb", "Green text");
    }
}


