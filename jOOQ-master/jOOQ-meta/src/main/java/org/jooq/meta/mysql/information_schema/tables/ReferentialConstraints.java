/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


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
import org.jooq.meta.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferentialConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 986266884;

    /**
     * The reference instance of <code>information_schema.REFERENTIAL_CONSTRAINTS</code>
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public static final TableField<Record, String> UNIQUE_CONSTRAINT_CATALOG = createField(DSL.name("UNIQUE_CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public static final TableField<Record, String> UNIQUE_CONSTRAINT_SCHEMA = createField(DSL.name("UNIQUE_CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public static final TableField<Record, String> UNIQUE_CONSTRAINT_NAME = createField(DSL.name("UNIQUE_CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public static final TableField<Record, String> MATCH_OPTION = createField(DSL.name("MATCH_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public static final TableField<Record, String> UPDATE_RULE = createField(DSL.name("UPDATE_RULE"), org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public static final TableField<Record, String> DELETE_RULE = createField(DSL.name("DELETE_RULE"), org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    public static final TableField<Record, String> REFERENCED_TABLE_NAME = createField(DSL.name("REFERENCED_TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), REFERENTIAL_CONSTRAINTS, "");

    /**
     * No further instances allowed
     */
    private ReferentialConstraints() {
        this(DSL.name("REFERENTIAL_CONSTRAINTS"), null);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ReferentialConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REFERENTIAL_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
