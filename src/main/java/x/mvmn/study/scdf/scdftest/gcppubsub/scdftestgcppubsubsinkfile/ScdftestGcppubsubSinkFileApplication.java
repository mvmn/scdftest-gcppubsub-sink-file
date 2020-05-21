package x.mvmn.study.scdf.scdftest.gcppubsub.scdftestgcppubsubsinkfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.app.file.sink.FileSinkConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(FileSinkConfiguration.class)
public class ScdftestGcppubsubSinkFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScdftestGcppubsubSinkFileApplication.class, args);
	}
}
