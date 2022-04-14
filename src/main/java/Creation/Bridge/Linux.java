package Creation.Bridge;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linux implements OperatingSystem{

    @Override
    public String getCpu() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return processor.toString();
    }

    @Override
    public String getVersion() throws IOException {
        Process p = Runtime.getRuntime().exec("uname -r");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
        return in.readLine();
    }

    @Override
    public String getKernelVersion() throws IOException {
        Process p = Runtime.getRuntime().exec("uname -v");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
        return in.readLine();
    }
}
