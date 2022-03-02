package com.example.testthread;

import com.example.testthread.service.AsyncTaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestThreadApplicationTests {

    @Autowired
    private AsyncTaskService asyncTaskService;

    @Test
    void contextLoads() {
    }

    @Test
    public void threadTest(){
        for (int i = 0; i<20 ;i++){
            this.asyncTaskService.executeAsyncTask(i);
        }
    }
}
