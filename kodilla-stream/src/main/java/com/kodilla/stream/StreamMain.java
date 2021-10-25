package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Były sobie świnki trzy",someTextToDekorate -> someTextToDekorate.toUpperCase());
        beautifier.beautify("This is an example text",someTextToDekorate ->"d:********" + " " + someTextToDekorate + " " + "***********");
    }
}
