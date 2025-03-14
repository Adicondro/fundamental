const express = require("express");
const app = express();

app.set("view engine", "ejs");
app.use(logger);

// Rendering HTML
app.get("/", (req, res) => {
  console.log("Request received");
  res.render("index", { text: "World" });
});

const userRouter = require("./routes/users");

app.use("/users", userRouter);

function loger(req, res, next) {
  console.log(req.originalUrl);
  next();
}

app.listen(3000);
