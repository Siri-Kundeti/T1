public class ArticleSummarizer {
    public static void main(String[] args) {
        String article = "Romeo is a Montague, and Juliet a Capulet."+ 
            "Their families are enmeshed in a feud, but the moment they meet—when Romeo"+
            "and his friends attend a party at Juliet’s house in disguise—the two fall in love and quickly decide that they want to be married."+         
            "A friar secretly marries them, hoping to end the feud."+ 
            "Romeo and his companions almost immediately encounter Juliet’s cousin Tybalt, who challenges Romeo."+
           " When Romeo refuses to fight, Romeo’s friend Mercutio accepts the challenge and is killed."+
            "Romeo then kills Tybalt and is banished. He spends that night with Juliet and then leaves for Mantua."+
            "Juliet’s father forces her into a marriage with Count Paris. "+
           " To avoid this marriage, Juliet takes a potion, given her by the friar, that makes her appear dead."+
            "The friar will send Romeo word to be at her family tomb when she awakes."+ 
           " The plan goes awry, and Romeo learns instead that she is dead. In the tomb, Romeo kills himself."+
            "Juliet wakes, sees his body, and commits suicide. Their deaths appear finally to end the feud.";

        String summary = summarizeArticle(article);
      System.out.println("Original article:");
         System.out.println(article);
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
