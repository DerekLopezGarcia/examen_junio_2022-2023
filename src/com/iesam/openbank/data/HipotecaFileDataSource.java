package com.iesam.openbank.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import com.iesam.openbank.domain.models.Hipoteca;

public class HipotecaFileDataSource {
    private String nameFile = "Hipoteca.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Hipoteca>>() {
    }.getType();

    public void save(Hipoteca model) {
        List<Hipoteca> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Hipoteca> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Hipoteca> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Hipoteca findById(Integer id) {
        List<Hipoteca> models = findAll();
        for (Hipoteca model : models) {
            if (Objects.equals(model.getCodigo(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Hipoteca> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(Integer modelId) {
        List<Hipoteca> newList = new ArrayList<>();
        List<Hipoteca> models = findAll();
        for (Hipoteca model : models) {
            if (model.getCodigo() != null) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
    
}
