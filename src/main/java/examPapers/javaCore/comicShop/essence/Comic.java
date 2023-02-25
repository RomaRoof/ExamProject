package examPapers.javaCore.comicShop.essence;

public class Comic {
    String nameComic;
    String nameAuthor;
    int countOfPages;
    String genre;
    int yearOfPublish;

    public Comic(String nameComic, String nameAuthor, String genre, int countOfPages, int yearOfPublish) {
        this.nameComic = nameComic;
        this.nameAuthor = nameAuthor;
        this.countOfPages = countOfPages;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
    }

    @Override
    public String toString() {
        return nameComic + nameAuthor + countOfPages + genre + yearOfPublish;
    }
}
