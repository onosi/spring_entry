package onosi.example.onosi_sample;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class OnosiSampleApplicationTests {

	@Test
	void testHello(@Autowired MockMvc mvc) throws Exception {
		mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Hello world!"));
	}
}
