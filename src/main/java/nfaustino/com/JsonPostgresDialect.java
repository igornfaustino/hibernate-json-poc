package nfaustino.com;

import java.sql.Types;

import javax.inject.Singleton;

import org.hibernate.dialect.PostgreSQL10Dialect;

@Singleton
public class JsonPostgresDialect extends PostgreSQL10Dialect {

    public JsonPostgresDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "json");
    }
}