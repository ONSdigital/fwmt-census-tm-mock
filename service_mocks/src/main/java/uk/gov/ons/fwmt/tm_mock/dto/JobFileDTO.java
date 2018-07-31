package uk.gov.ons.fwmt.tm_mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobFileDTO {

  private String filename;

  private LocalDateTime fileTime;

  private LocalDateTime fileReceivedTime;

  private boolean validated;

}
