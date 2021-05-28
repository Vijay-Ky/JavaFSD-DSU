package com.lara;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class I implements Externalizable
{
	int x;
	double y;
	String z;	
	I(int x, double y, String z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(x);
		//out.writeDouble(y);
		out.writeUTF(z);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		x = in.readInt();
		//y = in.readDouble();
		z = in.readUTF();		
	}

}








