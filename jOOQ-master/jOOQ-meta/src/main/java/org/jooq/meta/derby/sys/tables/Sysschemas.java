/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.derby.sys.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.derby.sys.Sys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysschemas extends TableImpl<Record> {

    private static final long serialVersionUID = -1045964877;

    /**
     * The reference instance of <code>SYS.SYSSCHEMAS</code>
     */
    public static final Sysschemas SYSSCHEMAS = new Sysschemas();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>SYS.SYSSCHEMAS.SCHEMAID</code>.
     */
    public static final TableField<Record, String> SCHEMAID = createField(DSL.name("SCHEMAID"), org.jooq.impl.SQLDataType.CHAR(36).nullable(false), SYSSCHEMAS, "");

    /**
     * The column <code>SYS.SYSSCHEMAS.SCHEMANAME</code>.
     */
    public static final TableField<Record, String> SCHEMANAME = createField(DSL.name("SCHEMANAME"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), SYSSCHEMAS, "");

    /**
     * The column <code>SYS.SYSSCHEMAS.AUTHORIZATIONID</code>.
     */
    public static final TableField<Record, String> AUTHORIZATIONID = createField(DSL.name("AUTHORIZATIONID"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), SYSSCHEMAS, "");

    /**
     * No further instances allowed
     */
    private Sysschemas() {
        this(DSL.name("SYSSCHEMAS"), null);
    }

    private Sysschemas(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Sysschemas(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Sysschemas(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SYSSCHEMAS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }
}
