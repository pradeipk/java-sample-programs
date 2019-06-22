after(function (done) {
    // post coverage info
    driver.switchTo().defaultContent();
    driver.executeScript("return window.__coverage__;").then(function (obj) {
        var str = JSON.stringify(obj);
        var options = {
            port: 8888,
            host: "localhost",
            path: "/coverage/client",
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            }
        };
        var req = http.request(options, function (res) {
            console.log("\nFinished sending coverage data.");
            done();
        });
        req.write(str);
        req.end();
    });
})
test.after(function () {
    // at the end of the *whole* test run, download all coverage data and place it somewhere
    console.log("Closing browser.");
    driver.quit();
})