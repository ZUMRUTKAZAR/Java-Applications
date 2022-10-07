package OOPwithNLayerApp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Dosyayı veri tabanına logladı:" + data);
    }
}
