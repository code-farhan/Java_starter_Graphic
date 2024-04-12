/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgao.workspace;

import com.xgao.App;
import com.xgao.AppProperty;
import com.xgao.workspace.controllers.SiteController;
import com.xgao.workspace.foolproof.AppFoolProofDesign;
import com.xgao.workspace.style.AppStyles;
import libs.DesktopJavaFramework.modules.AppFoolproofModule;
import libs.DesktopJavaFramework.components.AppWorkspaceComponent;

import static libs.DesktopJavaFramework.modules.AppGUIModule.ENABLED;
import libs.DesktopJavaFramework.ui.AppNodesBuilder;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import libs.PropertiesManager.src.PropertiesManager;

import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;

/**
 *
 * @author xgao
 */
public class AppWorkSpace extends AppWorkspaceComponent{
    private SiteController siteController;
    
     public AppWorkSpace(App app) {
        super(app);

        // LAYOUT THE APP
        initLayout();

        // INIT THE EVENT HANDLERS
        initControllers();

        // init
        initFoolproofDesign();

        // INIT DIALOGS
        initDialogs();
    }

    private void initDialogs() {

    }

    // THIS HELPER METHOD INITIALIZES ALL THE CONTROLS IN THE WORKSPACE
    private void initLayout() {
        // FIRST LOAD THE FONT FAMILIES FOR THE COMBO BOX
        PropertiesManager props = PropertiesManager.getPropertiesManager();

       // THIS WILL BUILD ALL OF OUR JavaFX COMPONENTS FOR US
        AppNodesBuilder nodesBuilder = app.getGUIModule().getNodesBuilder();
        
        
        // init the tabPane
        TabPane tabContainer = nodesBuilder.buildTabPane(AppProperty.APP_MAIN_TAB_PANE, null, AppStyles.CLASS_MAIN_TAB_PANE, ENABLED);
        tabContainer.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        // add tabPane as the workspace central pane 
        workspace = new BorderPane();

        // AND PUT EVERYTHING IN THE WORKSPACE
        ((BorderPane) workspace).setCenter(tabContainer);
    }

    // this will add all the controllers top the widet above
    public void initControllers() {

    }
    
  

    public void initFoolproofDesign() {
        AppFoolproofModule foolproofSettings = app.getFoolproofModule();
        foolproofSettings.registerModeSettings(AppProperty.APP_FOOLPROOF_SETTINGS,
                new AppFoolProofDesign((App) app));
    }

    @Override
    public void processWorkspaceKeyEvent(KeyEvent ke) {
        // WE AREN'T USING THIS FOR THIS APPLICATION
    }

    @Override
    public void showNewDialog() {
        // WE AREN'T USING THIS FOR THIS APPLICATION
    }




    
}
