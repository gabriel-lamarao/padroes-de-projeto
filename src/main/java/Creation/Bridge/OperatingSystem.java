package Creation.Bridge;

import java.io.IOException;

public interface OperatingSystem {
    public String getCpu();
    public String getVersion() throws IOException;
    public String getKernelVersion() throws IOException;
}
