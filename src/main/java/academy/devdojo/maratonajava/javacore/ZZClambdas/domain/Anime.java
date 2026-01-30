package academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private Integer epsodes;

    public Anime(String title, Integer epsodes) {
        this.title = title;
        this.epsodes = epsodes;
    }


    public String getTitle() {
        return title;
    }

    public Integer getEpsodes() {
        return epsodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", epsodes=" + epsodes +
                '}';
    }
}
