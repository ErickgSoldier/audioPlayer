package br.com.audioplayer.modelos;

public class Audio {
    private String title;
    private double duration;
    private int totalOfReproductions;
    private int totalOfLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public int getTotalOfReproductions() {
        return totalOfReproductions;
    }

    public int gettotalOfLikes() {
        return totalOfLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like() {
        this.totalOfLikes++;
    }

    public void play() {
        this.totalOfReproductions++;
    }

}
