def call(pipeline, envir){
  
  echo ("text sample")
  print(envir)
  print(pipeline)
  
  if (envir == 'DEV') {
      blob_path = "data/input/DaVinciProjectOneDrive"
      storage_account = "https://davincidev01.blob.core.windows.net"
      blob_account_name = "davincidev01"
      blob_shared = "dev_blob_shared_id"
      host_prod = "https://azl-davinci016.np-cloud-pg.com:8443"
      target_folder = "davinci-dry-run-datalake"
      sas_blob_shared = "sas_dev_blob_shared_id"
      mlflow_url = "local" // "http://azl-davinci016.np-cloud-pg.com:5000"
      api_token_shared_id = "api_token_shared_id_dev"
      api_token_shared_id_w_token = "api_token_davincinonprod"
      shared_id_user_w_psw = "shared-id2"
  } else {
      blob_path = "data/input/DaVinciProjectOneDrive"
      storage_account = "https://davincistorage01.blob.core.windows.net"
      blob_account_name = "davincistorage01"
      blob_shared = "prod_blob_shared_id"
      host_prod = "https://azl-davincipr01.cloud-pg.com:8443"
      target_folder = "davinci-datalake"
      sas_blob_shared = "sas_prod_blob_shared_id"
      mlflow_url = "http://azl-davincipr01.cloud-pg.com:5000"
      api_token_shared_id = "api_token_shared_id_prod"
      api_token_shared_id_w_token = "api_token_davinci"
      shared_id_user_w_psw = "shared-id"
  }
}
