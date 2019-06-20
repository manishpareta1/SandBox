package com.examples.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo implements Externalizable{

	public String s;
	int i;
	int j;
	/*
	 * @Default Constructor
	 * Must Require during Deserialization as JVM creates new object and assign all serialized values to this object
	 */
	/*public ExternalizationDemo(){
		System.out.println(this.s +" "+this.i+" "+this.j);
	} 
	public ExternalizationDemo(String s, int i, int j){
		this.s=s;
		this.i=i;
		this.j=j;
				
	}*/

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		s = (String) in.readObject();
		i = in.readInt();
		j = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(s);
		out.writeInt(i);
		out.writeInt(j);
	}
	
}
