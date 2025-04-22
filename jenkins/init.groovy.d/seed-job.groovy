import jenkins.model.*
import hudson.model.*
import javaposse.jobdsl.plugin.ExecuteDslScripts

println "--> Création du job 'pipeline' à partir d’un seed"

def instance = Jenkins.getInstance()

def jobName = "pipeline"
def job = instance.getItem(jobName)

if (job == null) {
    def seedJob = instance.createProject(FreeStyleProject, jobName)
    seedJob.buildersList.add(new ExecuteDslScripts(
        new ExecuteDslScripts.ScriptLocation("true", "", "/var/jenkins_home/jobsdsl/pipelineJob.groovy"),
        false, 
        RemovedJobAction.IGNORE, 
        RemovedViewAction.IGNORE, 
        LookupStrategy.JENKINS_ROOT
    ))
    seedJob.save()
}