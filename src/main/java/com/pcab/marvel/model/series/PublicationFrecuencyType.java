package com.pcab.marvel.model.series;

/**
 * This enum represents all the possible publications frequencies.
 *
 * @since 1.0.0
 */
public enum PublicationFrecuencyType {
    COLLECTION("collection"),
    ONE_SHOT("one shot"),
    LIMITED("limited"),
    ON_GOING("ongoing");

    private PublicationFrecuencyType(String value){
        this.value = value;
    }

    private String value;

    public String getValue(){
        return value;
    }
}
