public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        ElectronicDevice elDevice = new ElectronicSecuredNotepad("123");
        Notepad theElectronicSecuredNotepad = (Notepad)elDevice;
        theElectronicSecuredNotepad.createPage("Title1", "Text1");
        theElectronicSecuredNotepad.createPage("Title2", "Text2");
        theElectronicSecuredNotepad.createPage("Title3", "Text3");
        elDevice.start();
        theElectronicSecuredNotepad.createPage("Title1", "Text1");
        theElectronicSecuredNotepad.createPage("Title2", "Text2");
        theElectronicSecuredNotepad.createPage("Title3", "Text3");
        theElectronicSecuredNotepad.previewAllPages();
        System.out.println("----------------------------");

        try {
            theElectronicSecuredNotepad.replaceText(3, "NewTextOnPage3");
        } catch (PageWithNumberNotFoundException var5) {
            var5.printStackTrace();
            System.out.println("For the end user: " + var5.getMessage());
        }

        theElectronicSecuredNotepad.previewAllPages();
        System.out.println("----------------------------");

        try {
            theElectronicSecuredNotepad.deleteText(1);
        } catch (PageWithNumberNotFoundException var4) {
            var4.printStackTrace();
        }

        theElectronicSecuredNotepad.previewAllPages();
    }
}
