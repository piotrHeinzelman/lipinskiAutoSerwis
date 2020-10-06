FROM java

FROM ubuntu:18.04
COPY . /app
RUN make /app
CMD python /app/app.py


FROM openjdk:7
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]

You can then run and build the Docker image:

$ docker build -t my-java-app .
$ docker run -it --rm --name my-running-app my-java-app

Compile your app inside the Docker container

There may be occasions where it is not appropriate to run your app inside a container. To compile, but not run your app inside the Docker instance, you can write something like:

$ docker run --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:7 javac Main.java