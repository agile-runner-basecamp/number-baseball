export function parseInput(input: string): number[] {
    if (input.length !== 3) {
        throw new Error("3자리 숫자를 입력해 주세요.");
    }

    const numbers = input.split("").map(Number);

    if (numbers.some(isNaN)) {
        throw new Error("숫자만 입력해 주세요.");
    }

    if (numbers.some(n => n === 0)) {
        throw new Error("1~9 사이의 숫자를 입력해 주세요.");
    }

    if (new Set(numbers).size !== 3) {
        throw new Error("중복되지 않는 숫자를 입력해 주세요.");
    }

    return numbers; // ex) [1, 4, 7]
}