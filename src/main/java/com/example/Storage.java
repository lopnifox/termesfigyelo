/*
* File: Storage.java
* Author: Nagy Áron
* Copyright: 2021, Nagy Áron
* Group: Szoft IN
* Date: 2026-05-24
* Github: https://github.com/lopnifox/
* Licenc: MIT
*/

package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.models.Crop;

public class Storage {
    public static List<Crop> readContent() {
        try {
            return tryreadContent();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<Crop> tryreadContent() throws FileNotFoundException {
        List<Crop> cropList = new ArrayList<>();
        File file = new File("termes.txt");
        try (Scanner sc = new Scanner(file)) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(":");

                Crop crop = new Crop();
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String field = parts[2];
                int yield = Integer.parseInt(parts[3]);
                String harvestEnd = parts[4];
                
                crop.setId(id);
                crop.setName(name);
                crop.setField(field);
                crop.setYield(yield);
                crop.setHarvestEnd(harvestEnd);
                cropList.add(crop);
            }
        }
        return cropList;
    }
}
