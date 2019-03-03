package me.test.sample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-03-03
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class SampleControllerTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private SampleService mockSampleService;

    @Test
    public void hello() {

        when(mockSampleService.getName()).thenReturn("jaehyun222");

        String result = testRestTemplate.getForObject("/hello", String.class);
        assertThat(result).isEqualTo("hello jaehyun222");
    }

    @Test
    public void hello2() {

        when(mockSampleService.getName()).thenReturn("jaehyun222");

        webTestClient.get().uri("/hello").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello jaehyun222");

        assertThat(outputCapture.toString())
                .contains("abc")
                .contains("skip");
    }
}

