package com.technical.git.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class GeneratorService {


    public String generateFile(int numLine) throws IOException {
        Set<String> setString = new HashSet<>();
        while (setString.size() < numLine){
            setString.add(generateRandomAlphanumeric());
        }
        String baseName = "generated.file";
        String filename = "./src/main/java/com/technical/git/asset/" +baseName;
        File myObj = new File(filename);
        FileWriter myWriter = new FileWriter(filename);
        myWriter.write(setString.toString());
        myWriter.close();
        System.out.println(setString);
        return setString.toString();
    }

    private String generateRandomAlphanumeric(){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 100;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
