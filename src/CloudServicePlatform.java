public class CloudServicePlatform {
    private final CloudProvider provider;

    public CloudServicePlatform(CloudProvider provider){
        this.provider = provider;
    }
    public void hostingTo (AppWeb app) { //OCP
        provider.connect(app);
    }
    // More Methods
}

