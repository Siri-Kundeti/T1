const board = document.getElementById('board');
const resetButton = document.getElementById('reset-button');
let currentPlayer = 'X';
let gameOver = false;

function checkWinner() {
    const cells = document.querySelectorAll('.cell');
    const winningCombos = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];

    for (const combo of winningCombos) {
        const [a, b, c] = combo;
        if (cells[a].textContent && cells[a].textContent === cells[b].textContent && cells[a].textContent === cells[c].textContent) {
            alert(`${currentPlayer} wins!`);
            gameOver = true;
            return;
        }
    }

    if ([...cells].every(cell => cell.textContent)) {
        alert("It's a draw!");
        gameOver = true;
    }
}

function handleClick(e) {
    if (!gameOver && !e.target.textContent) {
        e.target.textContent = currentPlayer;
        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
        checkWinner();
    }
}

function createBoard() {
    for (let i = 0; i < 9; i++) {
        const cell = document.createElement('div');
        cell.classList.add('cell');
        cell.addEventListener('click', handleClick);
        board.appendChild(cell);
    }
}

function resetGame() {
    const cells = document.querySelectorAll('.cell');
    for (const cell of cells) {
        cell.textContent = '';
    }
    gameOver = false;
    currentPlayer = 'X';
}

createBoard();

resetButton.addEventListener('click', resetGame);
