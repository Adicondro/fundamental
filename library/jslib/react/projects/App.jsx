import React from "react";
import Box from "./components/Box";
import Nav from "./components/Nav";
import Footer from "./components/Footer";

function App() {
  return (
    <>
      <Nav />
      <main className="min-h-[90vh]">
        <Box />
      </main>
      <Footer />
    </>
  );
}

export default App;
