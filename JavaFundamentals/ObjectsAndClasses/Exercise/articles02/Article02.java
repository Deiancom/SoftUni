package JavaFundamentals.ObjectsAndClasses.Exercise.articles02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Article02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Articles> info = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];
            Articles articles = new Articles();
            articles.setTitle(title);
            articles.setContent(content);
            articles.setAuthor(author);
            info.add(articles);
        }
        String command = scanner.nextLine();
        switch (command) {
            case "title":
                info.stream().sorted(Comparator.comparing(Articles::getTitle))
                        .forEach(System.out::println);
                break;
            case "content":
                info.stream().sorted(Comparator.comparing(Articles::getContent))
                        .forEach(System.out::println);
                break;
            case "author":
                info.stream().sorted(Comparator.comparing(Articles::getAuthor))
                        .forEach(System.out::println);
                break;
        }


    }

    public static class Articles {
        private String title;
        private String content;
        private String author;

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }


        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
