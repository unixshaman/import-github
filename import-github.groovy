import java.text.SimpleDateFormat

atp = library(
    identifier: 'import-github@master',
    retriever: modernSCM(
        [
            $class: 'GitSCMSource',
            remote: 'https://github.com/unixshaman/import-github.git'
        ]
    )
)

def date = new Date()
sdf = new SimpleDateFormat("yyyyMMddHHmmss")
run_id = sdf.format(date)
sdf_for_email = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
run_id_for_email = sdf_for_email.format(date)
println "Run id: ${run_id}"

//import hudson.slaves.EnvironmentVariablesNodeProperty
//import jenkins.model.Jenkins

def snapshot_id = ""
def checkpoint_job_url_params = ""
def etl_version_old = "ETL"
if (!etl_version_old?.trim()) {
    etl_version_old = "ETLOLD"
}

def blob_path = ""
def storage_account = ""
def blob_account_name = ""
def envir = "111"
def location = "UK"
def blob_shared = ""

def StageSucceed = false


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
              
            defineStandParams(this,"DEV")
            
            echo ("${blob_path}")
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
