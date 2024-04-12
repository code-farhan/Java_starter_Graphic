/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgao;
import com.xgao.clickboard.AppClickboard;
import com.xgao.workspace.AppWorkSpace;
import libs.DesktopJavaFramework.AppTemplate;
import libs.DesktopJavaFramework.components.AppClipboardComponent;
import libs.DesktopJavaFramework.components.AppDataComponent;
import libs.DesktopJavaFramework.components.AppFileComponent;
import  libs.DesktopJavaFramework.components.AppWorkspaceComponent;
import com.xgao.data.AppData;
import com.xgao.files.AppFiles;
import java.util.Locale;


/**
 *
 * @author xgao
 */
public class App extends AppTemplate{

    @Override
    public AppClipboardComponent buildClipboardComponent(AppTemplate app) {
        return new AppClickboard(this);
    }

    @Override
    public AppDataComponent buildDataComponent(AppTemplate app) {
        return new AppData(this);
    }

    @Override
    public AppFileComponent buildFileComponent() {
        return new AppFiles(this);
    }

    @Override
    public AppWorkspaceComponent buildWorkspaceComponent(AppTemplate app) {
        return new AppWorkSpace(this);
    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch(args);
    }
    
}
