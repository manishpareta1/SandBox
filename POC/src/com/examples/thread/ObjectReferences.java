package com.examples.thread;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ObjectReferences {
	
	
	public static void main (String[] args) {
		ObjectReferences ref = new ObjectReferences();
		ObjectReferences ref1 = new ObjectReferences();
		
		SoftReference<ObjectReferences> soft = new SoftReference<ObjectReferences>(ref);
		ref = null;
		System.gc();
		System.out.println(soft.get());
		
		WeakReference<ObjectReferences> weak = new WeakReference<ObjectReferences>(ref);
		ref1 = null;
		System.gc();
		System.out.println(weak.get());
		
		/*SoftReference<ObjectReferences> soft = new PhantomReference<ObjectReferences>(ref);
		ref = null;
		System.gc();
		System.out.println(soft.get());*/
	}

}
