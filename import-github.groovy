import java.text.SimpleDateFormat

/*atp = library(
    identifier: 'import-github@master',
    retriever: modernSCM(
        [
            $class: 'GitSCMSource',
            remote: 'https://github.com/unixshaman/import-github.git'
        ]
    )
)*/


def globalParams = [:]

// evaluate('mySharedLibrary.groovy')
// globParams = defineStandParams("DEV")



def hhh = ''

pipeline {
  
  parameters {
    booleanParam(name: 'run', defaultValue: false, description: 'Подтверждение запуска сборки')
    string(defaultValue: 'asdf', description: 'asfd asdf', name: 'asdf1', trim: true)
    string(defaultValue: 'asdf', description: 'asfd asdf', name: 'asdf2', trim: true)
  }
  agent any
    /*{
    node {
       label 'slave'
    }
 }*/

    stages {
      
      
      stage ('Init') {
        steps {
          script {
            hhh = params.asdf1
            
            
          def grvCode = httpRequest(ignoreSslErrors: true, 
                      url: 'https://raw.githubusercontent.com/unixshaman/import-github/master/vars/defineStandParams.groovy',
                      outputFile: 'mySharedLibrary.groovy'
                      )
            // evaluate(new File('/mnt/resource/jenkins_agent/workspace/TEST/import-github/mySharedLibrary.groovy'))
            libs = load 'mySharedLibrary.groovy'
            libs.sampleFunc()

            globParams = libs.defineStandParams("DEV")
            
            echo ("${globParams["blob_path"]}")
/*
            if (hhh == 'asdf') {
              def ggg = input(id: 'checkAsdf',
                message: 'Неправильный параметр',
                ok: 'Применить',
                parameters: [
                  string(defaultValue: 'fdsa 1234', description: '', name: 'asdfNew', trim: true)
                ]
              )
              hhh = ggg
            }
*/            
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
