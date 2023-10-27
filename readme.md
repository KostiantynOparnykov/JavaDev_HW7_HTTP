### Module 7 homework "HTTP protocol"

This is homework for Module 7 of Java Developer (14) GoIt course

There is a site `https://http.cat` that contains diff cat images for diff `GET` response codes
* `HttpStatusChecker` class on response code should return link for appropriate cat image. Class have only one method `String getStatusImage(int code)`

* `HttpStatusImageDownloader` class also have one method `void downloadStatusImage(int code)`. Have to download cat image based on status code.
* `HttpImageStatusCli` class. Method `void askStatus` ask user to enter status code, downloading appropriate image or asking user to validate his input values.