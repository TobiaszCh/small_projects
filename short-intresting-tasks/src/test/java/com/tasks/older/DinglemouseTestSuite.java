package com.tasks.older;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinglemouseTestSuite {

    @Test
    public void ex1() {
        assertEquals("I am really furious. You and you are fired!", Dinglemouse.fireAndFury("EIREFURYRIREEIREFURYIURYIIREIIRERURYFIREEIREFIRE"));
    }

    @Test
    public void ex2() {
        assertEquals("You are fired! I am really furious. You are fired!", Dinglemouse.fireAndFury("FIREYYFURYYFURYYFURRYFIRE"));
    }

    @Test
    public void ex3() {
        assertEquals("Fake tweet.", Dinglemouse.fireAndFury("FYRYFIRUFIRUFURE"));
    }

}