package kyo.concurrent

import kyo.core._
import kyo.ios._

import java.util.concurrent.atomic.{AtomicBoolean => JAtomicBoolean}
import java.util.concurrent.atomic.{AtomicInteger => JAtomicInteger}
import java.util.concurrent.atomic.{AtomicLong => JAtomicLong}
import java.util.concurrent.atomic.{AtomicReference => JAtomicReference}
import scala.annotation.tailrec

object atomics {

  opaque type AtomicInt = JAtomicInteger
  object AtomicInt {
    /*inline(1)*/
    def apply(v: Int): AtomicInt > IOs = IOs(JAtomicInteger(v))
  }
  extension (ref: AtomicInt) {
    /*inline(1)*/
    def get: Int > IOs =
      IOs(ref.get())
    /*inline(1)*/
    def set(v: Int): Unit > IOs =
      IOs(ref.set(v))
    /*inline(1)*/
    def lazySet(v: Int): Unit > IOs =
      IOs(ref.lazySet(v))
    /*inline(1)*/
    def getAndSet(v: Int): Int > IOs =
      IOs(ref.getAndSet(v))
    /*inline(1)*/
    def cas(curr: Int, next: Int): Boolean > IOs =
      IOs(ref.compareAndSet(curr, next))
    /*inline(1)*/
    def incrementAndGet: Int > IOs =
      IOs(ref.incrementAndGet())
    /*inline(1)*/
    def decrementAndGet: Int > IOs =
      IOs(ref.decrementAndGet())
    /*inline(1)*/
    def getAndIncrement: Int > IOs =
      IOs(ref.getAndIncrement())
    /*inline(1)*/
    def getAndDecrement: Int > IOs =
      IOs(ref.getAndDecrement())
    /*inline(1)*/
    def getAndAdd(v: Int): Int > IOs =
      IOs(ref.getAndAdd(v))
    /*inline(1)*/
    def addAndGet(v: Int): Int > IOs =
      IOs(ref.addAndGet(v))
  }

  opaque type AtomicLong = JAtomicLong
  object AtomicLong {
    /*inline(1)*/
    def apply(v: Long): AtomicLong > IOs = IOs(JAtomicLong(v))
  }
  extension (ref: AtomicLong) {
    /*inline(1)*/
    def get: Long > IOs =
      IOs(ref.get())
    /*inline(1)*/
    def set(v: Long): Unit > IOs =
      IOs(ref.set(v))
    /*inline(1)*/
    def lazySet(v: Long): Unit > IOs =
      IOs(ref.lazySet(v))
    /*inline(1)*/
    def getAndSet(v: Long): Long > IOs =
      IOs(ref.getAndSet(v))
    /*inline(1)*/
    def cas(curr: Long, next: Long): Boolean > IOs =
      IOs(ref.compareAndSet(curr, next))
    /*inline(1)*/
    def incrementAndGet: Long > IOs =
      IOs(ref.incrementAndGet())
    /*inline(1)*/
    def decrementAndGet: Long > IOs =
      IOs(ref.decrementAndGet())
    /*inline(1)*/
    def getAndIncrement: Long > IOs =
      IOs(ref.getAndIncrement())
    /*inline(1)*/
    def getAndDecrement: Long > IOs =
      IOs(ref.getAndDecrement())
    /*inline(1)*/
    def getAndAdd(v: Long): Long > IOs =
      IOs(ref.getAndAdd(v))
    /*inline(1)*/
    def addAndGet(v: Long): Long > IOs =
      IOs(ref.addAndGet(v))
  }

  opaque type AtomicBoolean = JAtomicBoolean
  object AtomicBoolean {
    /*inline(1)*/
    def apply(v: Boolean): AtomicBoolean > IOs = IOs(JAtomicBoolean(v))
  }
  extension (ref: AtomicBoolean) {
    /*inline(1)*/
    def get: Boolean > IOs =
      IOs(ref.get())
    /*inline(1)*/
    def set(v: Boolean): Unit > IOs =
      IOs(ref.set(v))
    /*inline(1)*/
    def lazySet(v: Boolean): Unit > IOs =
      IOs(ref.lazySet(v))
    /*inline(1)*/
    def getAndSet(v: Boolean): Boolean > IOs =
      IOs(ref.getAndSet(v))
    /*inline(1)*/
    def cas(curr: Boolean, next: Boolean): Boolean > IOs =
      IOs(ref.compareAndSet(curr, next))
  }

  opaque type AtomicReference[T] = JAtomicReference[T]
  object AtomicReference {
    /*inline(1)*/
    def apply[T](v: T): AtomicReference[T] > IOs = IOs(JAtomicReference(v))
  }
  extension [T](ref: AtomicReference[T]) {
    /*inline(1)*/
    def get: T > IOs =
      IOs(ref.get())
    /*inline(1)*/
    def set(v: T): Unit > IOs =
      IOs(ref.set(v))
    /*inline(1)*/
    def lazySet(v: T): Unit > IOs =
      IOs(ref.lazySet(v))
    /*inline(1)*/
    def getAndSet(v: T): T > IOs =
      IOs(ref.getAndSet(v))
    /*inline(1)*/
    def cas(curr: T, next: T): Boolean > IOs =
      IOs(ref.compareAndSet(curr, next))
  }
}
