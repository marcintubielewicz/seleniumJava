package jPetStoreTests;

public enum BrowserType {

    CHROME("chrome"),

    FIREFOX("firefox"),

//    IE("internetexplorer"),

    SAFARI("safari");

    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }
}
