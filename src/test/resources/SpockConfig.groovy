
spockReports {
    set 'com.athaydes.spockframework.report.showCodeBlocks': true
    set 'com.athaydes.spockframework.report.outputDir': 'target/spock-reports'
}

report {
    enabled true
    logFileDir './target'
    logFileName 'spock-report.json'
    logFileSuffix new Date().format('yyyy-MM-dd_HH_mm_ss')
}
