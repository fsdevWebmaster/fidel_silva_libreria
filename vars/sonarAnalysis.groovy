def call() {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh "/usr/local/bin/sonar-scanner"
  timeout(time: 2, unit: "MINUTES") {
    waitForQualityGate abortPipeline: false
    
    sh 'echo :: end timeout ::'
  }
}
