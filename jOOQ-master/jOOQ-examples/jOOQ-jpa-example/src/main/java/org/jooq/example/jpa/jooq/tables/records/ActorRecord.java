/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.jpa.jooq.tables.Actor;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorRecord extends UpdatableRecordImpl<ActorRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 642455114;

    /**
     * Setter for <code>ACTOR.ACTORID</code>.
     */
    public void setActorid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ACTOR.ACTORID</code>.
     */
    public Integer getActorid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ACTOR.FIRSTNAME</code>.
     */
    public void setFirstname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ACTOR.FIRSTNAME</code>.
     */
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ACTOR.LASTNAME</code>.
     */
    public void setLastname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ACTOR.LASTNAME</code>.
     */
    public String getLastname() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Actor.ACTOR.ACTORID;
    }

    @Override
    public Field<String> field2() {
        return Actor.ACTOR.FIRSTNAME;
    }

    @Override
    public Field<String> field3() {
        return Actor.ACTOR.LASTNAME;
    }

    @Override
    public Integer component1() {
        return getActorid();
    }

    @Override
    public String component2() {
        return getFirstname();
    }

    @Override
    public String component3() {
        return getLastname();
    }

    @Override
    public Integer value1() {
        return getActorid();
    }

    @Override
    public String value2() {
        return getFirstname();
    }

    @Override
    public String value3() {
        return getLastname();
    }

    @Override
    public ActorRecord value1(Integer value) {
        setActorid(value);
        return this;
    }

    @Override
    public ActorRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public ActorRecord value3(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public ActorRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorRecord
     */
    public ActorRecord() {
        super(Actor.ACTOR);
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    public ActorRecord(Integer actorid, String firstname, String lastname) {
        super(Actor.ACTOR);

        set(0, actorid);
        set(1, firstname);
        set(2, lastname);
    }
}