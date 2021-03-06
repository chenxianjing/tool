package org.cc.pay.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

@SpringBootApplication
public class PayApplication {

	@Bean
	public AlipayClient setAlipayClient() {
		/**
		 * 使用沙箱环境，如果要用正式环境，把网关地址换成正式环境
		 */
		return new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", "2016092000556046",
				"MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCZqQ/aeDXNJOC0Ej54Z0ANlXjjcfA5/4+twGI84EaFbpwPtd7QfuL9NGzZ5MYqrnuzZknWczFkbSY8wqdr1w0Wz7wvTMQZu0jrANNZA3RPVv6HdGXYuyaVRm4koyHlTUnypZ7i8eInlktJHyAWzXJ5/Y/swmxGB2Dn1mj1JeOyx2eKQZDYy8KqssRr/7HRC/TyVIRgyXF4vC6scZzobsnYLJNvYbI/or9L8uPjF/9zaP6GjRAm3pPPbJsxinmZe6+Xa74lUmN9nBGKPnvyokdb/hGyffJifpmKknxqe5wCi4inh0WjDfAr11CtdZOkPRjw2jn2v6qhUI1YJnLKaUmfAgMBAAECggEBAIn+8mXZHzgkrkgJOmEXGMcaPX7FjGAJyxbXd2IEaFDcjPru8jN8QI30zuzAL9eU6zKp4hXdTbZK79QRXBnU/8REu1QfNN2G/G1QSH3gREwcbGlpdy20pWnZ3oC4oHA1gPuREafuYpP6vZHligPwbaZwuRh/Yo1hgv2x6ICAjoS2cHVY5sv+XYxLEY1tEya+NEpslZAGAX2X6Z0Kl0xvlI7SJsme6GPLKUnVk6F2T8TtToVxv8W/zsbksKj8tSgo1TWvhMdzT2REV3dXW9CK7IInqkq7sb4LMlrk0A5u25pQ2MsaGBq3D8o4ZgDS2fUMriGkjkAbynGejpjxQZvAVAECgYEA/eX1d2Qz+xEnestLKnWhqMgPKUnmG7GHr81d7FaXAJ1jLLK7cWaZHYE3MsFmwVROTS16Mr/WBGRJsBAhFEa6G9vBh8hMclCeI+mM95qD3/8ECy/IU4PzM1YVGymDPUFWuPP3XLT4KYlG2vpYr/S3uznznx130RgjX/cEx/XoVcECgYEAmu6v2AQkWh4VF59jjdj0xoruvyUauZgwQPssp6p74iauBtIPOfsoZ7HBBuAFuVKmqk6ZQx2dMUOXmBSnGTx+tYb2RHXnDC4N6yQgQu06f2K8GkPFVErPh5VeHpqTn+OiwXPNRwjQCEGVto45evKdd2bbQvdwy2KDTGKysHIFN18CgYAOmv3l4lPDK5dzzuICDUZBaVDF9URRb4L4r/2pLMn+9Q7RcW6q9VX1hotgVhPNJ0Zh1i3jYXm0QviiMitU+USXearGXtVW9iBCvJqpW7AeYJMg+ZyygTKqT1djep3cFjgg55fhM1/bM9RpoGEdrhwrnwfOrWlJE/Rk/ta9kf3NgQKBgB/vlXWcnPWqf8SHyVii4QnP95iVCGY7Va7/V1wUS0b5nCOxxwu3lsORI23MXcGupMY0P2lTQGS4PxZNI4iTLLc0Y60G9KJRF/NhVfkVt1osuwNa9uECLrcO9gCu8kEiBhmESksbKO6avkaMGJMcUZMcM5QhNzHlU5U6PwUZ67NXAoGAEmyXHotFH54P6kFQ5DljWc1ko3PZbcu1MHFIY/puqFGduv+XZkUiBnGLmHVYBWLeQWJJgtgzWhm3/Jl8BkwJI1sCSfhnJ9O44Sfg6vGAy2FpYD2iq02WBCXhh5qmdtmsbEpNs6zGaOXh/M6DDjwK8I/WB8ebnDFh9XdRfS1/wS8=",
				"json", "utf-8",
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmakP2ng1zSTgtBI+eGdADZV443HwOf+PrcBiPOBGhW6cD7Xe0H7i/TRs2eTGKq57s2ZJ1nMxZG0mPMKna9cNFs+8L0zEGbtI6wDTWQN0T1b+h3Rl2LsmlUZuJKMh5U1J8qWe4vHiJ5ZLSR8gFs1yef2P7MJsRgdg59Zo9SXjssdnikGQ2MvCqrLEa/+x0Qv08lSEYMlxeLwurHGc6G7J2CyTb2GyP6K/S/Lj4xf/c2j+ho0QJt6Tz2ybMYp5mXuvl2u+JVJjfZwRij578qJHW/4Rsn3yYn6ZipJ8anucAouIp4dFow3wK9dQrXWTpD0Y8No59r+qoVCNWCZyymlJnwIDAQAB",
				"RSA2"); // 获得初始化的AlipayClient
	}

	public static void main(String[] args) {
		SpringApplication.run(PayApplication.class, args);
	}

}
