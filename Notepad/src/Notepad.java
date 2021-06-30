public interface Notepad {
    void createPage(String var1, String var2);

    void replaceText(int var1, String var2) throws PageWithNumberNotFoundException;

    void deleteText(int var1) throws PageWithNumberNotFoundException;

    void previewAllPages();
}
