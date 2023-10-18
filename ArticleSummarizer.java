public class ArticleSummarizer {
    public static void main(String[] args) {
        String article = "This is a sample article that we want to summarize. " +
                "It contains several sentences and provides information " +
                "on a particular topic. The goal is to create a summary " +
                "that captures the key points of the article.";

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
