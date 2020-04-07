pipeline {
  parameters {
    booleanParam(name: 'run', defaultValue: false, description: 'Подтверждение запуска сборки')
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
           echo "${params.asdf1} ${params.asdf2}"
         }

         post {
            success {
               echo "success"
            }
         }
      }
   }
}
