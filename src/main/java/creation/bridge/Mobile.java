package creation.bridge;

import libs.Util;

public class Mobile extends Platform{
    private String platform = "";
    @Override
    public String generateReport() {
        switch (Util.getOS()) {
            case IOS:
                this.platform = "ios";

            case ANDROID:
                this.platform = "android";
        }
        return this.platform;
    }
}
