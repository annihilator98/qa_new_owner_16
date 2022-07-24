package qa.owner.config;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.Sources({
        "classpath:${host}.properties"
})
public interface WebTestConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://rabota.by/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("remoteUrl")
    URL getRemoteURL();

    @Key("browserVersion")
    String getBrowserVersion();
}