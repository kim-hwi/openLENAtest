package io.openlena.ctl.common.vo;

import static org.junit.Assert.*;

import io.openlena.ctl.util.StringUtil;
import io.openlena.ctl.common.vo.Server;
import org.junit.Test;


public class ServerTest {

    @Test
    public void testRecovery() {
        Server sever = new Server();
        sever.setRecovery("sever1");
        assertTrue(sever.getRecovery()=="sever1");
    }
}
