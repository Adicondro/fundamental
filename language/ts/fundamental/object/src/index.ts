let employee: {
    readonly id: number,
    name: string,
    age: number,
    designation: string,
    retire: (date:Date) => void
} = {
    id: 1,
    // name: undefined, it can't be undefined
    name: 'John',
    age: 30,
    designation: 'Software Engineer',
    retire: (date: Date) => {
        console.log('Retiring on', date);
    }
}

// employee.name = 'Mosh' // in js it will work but in ts it will throw error, because we have not defined name property in employee object

