package Creation.Bridge;

public class Windows implements OperatingSystem{

    @Override
    public void getCpu() {
        System.out.println("Nucleos: "+ Runtime.getRuntime().availableProcessors());
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
