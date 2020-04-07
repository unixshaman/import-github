pipeline {
  parameters {
    string(defaultValue: 'asdf', description: 'asfd asdf', name: 'asdf1', trim: true)
    string(defaultValue: 'asdf', description: 'asfd asdf', name: 'asdf2', trim: true)
  }
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
