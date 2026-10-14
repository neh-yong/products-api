package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public double getFileSizeMB() {
        return this.fileSizeMB;
    }
}
