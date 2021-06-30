import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    public void previewAllPages() {
        if (this.checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Operation previewAllPages wont be performed!");
        }

    }

    public void createPage(String title, String text) {
        if (this.checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage wont be performed!");
        }

    }

    public void replaceText(int pageNumber, String theNewText) throws PageWithNumberNotFoundException {
        if (this.checkPassword()) {
            super.replaceText(pageNumber, theNewText);
        } else {
            System.out.println("Operation replaceText wont be performed!");
        }

    }

    public void deleteText(int pageNumber) throws PageWithNumberNotFoundException {
        if (this.checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Operation replaceText wont be performed!");
        }

    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        for(int i = 0; i < 3; ++i) {
            System.out.println("Enter password: ");
            String enteredPassword = scan.nextLine();
            if (enteredPassword.equals(this.password)) {
                return true;
            }

            System.out.print("Wrong password! ");
            ++counter;
            if (counter < 3) {
                System.out.println("Try again!");
            } else {
                System.out.println("No more possible tries!");
            }
        }

        return false;
    }
}
