pipeline{
	tools{
		jdk 'java'
		maven 'maven'
		}
		agent any
		stages{
			stage('checkout'){
				agent any
				steps{
					echo 'CLONING....'
					git 'https://github.com/Venkatapathi84/venkat.git'
				}
			}	
			stage('compile'){
				agent any
				steps{
					echo 'COMPILING...'
					sh 'mvn compile'
				}
			}
			stage('codereview'){
				agent any
				steps{
					echo 'CODEREVIEW'
					sh 'mvn pmd:pmd'
				}
			}
		}	

}		
