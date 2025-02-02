import { Input } from "@/components/ui/input";
import { Button } from "@/components/ui/button";
import { IoCart, IoHeart } from "react-icons/io5";
import { Separator } from "@/components/ui/separator";
import React from "react";

const Header = () => {
  return (
    <header className="h-16 border-b flex items-center justify-between px-8">
      {/* Brand */}
      <p className="text-2xl font-bold hover:cursor-pointer">Zepynn.</p>

      {/* Search Bar */}
      <Input className="max-w-[600px]" placeholder="Search Products" />

      {/* Buttons */}
      <div className="flex space-x-4 h-5 items-center">
        <div className="flex space-x-2">
          <Button size="icon" variant="ghost">
            <IoCart className="h-6 w-6" />
          </Button>

          <Button size="icon" variant="ghost">
            <IoHeart className="h-6 w-6" />
          </Button>
        </div>

        <Separator orientation="vertical" className="h-full" />

        <div className="flex space-x-4">
          <Button>Login</Button>

          <Button variant="outline">Button</Button>
        </div>
      </div>
    </header>
  );
};

export default Header;
