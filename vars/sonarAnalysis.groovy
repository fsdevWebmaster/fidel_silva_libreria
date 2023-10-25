def call() {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh sonar-scanner
    -Dsonar.projectKey=sonar-first \
}
