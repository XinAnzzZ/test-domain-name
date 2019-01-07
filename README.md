**本项目演示使用docker快速部署springboot服务。**

#### 请确保你的linux主机已具备以下环境：

1. docker
2. docker-compose
3. git
4. java
5. maven

#### 快速启动

1. fork本项目到你的github仓库。在你的linux主机执行`git clone 项目地址`命令拉取本仓库源码到你的工作目录。
本教程使用的工作目录名称为“/docker/java-service”，不懂脚本的同学请使用相同的工作目录。
若使用的工作目录名称不一致，请自行讲脚本中所有的“/docker/java-service”替换为你的工作目录。

2. 执行`docker-compose up -d`命令启动docker容器。请确保9001端口开启且未被占用。

3. 浏览器输入`ip:9001`访问首页。

4. 若向仓库中提交了代码，需要重新部署，请进入到项目根目录下执行`sh ./deploy.sh`命令来运行`deploy.sh`脚本文件。

#### 常见问题

1. 如何修改项目端口？

    1. 修改`docker-entrypoint.sh`脚本中启动参数，将“9001”替换为你的端口。
    2. 由于docker容器做了端口映射，请修改`docker-compose.yml`文件中的端口映射。
    
2. linux主机如果没有java和maven环境可以吗？

    可以。请修改`docker-compose.yml`中目录映射，删除“- /root/.m2:/root/.m2”。

如果有其他任何问题，你都可以给我提issue或者直接私信我来沟通与交流。