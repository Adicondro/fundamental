const express = require('express');
const router = express.Router();

router.get('/', (req, res) => {
    res.send('Users page');
})

router.post('/new', (req, res) => {
    res.send('Create User');
})


module.exports = router;