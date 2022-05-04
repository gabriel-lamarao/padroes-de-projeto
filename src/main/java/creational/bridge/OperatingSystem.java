package creational.bridge;

import java.io.IOException;

public interface OperatingSystem {
    String getCpu();
    String getVersion() throws IOException;
    String getKernelVersion() throws IOException;
}
