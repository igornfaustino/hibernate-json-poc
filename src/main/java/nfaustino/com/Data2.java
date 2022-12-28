package nfaustino.com;

import java.io.Serializable;

public class Data2 implements Serializable {
    private String stringProp2;

    private Long longProp;

    public String getStringProp2() {
        return stringProp2;
    }

    public void setStringProp2(String stringProp) {
        this.stringProp2 = stringProp;
    }

    public Long getLongProp() {
        return longProp;
    }

    public void setLongProp(Long longProp) {
        this.longProp = longProp;
    }
}
