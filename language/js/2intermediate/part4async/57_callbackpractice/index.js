  function printName(callback){
    setTimeout(() => {
        callback("Halo semua");
    }, 4000);
  }

  printName(data => {
    console.log(data);
  });

  