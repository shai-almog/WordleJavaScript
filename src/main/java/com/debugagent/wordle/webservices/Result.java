package com.debugagent.wordle.webservices;

public record Result(CharacterResult[] results, String errorMessage) {
}
