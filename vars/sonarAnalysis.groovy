def call(sonarenv = "false") {
  timeout(5) {
    sh 'echo Ejecución de las pruebas de calidad de código'
    if(sonarenv != "false") {
      sh "echo Abort process: ${sonarenv}"
    }
  }
}