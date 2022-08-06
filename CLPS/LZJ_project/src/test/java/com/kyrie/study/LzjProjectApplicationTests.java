package com.kyrie.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LzjProjectApplicationTests {

    @Test
    void contextLoads() {
        String test="273.97 ㎡|17/19层| 4室1厅";
        for (String s : test.split("\\|")) {
            System.out.println(s);
        }
    }

}
