import Image from 'next/image'
import Link from 'next/link'
import ProductCard from './components/ProductCard'

export default function Home(){
  return(
    <main>
      <h1>Hello World</h1>
      <Link href="/users">Click Here</Link>
      <ProductCard></ProductCard>
    </main>
  )  
}
