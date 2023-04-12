package com.debugagent.wordle.web;

import com.debugagent.wordle.webservices.CharacterResult;

public record WebResult(CharacterResult color, char letter) {
    public static WebResult[] create(CharacterResult[] colors, String text) {
        WebResult[] results = new WebResult[colors.length];
        for(int iter = 0 ; iter < colors.length ; iter++) {
            results[iter] = new WebResult(colors[iter], text.charAt(iter));
        }
        return results;
    }
}
