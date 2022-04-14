package Creation.Bridge;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class Windows implements OperatingSystem{

    @Override
    public String getCpu() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        return processor.toString();
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public String getKernelVersion() {
        return null;
    }
}
