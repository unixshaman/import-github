def defineStandParams(envir){
  
  def globalParams = [:]
  
  if (envir == 'DEV') {
      globalParams["blob_path"] = "data/input/DaVinciProjectOneDrive"
      globalParams["storage_account"] = "https://davincidev01.blob.core.windows.net"
      globalParams["blob_account_name"] = "davincidev01"
      globalParams["blob_shared"] = "dev_blob_shared_id"
      globalParams["host_prod"] = "https://azl-davinci016.np-cloud-pg.com:8443"
      globalParams["target_folder"] = "davinci-dry-run-datalake"
      globalParams["sas_blob_shared"] = "sas_dev_blob_shared_id"
      globalParams["mlflow_url"] = "local" // "http://azl-davinci016.np-cloud-pg.com:5000"
      globalParams["api_token_shared_id"] = "api_token_shared_id_dev"
      globalParams["api_token_shared_id_w_token"] = "api_token_davincinonprod"
      globalParams["shared_id_user_w_psw"] = "shared-id2"
  } else {
      globalParams["blob_path"] = "data/input/DaVinciProjectOneDrive"
      globalParams["storage_account"] = "https://davincistorage01.blob.core.windows.net"
      globalParams["blob_account_name"] = "davincistorage01"
      globalParams["blob_shared"] = "prod_blob_shared_id"
      globalParams["host_prod"] = "https://azl-davincipr01.cloud-pg.com:8443"
      globalParams["target_folder"] = "davinci-datalake"
      globalParams["sas_blob_shared"] = "sas_prod_blob_shared_id"
      globalParams["mlflow_url"] = "http://azl-davincipr01.cloud-pg.com:5000"
      globalParams["api_token_shared_id"] = "api_token_shared_id_prod"
      globalParams["api_token_shared_id_w_token"] = "api_token_davinci"
      globalParams["shared_id_user_w_psw"] = "shared-id"
  }

  return globalParams
};

return defineStandParams(envir)
