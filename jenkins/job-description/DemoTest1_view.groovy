 
listView('DemoTest1 Jobs') {
    description('DemoTest1 Jobs')
    jobs {
        regex('DemoTest1_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
