**Video Streaming Demo (Spring Boot)**

- A demo app simulating a configurable video streaming pipeline using the Decorator, Strategy, and Builder design patterns.
- Demonstrates how features like compression, encryption, and annotation can be selectively applied at runtime without altering the core streaming logic.
- **Decorator** – dynamically attaches new responsibilities to the stream by layering behaviors around a base object.
- **Builder** – enables fluent method chaining to incrementally construct complex processing pipelines.
- **Strategy** – allows interchangeable algorithms (compression or encryption) to be selected dynamically based on user input.
- Leverages object composition to promote modularity, behavior layering through wrapping, and a flexible structure that separates configuration from execution.

Clone (https://github.com/ulkpro/VideoStreaming.git)
and Run the app (./mvnw spring-boot:run)

Send a POST request to /stream

curl -X POST "http://localhost:9091/stream?video=sample.mp4&compress=true&compressionType=vp9&encrypt=true&encryptionType=aes&watermark=true&subtitles=true"

(Features like compression, encryption, watermarking, and subtitles are mocked for learning purposes.)
