def call(abortPipeline = false) {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh "/usr/local/bin/sonar-scanner"
  timeout(time: 2, unit: "MINUTES") {
    sh "echo branch:: ${BRANCH}"
    // waitForQualityGate abortPipeline: false
    return abortPipeline
  }  
}
