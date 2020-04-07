pipeline {
  agent {
    node {
       label 'slave'
    }
 }

    stages {
      stage('Build') {
         steps {
            echo "qwe"
         }

         post {
            success {
               echo "success"
            }
         }
      }
   }
}
