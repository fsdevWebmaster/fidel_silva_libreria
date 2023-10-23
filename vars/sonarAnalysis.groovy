def call(sonarenv) {
  timeout(5) {
    sh 'echo Ejecución de las pruebas de calidad de código'
    sh "echo Abort param: ${sonarenv}"
  }
}