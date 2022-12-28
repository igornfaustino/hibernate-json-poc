package nfaustino.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@TypeDef(name = "dataJsonb", typeClass = DataJson.class)
public class MyEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    @Type(type = "dataJsonb")
    private Data fieldJson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getFieldJson() {
        return fieldJson;
    }

    public void setFieldJson(Data field) {
        this.fieldJson = field;
    }
}
