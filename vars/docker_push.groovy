def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword('credentialsId':"dockerhubCred",
                passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
