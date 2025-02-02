import ContactMeButton from "@/components/ContactMeButton"

const Footer = () => {
    return (
        <footer className="min-h-16 py-8 border-t flex items-center justify-between px-20 mt-20">
            <p>
                Pleaground Copyright 2024
            </p>
            <ContactMeButton>
                Contact Me!
            </ContactMeButton>
        </footer>
    )
}

export default Footer;
