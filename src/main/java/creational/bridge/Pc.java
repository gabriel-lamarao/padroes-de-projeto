package creational.bridge;

import libs.Util;

public class Pc extends Platform{
    private String platform = "";
    public Pc(){}

    @Override
    public String generateReport() {

        switch (Util.getOS()) {
            case WINDOWS ->
                /*OperatingSystem windows = new Windows();
                System.out.println("Windows: "
                        + windows.getCpu()
                        + windows.getKernelVersion()
                        + windows.getVersion());*/
                    this.platform = "windows";
            case LINUX ->
                /*OperatingSystem linux = new Linux();
                System.out.println("Linux: "
                        + linux.getCpu()
                        + linux.getVersion()
                        + linux.getKernelVersion());*/
                    this.platform = "linux";
        }
        return platform;
    }
}
