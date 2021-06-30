public class Page {
    private String text;
    private String title;
    private int pageNumber;

    public Page(String text, String title, int pageNumber) {
        this.text = text;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    void addText(String text) {
        this.text = this.text + text;
    }

    void deleteText() {
        this.text = "";
    }

    String preview() {
        return this.title + "\n" + this.text;
    }
}
