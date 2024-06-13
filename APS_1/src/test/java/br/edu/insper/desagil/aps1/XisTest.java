package br.edu.insper.desagil.aps1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XisTest {
    private Xis x;

    @BeforeEach
    void setUp() {
        x = new Xis();
    }

    @Test
    void constroiPara1() {
        assertEquals(String.join("\n",
                "X",
                ""), x.constroi(1));
    }

    @Test
    void constroiPara2() {
        assertEquals(String.join("\n",
                "X X",
                " X",
                "X X",
                ""), x.constroi(2));
    }

    @Test
    void constroiPara3() {

        assertEquals(String.join("\n",
                "X   X",
                " X X",
                "  X",
                " X X",
                "X   X",
                ""), x.constroi(3));
    }

    @Test
    void constroiPara4() {
        assertEquals(String.join("\n",
                "X     X",
                " X   X",
                "  X X",
                "   X",
                "  X X",
                " X   X",
                "X     X",
                ""), x.constroi(4));
    }

    @Test
    void constroiPara5() {
        assertEquals(String.join("\n",
                "X       X",
                " X     X",
                "  X   X",
                "   X X",
                "    X",
                "   X X",
                "  X   X",
                " X     X",
                "X       X",
                ""), x.constroi(5));
    }
}
