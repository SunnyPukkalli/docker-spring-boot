# docker-spring-boot

|API                |DESCRIPTION        |
|-------------------|-------------------|
|/rest/docker/hello| Hello from Docker with IP Address and Hostname|
|port exposed| 8095|

###### Command to clone git project
` git clone https://github.com/SunnyPukkalli/docker-spring-boot.git `

###### Command to build and push images to Google Container repository
`mvn com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/docker-spring-boot:v1`

###### Command to login into GCP Cluster
`gcloud container clusters get-credentials docker-cluster-1 --zone <ZONE NAME>`

###### Kubernetes commands
`kubectl get pods`
`kubectl get services`
`kubectl get deployment`

###### run docker images locally from GCR
`docker run -ti -rm -p 8080:8095 gcr.io/$GOOGLE_CLOUD_PROJECT/docker-spring-boot:v1`

###### Command to do deployment
`kubectl run docker-spring-boot --image=gcr.io/$GOOGLE_CLOUD_PROJECT/docker-spring-boot:v1 --port=8095`

###### Command to expose a deployment ( as a Service )
`kubectl expose deployment docker-spring-boot --type=LoadBalancer `

###### Command to scale a deployment 
`kubectl scale deployment docker-spring-boot --replicas=3`
