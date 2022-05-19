#pragma semicolon 1

methodmap Base {
	public Base() {
		return view_as<Base>();
	}

	public int BaseMethod(int x) { return x; }

	public native void BaseNativeMethod();

	public int OverrideMethod() { }

	public static int StaticBase(int i) { return i; }

	property int Property {
		public get() {return 4;}
	}
}



methodmap Child < Base {
	public Child() {
		return view_as<Child>(Base());
	}

	public int OverrideMethod() { }

	public int ChildMethod() { }

	public static int StaticChild() { }
}

#define BYTEREADER_MAX 1024
#include <bytereader>
#include "sublimetestinclude.sp"
#pragma semicolon 1
#pragma newdecls required
#define MYDEFINE (1 << 5)

#define DEBUG 0
#if DEBUG == 0
  #define MYTHING 1
 #elseif DEBUG == 1
  #define MYTHING 2
 #else
  #define MYTHING 0
 #endif

stock void stockFunction(any a) { }

void TestMethod(const char str[] = "/*hello*/ //world") {

}

enum struct MyEnumStruct {
	int intValue;
	float floatValue;
	char charArray[32];
	/*
		Comment
	 */
	bool boolValue;

	// Comment
	void voidFunction() { }
	int intFunction(int i) { return i; }

	float floatFunction(float f) { return f; } 
	/**
	 * Comment
	 */
	bool boolFunction(bool b) { return b; }

	void stringFunction(const char[] str, int size) { }

	any anyFunction(any a) { return a; }
}

enum EnumTest {
	value1 = 1,
	// comment
	value2,
	/* asdf
	 */
	value3, // comment
	value4
}


public void OnPluginStart() 
{	int b = 0b1_0_1;
	float f = 2.0_13_3;
	int h = 0xaEb325Fe;
	
	Child c = Child();
	Child children[3][3];

	MyEnumStruct e;
	Print("Hell\x;zz\
		o");

	/* value char excapes during strings
	   \[abefnrt'"%\\];
	   \(?:[01][0-9][0-9]|2[0-4][0-9]|25[0-5]);
	   \x[a-fA-F0-9]{0,2};
	   \\n 
	   anything else invalid:
	   \.
	 */
	PrintToServer("/*hello*/ //world");

	TestMethod(const char str[] = "  //world")
	for (int i = 0; i < 5; ++i) {
		PrintToServer("%i", i + 2)
	}
}

