import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test_RestApiYandex {
	
	
	@Test
	public void test_1() {
		
		given() .auth("application/json") .oauth2("AQAAAABc7vULAADLW54NoFhok04UqRkNEJIc-mQ")
		get("https://dev.yandex.net/disk-polygon/?lang=ru&tld=ru#!/v147disk/GetDisk").
		statusCode(200).
		
		when() .
		
		statusCode(201).
		log().all();
	}
		
		public void test_2() {
			given() .auth("application/json") .oauth2("AQAAAABc7vULAADLW54NoFhok04UqRkNEJIc-mQ")
			put ("https://cloud-api.yandex.net/v1/disk/resources?path=%2Ftest_api")
			when() .
			statusCode(201).
			log().all();
			
			public void test_1() {
				//given() .
				given() .auth("application/json") .oauth2("AQAAAABc7vULAADLW54NoFhok04UqRkNEJIc-mQ")
				delete ("https://cloud-api.yandex.net/v1/disk/resources?path=%2Ftest_api")
				when() .
				
				statusCode(204).
				log().all();
	}

}
