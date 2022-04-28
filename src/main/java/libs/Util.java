package libs;

public class Util {
    public enum OS {
        WINDOWS, LINUX, MAC, SOLARIS, ANDROID, IOS
    }// Operating systems.

    public enum PLATFORMS{
        PC, MOBILE
    }

    private static PLATFORMS pt = null;
    private static OS os = null;

    public static OS getOS() {
        if (os == null) {
            String operSys = System.getProperty("os.name").toLowerCase();
            if (operSys.contains("win")) {
                os = OS.WINDOWS;
            } else if (operSys.contains("nix") || operSys.contains("nux")
                    || operSys.contains("aix")) {
                os = OS.LINUX;
            } else if (operSys.contains("mac")) {
                os = OS.MAC;
            } else if (operSys.contains("sunos")) {
                os = OS.SOLARIS;
            } else if (operSys.contains("ios")) {
                os = OS.IOS;
            } else if (operSys.contains("android") || operSys.contains("oid")) {
                os = OS.ANDROID;
            }
        }
        return os;
    }

    public static PLATFORMS getPlatform(String userPlatform){
        if (pt == null){
            if (userPlatform.toLowerCase().contains("pc")) {
                pt = PLATFORMS.PC;
            } else if (userPlatform.toLowerCase().contains("mobile")) {
                pt = PLATFORMS.MOBILE;
            }
        }
        return pt;
    }
}
