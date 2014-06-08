package edu.vuum.mocca;
<<<<<<< HEAD
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class SimpleSemaphore
 *
 * @brief This class provides a simple counting semaphore
 *        implementation using Java a ReentrantLock and a
 *        ConditionObject (which is accessed via a Condition). It must
 *        implement both "Fair" and "NonFair" semaphore semantics,
 *        just liked Java Semaphores.
=======

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

/**
 * @class SimpleSemaphore
 * 
 * @brief This class provides a simple counting semaphore implementation using
 *        Java a ReentrantLock and a ConditionObject. It must implement both
 *        "Fair" and "NonFair" semaphore semantics, just liked Java Semaphores.
>>>>>>> 26510068d298f5c22c69a66fe03618faef79168b
 */
public class SimpleSemaphore {
    /**
     * Define a ReentrantLock to protect the critical section.
     */
    // TODO - you fill in here
<<<<<<< HEAD
    private final ReentrantLock mLock;


    /**
     * Define a Condition that waits while the number of permits is 0.
     */
    // TODO - you fill in here
    private final Condition mNotEmpty;
=======

    /**
     * Define a ConditionObject to wait while the number of
     * permits is 0.
     */
    // TODO - you fill in here
>>>>>>> 26510068d298f5c22c69a66fe03618faef79168b

    /**
     * Define a count of the number of available permits.
     */
    // TODO - you fill in here.  Make sure that this data member will
    // ensure its values aren't cached by multiple Threads..
<<<<<<< HEAD
    private volatile int mPermits; 
    

    public SimpleSemaphore (int permits, boolean fair) { 
        // TODO - you fill in here to initialize the SimpleSemaphore,
        // making sure to allow both fair and non-fair Semaphore
        // semantics.
    	mPermits = permits;
    	mLock = new ReentrantLock(fair);
    	mNotEmpty = mLock.newCondition();
    }

    /**
     * Acquire one permit from the semaphore in a manner that can be 
     * interrupted.
     */
    public void acquire() throws InterruptedException {
        // TODO - you fill in here
    	mLock.lockInterruptibly();
    	//Only possible if mPermits > 0
    	try {
            while (mPermits <= 0) {mNotEmpty.await();}
            --mPermits;
            mNotEmpty.signalAll();
    		
    	}
    	finally {
    		mLock.unlock();
    	}
    }

    /**
     * Acquire one permit from the semaphore in a manner that cannot be 
     * interrupted.
     */
    public void acquireUninterruptibly() {
        // TODO - you fill in here
    	mLock.lock();
    	//Only possible if mPermits > 0
    	
    	try {
            while (mPermits <= 0) {mNotEmpty.awaitUninterruptibly();}
            --mPermits;
            mNotEmpty.signalAll();
    		
    	}
    	finally {
    		mLock.unlock();
    	}
=======

    public SimpleSemaphore(int permits, boolean fair) {
        // TODO - you fill in here to initialize the SimpleSemaphore,
        // making sure to allow both fair and non-fair Semaphore
        // semantics.
    }

    /**
     * Acquire one permit from the semaphore in a manner that can be
     * interrupted.
     */
    public void acquire() throws InterruptedException {
        // TODO - you fill in here.
    }

    /**
     * Acquire one permit from the semaphore in a manner that cannot be
     * interrupted.
     */
    public void acquireUninterruptibly() {
        // TODO - you fill in here.
>>>>>>> 26510068d298f5c22c69a66fe03618faef79168b
    }

    /**
     * Return one permit to the semaphore.
     */
<<<<<<< HEAD
    public void release() {
        // TODO - you fill in here
    	mLock.lock();
    	try {
    		++mPermits;
    		mNotEmpty.signalAll();
    	}
    	finally {
    		mLock.unlock();
    	}
    }


=======
    void release() {
        // TODO - you fill in here.
    }

>>>>>>> 26510068d298f5c22c69a66fe03618faef79168b
    /**
     * Return the number of permits available.
     */
    public int availablePermits() {
        // TODO - you fill in here by changing null to the appropriate
        // return value.
<<<<<<< HEAD
        return mPermits;
=======
        return null;
>>>>>>> 26510068d298f5c22c69a66fe03618faef79168b
    }
}
