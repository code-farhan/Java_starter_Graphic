package libs.DesktopJavaFramework.ui.style;

import libs.PropertiesManager.src.PropertiesManager;
import libs.DesktopJavaFramework.AppPropertyType;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;

public class CssLoader {

    public static String loadCss(DefaultStyleSheetPath path, PropertiesManager propertiesManager){
        final String defaultPath = path.getFilePath();
        final URL urlPath = CssLoader.class.getClassLoader().getResource(defaultPath);
        final String uri = urlPath.toExternalForm();
        String pathFromXml = propertiesManager.getProperty(path.toString());
        File f = new File(pathFromXml);
        return f.exists() ? pathFromXml : uri;
    }
}
