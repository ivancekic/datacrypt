package com.ivan.cekic;


import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        String key = "transportKljuc11";
        File inputFile = new File("input.txt");
        File encryptedFile = new File("output.crypto");
        File decryptedFile = new File("output.decrypt");
        DataCrypt.encrypt(key, inputFile, encryptedFile);
        DataCrypt.decrypt(key, encryptedFile, decryptedFile);
    }
}
