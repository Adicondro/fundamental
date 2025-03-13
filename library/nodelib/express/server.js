const express = require('express');
const app = express();

app.set('view engine', 'ejs');

// Rendering HTML
app.get('/', (req, res) => {
    console.log("Request received")
    res.render('index', {text: 'World'});
})

const userRouter = require('./routes/users');

app.use('/users', userRouter);



app.listen(3000);