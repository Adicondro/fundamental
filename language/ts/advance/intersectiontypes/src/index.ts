type Draggable = {
    drag: () => void
};


type Resizable = {
    resize: () => void
};

type UIWidget = Draggable & Resizable;

let textBox: UIWidget = {
    drag: () => {
        console.log('Dragging the text box');
    },
    resize: () => {
        console.log('Resizing the text box');
    }
}