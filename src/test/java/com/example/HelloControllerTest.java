package com.example;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloControllerTest extends SpringExampleDockerApplicationTests{

    @Test
    public void sayHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }

    @Test
    public void sayHelloYourName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/?firstName=Antoine"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Antoine"));
    }
}