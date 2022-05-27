
// methodmap Base {
// 	public Base() {
// 		return view_as<Base>();
// 	}

// 	public int BaseMethod(int x) { return x; }

// 	public native void BaseNativeMethod();

// 	public int OverrideMethod() { }

// 	public static int StaticBase(int i) { return i; }

// 	property int Property {
// 		public get() {return 4;}
// 	}
// }



// methodmap Child < Base {
// 	public Child() {
// 		return view_as<Child>(Base());
// 	}

// 	public int OverrideMethod() { return -1; }

// 	public int ChildMethod(int x) { return this.BaseMethod(x); }

// 	public static int StaticChild(int i) { return; }
// }


methodmap Base {
	public Base() { }

	public int BaseMethod(int x) { }

	public native void BaseNativeMethod();

	public int OverrideMethod() { }

	public static int StaticBase(int i) {}

	property int Property {
		public get() {}
		public native set(int valid);
	}
};



methodmap Child < Base {
	public Child() { }

	public int OverrideMethod() { }

	public native int ChildMethod(int x);

	public static int StaticChild(int i) { }
}