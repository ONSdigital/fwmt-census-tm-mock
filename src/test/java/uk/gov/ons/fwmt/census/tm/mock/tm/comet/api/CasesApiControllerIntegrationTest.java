package uk.gov.ons.fwmt.census.tm.mock.tm.comet.api;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.FetchResponseCase;
import uk.gov.ons.fwmt.census.tm.mock.tm.comet.model.ModelCase;

import static org.junit.Assert.assertEquals;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class CasesApiControllerIntegrationTest {

  @Autowired
  private CasesApi api;

  @Test
  public void casesByIdGetTest() {
    String id = "id_example";
    ResponseEntity<ModelCase> responseEntity = api.casesByIdGet(id);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesByIdPostTest() {
    String id = "id_example";
    ModelCase body = new ModelCase();
    ResponseEntity<Void> responseEntity = api.casesByIdPost(id, body);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

  @Test
  public void casesGetTest() {
    String filter = "filter_example";
    Integer pageNo = 56;
    Integer pageSize = 56;
    ResponseEntity<FetchResponseCase> responseEntity = api.casesGet(filter, pageNo, pageSize);
    assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
  }

}