public class ArticleSummarizer {
    public static void main(String[] args) {
        String article = "Jesus, also called Jesus Christ, Jesus of Galilee, or Jesus of Nazareth,"+ 
            "(born c. 6–4 BCE, Bethlehem—died c. 30 CE, Jerusalem), religious leader revered in Christianity,"+ 
           " one of the world’s major religions. He is regarded by most Christians as the Incarnation of God."+
            "The history of Christian reflection on the teachings and nature of Jesus is examined in the article Christology."+
           " Name and title Ancient Jews usually had only one name, and, when greater specificity was needed,"+
           " it was customary to add the father’s name or the place of origin. Thus, in his lifetime Jesus was "+
            "called Jesus son of Joseph (Luke 4:22; John 1:45, 6:42), Jesus of Nazareth (Acts 10:38),"+
           " or Jesus the Nazarene (Mark 1:24; Luke 24:19). After his death he came to be called Jesus Christ. "+
           " Christ was not originally a name but a title derived from the Greek word christos, which translates"+
            "the Hebrew term meshiah (Messiah), meaning “the anointed one.” This title indicates that Jesus’ "+
            "followers believed him to be the anointed son of King David, whom some Jews expected to restore the fortunes of Israel."+
           " Passages such as Acts of the Apostles 2:36 show that some early Christian writers knew that the Christ was properly a title,"+
            "but in many passages of the New Testament, including those in the letters of the Apostle Paul,"+
           " the name and title are combined and used together as Jesus’ name: Jesus Christ or Christ Jesus (Romans 1:1; 3:24)."+
            "Paul sometimes simply used Christ as Jesus’ name (e.g., Romans 5:6)";

        String summary = summarizeArticle(article);
        System.out.println("Summary of the article:");
        System.out.println(summary);
    }

    public static String summarizeArticle(String article) {
        // Implement your summarization logic here
        // For simplicity, we'll just return the first few sentences of the article
        String[] sentences = article.split("\\.");
        int numSentencesToInclude = Math.min(2, sentences.length); // Include the first 2 sentences
        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < numSentencesToInclude; i++) {
            summary.append(sentences[i]).append(".");
        }
        return summary.toString();
    }
}
