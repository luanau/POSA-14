<<<<<<< Updated upstream
// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

=======
package edu.vuum.mocca;


>>>>>>> Stashed changes
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
<<<<<<< Updated upstream


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - add the implementation
=======
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
>>>>>>> Stashed changes

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< Updated upstream
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
    public long get() {
        // TODO - you fill in here
=======
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	mRWLock.writeLock().lock();
    	mValue = initialValue;
    	mRWLock.writeLock().unlock();
    }

    /**
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
    public long get()
    {
        long value;

        // TODO -- you fill in here
        mRWLock.readLock().lock();
        value = mValue;
        mRWLock.readLock().unlock();

        return value;
>>>>>>> Stashed changes
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< Updated upstream
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
>>>>>>> Stashed changes
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< Updated upstream
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
>>>>>>> Stashed changes
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< Updated upstream
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
>>>>>>> Stashed changes
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< Updated upstream
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
>>>>>>> Stashed changes
    }
}

