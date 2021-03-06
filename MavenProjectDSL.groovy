job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}")
    scm {
        github("lilitagetes/JavaStudy", "*/Labs")
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('package', 'Lab3_4/pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.jar')
    }
}
