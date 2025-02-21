FROM node:22 

WORKDIR /usr/local/bin

RUN wget https://raw.githubusercontent.com/VirtusLab/scala-cli/main/scala-cli.sh && \
    mv scala-cli.sh scala-cli && \
    chmod +x scala-cli && \
    scala-cli config power true && \
    scala-cli version

WORKDIR /tmp/sandbox
COPY project.scala .
RUN echo '@main def hello = println(42)' > main.scala | scala-cli run .

WORKDIR /src
