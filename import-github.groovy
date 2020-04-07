def hhh = ''

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
      
      
      stage ('Init') {
        steps {
          script {
            hhh = params.asdf1
            if (hhh == 'asdf') {
              def ggg = input {
                message 'Неправильный параметр'
                id 'checkAsdf'
                ok 'Применить'
                parameters {
                  string(defaultValue: 'fdsa 1234', description: '', name: 'asdfNew', trim: true)
                }
              }
              hhh = ggg
            }
          }
        }
      }

      stage('Build') {
        when { expression { params.run } }
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
