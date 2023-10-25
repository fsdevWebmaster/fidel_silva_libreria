def call() {
  sh "echo Ejecución de las pruebas de calidad de código."
  sonar-scanner \
    -Dsonar.projectKey=sonar-first \
    -Dsonar.sources=./ \
    -Dsonar.host.url=http://localhost:9000 \
    -Dsonar.token=sqp_5028a7dc8205bde87db68c6790357489b3a319ff
}
