//class SUSPENDED extends Thread{
//    public void run(){
//        String name=Thread.currentThread().getName();
//   for(int i=1; i<=4; i++){
//       System.out.println(name);
//   }
//    }
//}
//class H{
//    public static void main(String[] args) {
//
//        SUSPENDED name1= new SUSPENDED();
//        SUSPENDED name2= new SUSPENDED();
//        SUSPENDED name3= new SUSPENDED();
//        SUSPENDED name4= new SUSPENDED();
//
//        name1.setName("VIVEK 1");
//        name2.setName("VIVEK 2");
//        name3.setName("VIVEK 3");
//        name4.setName("VIVEK 4");
//
//        name1.start();
//        name2.start();
//        name3.start();
//        name4.start();
//
//        name2.suspend();
//        name2.resume();
//
////after 1.1 remove both method
// //
//        //  java.lang.Thread
//        //@Deprecated(since = "1.2", forRemoval = true)
//        //public final void suspend()
//        //Suspends this thread.
//        //First, the checkAccess method of this thread is called with no arguments. This may result in throwing a SecurityException (in the current thread).
//        //If the thread is alive, it is suspended and makes no further progress unless and until it is resumed.
//        //Deprecated
//        //This method has been deprecated, as it is inherently deadlock-prone. If the target thread holds a lock on the monitor protecting a critical system resource when it is suspended, no thread can access this resource until the target thread is resumed. If the thread that would resume the target thread attempts to lock this monitor prior to calling resume, deadlock results. Such deadlocks typically manifest themselves as "frozen" processes. For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
//        //Throws:
//        //SecurityException – if the current thread cannot modify this thread.
//        //UnsupportedOperationException – if invoked on a virtual thread
//
//
//    }
//}