# Lab 1.4 Notes

## Docker commands:

Creating a Container
`docker create [IMAGE_NAME]`

Creating and Running a Container
`docker run [IMAGE_NAME]`

Starting a Stopped Container
`docker start [CONTAINER_NAME]`

Stopping a Running Container
`docker stop [CONTAINER_NAME]`

Restarting a Running Container
`docker restart [CONTAINER_NAME]`

Pausing a Running Container
`docker pause [CONTAINER_NAME]`

Resuming a Paused Container
`docker unpause [CONTAINER_NAME]`

List currently running containers
`docker ps`

List all containers
`docker ps -a`

Removing a Container
`docker rm [CONTAINER_NAME]`

Building an Image from a Dockerfile
`docker build -f [DOCKERFILE_PATH]`


Building an Image from a Container
`docker commit [CONTAINER_NAME] [IMAGE_NAME]`

Pulling an Image from the Docker Hub
`docker image pull [IMAGE_NAME]`

Pushing an Image to the Docker Hub
`docker image push [IMAGE_NAME]`

List Container Images
`docker image ls` or `docker images`

Deleting an Image from your System
`docker image remove [IMAGE_NAME]`

## Dockerfile

Um Dockerfile descreve como montar um sistema de arquivos privado para um contêiner e também pode conter metadados que descrevem como executar um contêiner com base nesta imagem.


## Docker Compose

O Docker Compose é uma ferramenta desenvolvida para ajudar a definir e compartilhar aplicativos multi-contêiner. Com o Compose, podemos criar um arquivo YAML para definir os serviços e, com um único comando, é possível iniciar ou desligar tudo.

Tutorial completo: https://docs.docker.com/compose/gettingstarted/

Iniciar o Docker Compose:
```
$ docker-compose up
```

Parar o Docker Compose:
```
$ docker-compose stop
```