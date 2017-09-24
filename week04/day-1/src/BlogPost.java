public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {
        BlogPost example1 = new BlogPost();
        example1.authorName = "John Doe";
        example1.title = "Lorem Ipsum";
        example1.text  = "Lorem ipsum dolor sit amet.";
        example1.publicationDate  = "2000.05.04";

        BlogPost example2 = new BlogPost();
        example2.authorName = "Tim Urban";
        example2.title = "Wait but why";
        example2.text  = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        example2.publicationDate  = "2010.10.10";

        BlogPost example3 = new BlogPost();
        example3.authorName = "William Turton";
        example3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        example3.text  = "Daniel Hanley, a cybersecurity engineer at IBM, " +
                        "doesn’t want to be the center of attention. When I asked to take his picture " +
                        "outside one of IBM’s New York City offices, " +
                        "he told me that he wasn’t really into the whole organizer profile thing.";
        example3.publicationDate  = "2017.03.28";
    }
}
