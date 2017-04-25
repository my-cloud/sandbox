job('example-job-from-job-dsl') {
    scm {
        github('my-cloud/sandbox', 'test')
    }
    triggers {
        cron("@hourly")
    }
    steps {
        shell("echo 'Hello World'")
    }
}
