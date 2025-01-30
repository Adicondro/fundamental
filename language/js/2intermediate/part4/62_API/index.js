fetch('https://pokeapi.co/api/v2/pokemon-species/aegislash')
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    // Lakukan sesuatu dengan data yang diterima
    console.log(data);
    // Contoh: Menampilkan nama dan gambar Ditto
    const name = data.name;
    const spriteUrl = data.sprites.front_default;
    console.log(`Nama Pokémon: ${name}`);
    console.log(`Gambar: ${spriteUrl}`);
    // Contoh lainnya: Menampilkan tipe Pokémon Ditto
    const types = data.types.map(type => type.type.name).join(', ');
    console.log(`Tipe: ${types}`);
  })
  .catch(error => {
    console.error('Error:', error);
  });
