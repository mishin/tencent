/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.ddl.db.h2;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in FLYWAY_TEST
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>FLYWAY_TEST.S_AUTHOR_ID</code>
     */
    public static final Sequence<Long> S_AUTHOR_ID = Internal.createSequence("S_AUTHOR_ID", FlywayTest.FLYWAY_TEST, org.jooq.impl.SQLDataType.BIGINT, null, null, null, null, false, null);
}
