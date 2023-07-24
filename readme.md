# maven build

```
docker run -it --rm --name my-maven-project -v ~/.m2:/root/.m2 -v $(pwd):/app maven:3.8.3-amazoncorretto-17 mvn clean install -f app/pom.xml -Dmaven.test.skip=true
```
# image build

```
docker build . -t qoosdd89382/mongo-app
```

# image push

```
docker push qoosdd89382/mongo-app
```

# deploy on k8s

```
kubectl apply -f deploy/object/configMap.yml
kubectl apply -f deploy/object/cronjob.yml
```

# watch

```
kubectl port-forward svc/mongodb-service 27017:27017
```

# TODO
- secret 再掛一個 volume file

# DONE
- JAVA 11 改 JAVA 17
- 把 deployment 改為 cronjob
- k8s 裏的 mongo 需要建 database, collection 
- 測試 configMap 中直接拿環境變數映射進 springboot 能不能 work
