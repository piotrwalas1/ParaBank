package przykl;

public class appRun {
    public static void main(String[] args) {
        androidApp android = new androidApp("calculator");
        android.Androidinfo();
        android.appinfo();

        IphoneApp iphone = new IphoneApp("costam");
        iphone.appinfo();
        iphone.iphoneInfo();
    }
}
