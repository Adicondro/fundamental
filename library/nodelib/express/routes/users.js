const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
  res.send("Users List");
});

// router.get('/new', (req, res) => {
//     res.send('New User Form');
// })

// Cannot find
router.post("/", (req, res) => {
  res.send("Create User");
});

router
  .route("/:id")
  .get((req, res) => {
    console.log(req.user);
    res.send(`User ID is ${req.params.id}`);
  })
  .put((req, res) => {
    res.send(`Update User ID with ${req.params.id}`);
  })
  .delete((req, res) => {
    res.send(`DeleteUser ID is ${req.params.id}`);
  });

const users = [{ name: "Kyle" }, { name: "Sally" }];
router.param("id", (req, res, next, id) => {
  req.user = users[id];
  next();
});

// router.get("/id", (req, res) => {
//   res.send(`User ID ${req.params.id}`);
// });

// router.put("/:id", (req, res) => {
//   res.send(`Update User ID with ${req.params.id}`);
// });

// router.delete("/:id", (req, res) => {
//   res.send(`DeleteUser ID is ${req.params.id}`);
// });

// It will overwrite this
// router.get('/new', (req, res) => {
//     res.send('New User Form');
// })

module.exports = router;
