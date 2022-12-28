package nfaustino.com;

import java.io.Serializable;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Data implements Serializable {
    private String stringProp;

    private Long longProp;

    public Data() {
    }

    public String getStringProp() {
        return stringProp;
    }

    public void setStringProp(String stringProp) {
        this.stringProp = stringProp;
    }

    public Long getLongProp() {
        return longProp;
    }

    public void setLongProp(Long longProp) {
        this.longProp = longProp;
    }
}
