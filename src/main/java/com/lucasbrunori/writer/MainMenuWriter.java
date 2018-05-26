package com.lucasbrunori.writer;

public class MainMenuWriter implements IWriter {

    public void write() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("******** Welcome to Fakesteam *********\n\n");
        stringBuilder.append(String.format("[1] Administrate customer\n"));
        stringBuilder.append(String.format("[2] Administrate games\n"));
        stringBuilder.append(String.format("[3] Administrate operations\n\n"));
        stringBuilder.append("[0] Leave\n");
        stringBuilder.append("Enter a value: ");

        System.out.println(stringBuilder.toString());
    }
}
