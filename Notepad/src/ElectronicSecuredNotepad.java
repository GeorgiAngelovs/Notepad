public class ElectronicSecuredNotepad extends SecuredNotepad implements ElectronicDevice {
    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
    }

    public void start() {
        this.isStarted = true;
    }

    public void stop() {
        this.isStarted = false;
    }

    public boolean isStarted() {
        return this.isStarted;
    }

    public void previewAllPages() {
        if (this.isStarted()) {
            super.previewAllPages();
        } else {
            System.out.println("The device is NOT started!");
        }

    }

    public void createPage(String title, String text) {
        if (this.isStarted()) {
            super.createPage(title, text);
        } else {
            System.out.println("The device is NOT started!");
        }

    }

    public void replaceText(int pageNumber, String theNewText) throws PageWithNumberNotFoundException {
        if (this.isStarted()) {
            super.replaceText(pageNumber, theNewText);
        } else {
            System.out.println("The device is NOT started!");
        }

    }

    public void deleteText(int pageNumber) throws PageWithNumberNotFoundException {
        if (this.isStarted()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("The device is NOT started!");
        }

    }
}