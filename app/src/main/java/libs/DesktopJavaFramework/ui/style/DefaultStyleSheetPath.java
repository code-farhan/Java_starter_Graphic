package libs.DesktopJavaFramework.ui.style;

public enum DefaultStyleSheetPath {
    WELCOME_DIALOG("libs/DesktopJavaFramework/ui/style/css/welcome.css"),
    APP_PATH_CSS("libs/DesktopJavaFramework/ui/style/css/app_style.css");

    private String filePath;
    DefaultStyleSheetPath(String path){
        this.filePath = path;
    }

    public String getFilePath() {
        return filePath;
    }
}
