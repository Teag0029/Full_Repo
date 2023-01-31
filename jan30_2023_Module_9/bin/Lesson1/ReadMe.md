# Output and Input Streams

### OutputStream and System.out
- writes elements to a buffer, then prints char by char
- if class has no toString(), usually outputs "className@memoryLocation"

### InputStream and System.in
- will read from a buffer
- when buffer empty, program will wait for more data

### Byte Stream, Throws Clause, and Scanner
a Byte Stream is a buffer of bytes (8 bits)
when code uses an InputStream, use "throws IOException{code}"
- that expects an error, keeping ur program from crashing
Scanner is a wrapper class for System.in