# scdftest-gcppubsub-sink-file
Spring Cloud Stream file sink app with GCP PubSub binder

Generated via https://start-scs.cfapps.io
POM patched to properly match Spring Cloud Stream and Spring Boot versions

See also https://docs.spring.io/spring-cloud-stream-app-starters/docs/current/reference/htmlsingle/#customizing-binder

Note: when running locally with PubSub emulator specify these properties
- `--spring.cloud.gcp.project-id=<project ID set in PubSub emulator>`
- `--spring.cloud.gcp.pubsub.emulatorHost="<PubSub emulator host:port - localhost:8085 usually>"`
