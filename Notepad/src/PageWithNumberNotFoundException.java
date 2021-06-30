public class PageWithNumberNotFoundException extends Exception {
    public PageWithNumberNotFoundException() {
    }

    public PageWithNumberNotFoundException(String message) {
        super(message);
    }

    public PageWithNumberNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PageWithNumberNotFoundException(Throwable cause) {
        super(cause);
    }

    public PageWithNumberNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}