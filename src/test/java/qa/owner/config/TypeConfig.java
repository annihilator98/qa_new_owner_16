package qa.owner.config;

import org.aeonbits.owner.Config;

// проверить File, URL, Path, byte[]
public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();

}
