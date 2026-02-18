export interface JudgeResult {
    strikes: number;
    balls: number;
}

export function judge(answer: number[], guess: number[]): JudgeResult {
    const strikes = countStrikes(answer,guess);
    const balls = countBalls(answer, guess);
    return { strikes, balls }; 
}

function countStrikes(answer: number[], guess:number[]): number {
    return guess.filter((num, index) => answer[index] === num).length;
}

function countBalls(answer: number[], guess:number[]): number {
    const sameNumbers = guess.filter((num) => answer.includes(num)).length;
    return sameNumbers - countStrikes(answer,guess);
}

export function formatResult(result: JudgeResult): string {
    const { strikes, balls } = result;

    if (strikes === 0 && balls ===0) {
        return '낫싱';
    }

    if (strikes === 0) {
        return `${balls}볼`;
    }

    if (balls === 0) {
        return `${strikes}스트라이크`;
    }

    return `${balls}볼 ${strikes}스트라이크`
}

export function isCorrect(result: JudgeResult): boolean {
    return result.strikes === 3;
}