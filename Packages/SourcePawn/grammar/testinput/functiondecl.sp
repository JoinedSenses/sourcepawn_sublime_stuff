typeset Thing {
    (function int (int x));
    function void ();
}

public Action OnPlayerRunCmd(int client, int &buttons, int &impulse, float vel[3], float angles[3], int &weapon, int &subtype, int &cmdnum, int &tickcount, int &seed, int mouse[2]) {
	
}

public void OnPluginStart(int x = 5) {

}

native int CCC_GetColor(int client, CCC_ColorType type, bool &alpha = false);

forward Action CCC_OnColor(int client, const char[] message, CCC_ColorType type);

native int ReadFlagString(const char[] flags, int &numchars=0);

int[] f(int x = 4) {

}

native int AddTargetsToMenu(Handle menu,
							int source_client,
							bool in_game_only=true,
							bool alive_only=false);


void More(any ...) {

}