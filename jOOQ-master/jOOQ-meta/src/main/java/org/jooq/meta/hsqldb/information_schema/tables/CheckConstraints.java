/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.hsqldb.information_schema.tables;


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
import org.jooq.meta.hsqldb.information_schema.InformationSchema;


/**
 * one row for each domain constraint, table check constraint, and assertion.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = -689370862;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public final TableField<Record, String> CHECK_CLAUSE = createField(DSL.name("CHECK_CLAUSE"), org.jooq.impl.SQLDataType.VARCHAR(65536), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints() {
        this(DSL.name("CHECK_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints(Name alias) {
        this(alias, CHECK_CONSTRAINTS);
    }

    private CheckConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each domain constraint, table check constraint, and assertion."), TableOptions.table());
    }

    public <O extends Record> CheckConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CHECK_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CheckConstraints as(String alias) {
        return new CheckConstraints(DSL.name(alias), this);
    }

    @Override
    public CheckConstraints as(Name alias) {
        return new CheckConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(String name) {
        return new CheckConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(Name name) {
        return new CheckConstraints(name, null);
    }
}