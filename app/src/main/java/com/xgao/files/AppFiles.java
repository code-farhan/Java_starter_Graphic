/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgao.files;

import com.xgao.App;
import com.xgao.dialogs.CustomAlert;
import libs.DesktopJavaFramework.components.AppDataComponent;
import libs.DesktopJavaFramework.components.AppFileComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author xgao
 */
public class AppFiles implements AppFileComponent{
    
     // THIS IS THE APP ITSELF
    App app;

    public AppFiles(App initApp) {
        app = initApp;
    }

    @Override
    public void loadData(AppDataComponent data, String filePath){
        CustomAlert.showAlert("Not supported yet", "Error");
    }

    // HELPER METHOD FOR LOADING DATA FROM A JSON FORMAT
    private JsonObject loadJSONFile(String jsonFilePath) throws IOException {
        InputStream is = new FileInputStream(jsonFilePath);
        JsonReader jsonReader = Json.createReader(is);
        JsonObject json = jsonReader.readObject();
        jsonReader.close();
        is.close();
        return json;
    }
    

    @Override
    public void saveData(AppDataComponent data, String filePath) {
        CustomAlert.showAlert("Not supported yet", "Error");
    }

    @Override
    public void importData(AppDataComponent data, String filePath) {
        CustomAlert.showAlert("Not supported yet", "Error");
    }

    @Override
    public void exportData(AppDataComponent data, String filePath) {
        CustomAlert.showAlert("Not supported yet", "Error");
    }
    
}
