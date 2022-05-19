
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