def call(sonarenv = "false") {
  timeout(time: 5, unit: "MINUTES") {
    sh 'echo Ejecución de las pruebas de calidad de código'
    if(sonarenv != "false") {
      sh "echo Abort process: ${sonarenv}"
    }
  }
}