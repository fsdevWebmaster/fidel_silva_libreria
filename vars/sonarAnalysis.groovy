def call(abortPipeline = false) {
  sh "echo Ejecución de las pruebas de calidad de código."
  sh "/usr/local/bin/sonar-scanner"
  timeout(time: 2, unit: "MINUTES") {
    sh "echo bulid url:: ${BUILD_URL}" \
    sh "echo job name:: ${JOB_NAME}"
    // waitForQualityGate abortPipeline: false
    return abortPipeline
  }  
}
