package com.iesam.openbank.data;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.openbank.domain.models.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerFileDataSource {
    private String nameFile = "customer.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Customer>>() {
    }.getType();

    public void save(Customer model) {
        List<Customer> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Customer> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Customer> models) {
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


    public Customer findById(Integer id) {
        List<Customer> models = findAll();
        for (Customer model : models) {
            if (Objects.equals(model.getDNI(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Customer> findAll() {
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

    /**
     * @param modelId
     */
    public void delete(Integer modelId) {
        List<Customer> newList = new ArrayList<>();
        List<Customer> models = findAll();
        for (Customer model : models) {
            if (model.getDNI() != null) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
