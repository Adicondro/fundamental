function task1() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Task 1 Complete");
            resolve();
        }, 2000);
    });
}

function task2() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Task 2 Complete");
            resolve();
        }, 4000);
    });
}

function task3() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Task 3 Complete");
            resolve();
        }, 3000);
    });
}

function task4() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Task 4 Complete");
            resolve();
        }, 5000);
    });
}

function task5() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Task 5 Complete");
            resolve();
        }, 1000);
    });
}

// Chain promises
task1()
    .then(() => task4())
    .then(() => task5())
    .then(() => task2())
    .then(() => task3())
    .then(() => console.log("All tasks complete"))
    .catch((error) => console.error("An error occurred:", error));
