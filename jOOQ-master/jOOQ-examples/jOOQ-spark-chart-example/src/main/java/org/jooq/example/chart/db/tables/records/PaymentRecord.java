/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.chart.db.tables.Payment;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record6<Integer, Integer, Integer, Integer, BigDecimal, LocalDateTime> {

    private static final long serialVersionUID = -1124289195;

    /**
     * Setter for <code>public.payment.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment.payment_id</code>.
     */
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payment.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.payment.staff_id</code>.
     */
    public void setStaffId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment.staff_id</code>.
     */
    public Integer getStaffId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.payment.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.payment.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.payment.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Payment.PAYMENT.PAYMENT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Payment.PAYMENT.CUSTOMER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Payment.PAYMENT.STAFF_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Payment.PAYMENT.RENTAL_ID;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Payment.PAYMENT.AMOUNT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Payment.PAYMENT.PAYMENT_DATE;
    }

    @Override
    public Integer component1() {
        return getPaymentId();
    }

    @Override
    public Integer component2() {
        return getCustomerId();
    }

    @Override
    public Integer component3() {
        return getStaffId();
    }

    @Override
    public Integer component4() {
        return getRentalId();
    }

    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    @Override
    public LocalDateTime component6() {
        return getPaymentDate();
    }

    @Override
    public Integer value1() {
        return getPaymentId();
    }

    @Override
    public Integer value2() {
        return getCustomerId();
    }

    @Override
    public Integer value3() {
        return getStaffId();
    }

    @Override
    public Integer value4() {
        return getRentalId();
    }

    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    @Override
    public LocalDateTime value6() {
        return getPaymentDate();
    }

    @Override
    public PaymentRecord value1(Integer value) {
        setPaymentId(value);
        return this;
    }

    @Override
    public PaymentRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public PaymentRecord value3(Integer value) {
        setStaffId(value);
        return this;
    }

    @Override
    public PaymentRecord value4(Integer value) {
        setRentalId(value);
        return this;
    }

    @Override
    public PaymentRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public PaymentRecord value6(LocalDateTime value) {
        setPaymentDate(value);
        return this;
    }

    @Override
    public PaymentRecord values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Integer paymentId, Integer customerId, Integer staffId, Integer rentalId, BigDecimal amount, LocalDateTime paymentDate) {
        super(Payment.PAYMENT);

        set(0, paymentId);
        set(1, customerId);
        set(2, staffId);
        set(3, rentalId);
        set(4, amount);
        set(5, paymentDate);
    }
}
