def call(pipeline, envir){
  
  echo ("text sample")
  
  if (envir == 'DEV') {
      pipeline.blob_path = "data/input/DaVinciProjectOneDrive"
      pipeline.storage_account = "https://davincidev01.blob.core.windows.net"
      pipeline.blob_account_name = "davincidev01"
      pipeline.blob_shared = "dev_blob_shared_id"
      pipeline.host_prod = "https://azl-davinci016.np-cloud-pg.com:8443"
      pipeline.target_folder = "davinci-dry-run-datalake"
      pipeline.sas_blob_shared = "sas_dev_blob_shared_id"
      pipeline.mlflow_url = "local" // "http://azl-davinci016.np-cloud-pg.com:5000"
      pipeline.api_token_shared_id = "api_token_shared_id_dev"
      pipeline.api_token_shared_id_w_token = "api_token_davincinonprod"
      pipeline.shared_id_user_w_psw = "shared-id2"
  } else {
      pipeline.blob_path = "data/input/DaVinciProjectOneDrive"
      pipeline.storage_account = "https://davincistorage01.blob.core.windows.net"
      pipeline.blob_account_name = "davincistorage01"
      pipeline.blob_shared = "prod_blob_shared_id"
      pipeline.host_prod = "https://azl-davincipr01.cloud-pg.com:8443"
      pipeline.target_folder = "davinci-datalake"
      pipeline.sas_blob_shared = "sas_prod_blob_shared_id"
      pipeline.mlflow_url = "http://azl-davincipr01.cloud-pg.com:5000"
      pipeline.api_token_shared_id = "api_token_shared_id_prod"
      pipeline.api_token_shared_id_w_token = "api_token_davinci"
      pipeline.shared_id_user_w_psw = "shared-id"
  }
}
