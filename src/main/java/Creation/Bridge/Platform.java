package Creation.Bridge;

import Creation.libs.Util;

import java.io.IOException;

abstract public class Platform {
    OperatingSystem linux = new Linux();
    OperatingSystem windows = new Windows();

    public void generateReport() throws IOException {
        switch (Util.getOS()) {
            case WINDOWS:
                System.out.println("Windows: "
                        + windows.getCpu()
                        + windows.getKernelVersion()
                        + windows.getVersion());
                break;
            case LINUX:
                System.out.println("Linux: "
                        + linux.getCpu()
                        + linux.getVersion()
                        + linux.getKernelVersion());
                break;

        }
    }
}
