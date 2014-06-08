

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    // TODO - add the implementation
=======

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
=======
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	mValue = initialValue;
    	mRWLock.writeLock().unlock();
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public long get() {
        // TODO - you fill in here
=======
    public long get()
    {
        long value;

        // TODO -- you fill in here
        mRWLock.readLock().lock();
        value = mValue;
        mRWLock.readLock().unlock();

        return value;
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public long decrementAndGet() {
        // TODO - you fill in here
=======
    public long decrementAndGet()
    {
        long value = 0;

        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	value = --mValue;
    	mRWLock.writeLock().unlock();

        return value;
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public long getAndIncrement() {
        // TODO - you fill in here
=======
    public long getAndIncrement()
    {
        long value = 0;

        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	value = mValue++;
    	mRWLock.writeLock().unlock();

        return value;
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public long getAndDecrement() {
        // TODO - you fill in here
=======
    public long getAndDecrement()
    {
        long value = 0;

        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	value = mValue--;
    	mRWLock.writeLock().unlock();

        return value;
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< Updated upstream:assignments/week-3-assignment-2/src/edu/vuum/mocca/SimpleAtomicLong.java
    public long incrementAndGet() {
        // TODO - you fill in here
=======
    public long incrementAndGet()
    {
        long value = 0;

        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	value = ++mValue;
    	mRWLock.writeLock().unlock();

        return value;
>>>>>>> Stashed changes:assignments/week-3-assignment-2/src/SimpleAtomicLong.java
    }
}

