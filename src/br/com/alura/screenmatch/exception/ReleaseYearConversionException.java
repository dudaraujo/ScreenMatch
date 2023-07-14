package br.com.alura.screenmatch.exception;

public class ReleaseYearConversionException extends RuntimeException {
    private String message;
    public ReleaseYearConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
