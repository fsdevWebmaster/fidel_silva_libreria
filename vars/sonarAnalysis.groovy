def call() {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh "/usr/local/bin/sonar-scanner"
  def qg = waitForQualityGate abortPipeline: false, credentialsId: 'new-creds'
  sh "echo QG STATUS:: ${qg.status}"

}
