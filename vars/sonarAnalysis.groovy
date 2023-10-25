def call() {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh "/usr/local/bin/sonar-scanner"
  withSonarQubeEnv(credentialsId: 'new-creds', installationName: 'sonarqube-server') {
    def qg = waitForQualityGate()
    sh "echo QG STATUS:: ${qg.status}"
  }
}
