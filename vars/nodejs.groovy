def call(){
    node(){

        common.pipelineInit()
        stage('Download Dependencies') {
            sh '''
                ls -ltr
               npm install
               '''
        }

        sh 'env'
       // common.publishArtifacts()
    }

}