/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgao.workspace.foolproof;
import com.xgao.App;
import libs.DesktopJavaFramework.ui.foolproof.FoolproofDesign;

/**
 *
 * @author xgao
 */
public class AppFoolProofDesign implements FoolproofDesign{
    
        App app;

    public AppFoolProofDesign(App initApp) {
        app = initApp;
        
    }

    @Override
    public void updateControls() {

    }
    
}
