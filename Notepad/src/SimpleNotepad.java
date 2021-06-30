import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleNotepad implements Notepad {
    private List<Page> pages = new ArrayList();

    public SimpleNotepad() {
    }

    private Page findPage(int pageNumber) throws PageWithNumberNotFoundException {
        Iterator var2 = this.pages.iterator();

        Page currentPage;
        do {
            if (!var2.hasNext()) {
                throw new PageWithNumberNotFoundException("There was not page with number: " + pageNumber);
            }

            currentPage = (Page)var2.next();
        } while(currentPage.getPageNumber() != pageNumber);

        return currentPage;
    }

    public void previewAllPages() {
        Iterator var1 = this.pages.iterator();

        while(var1.hasNext()) {
            Page currentPage = (Page)var1.next();
            System.out.println(currentPage.preview());
        }

    }

    public void createPage(String title, String text) {
        Page currentPage = new Page(text, title, this.pages.size() + 1);
        this.pages.add(currentPage);
    }

    public void replaceText(int pageNumber, String theNewText) throws PageWithNumberNotFoundException {
        Page foundPage = this.findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(theNewText);
    }

    public void deleteText(int pageNumber) throws PageWithNumberNotFoundException {
        Page foundPage = this.findPage(pageNumber);
        foundPage.deleteText();
    }
}
