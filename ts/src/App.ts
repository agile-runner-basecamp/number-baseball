import * as readline from 'readline';
import { generateRandomNumbers } from './NumberGenerator/NumberGenerator';
import { parseInput } from './InputValidator/InputValidator';
import { formatResult, isCorrect, judge } from './Judge/Judge';


// refact필요
function askGuess(rl: readline.Interface): Promise<string> {
    return new Promise((resolve) => {
        rl.question('숫자를 입력해 주세요 : ', resolve);
    });
}

function askRestart(rl: readline.Interface): Promise<string> {
    return new Promise((resolve) => {
        rl.question('게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n', resolve);
    });
}

function tryParseInput(input: string): number[] | null {
    try {
        return parseInput(input);
    } catch (e) {
        // ResultView.printInvalidInput 역할을 직접 구현
        console.log(`[오류] ${(e as Error).message}`);
        return null;
    }
}

// resolve될 때 Promise<void> 데이터를 반환하지 않는 비동기 함수
export async function playRound(rl: readline.Interface): Promise<void> {
    const answer = generateRandomNumbers();
    while (true) {
        const input = await askGuess(rl);
        const guess = tryParseInput(input);
        if (!guess) continue;

        const result = judge(answer, guess);
        
        console.log(formatResult(result));

        if(isCorrect(result)){
            console.log("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return; // Promise<void> 반환
        }
    }
}

export async function run(): Promise<void> {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout,
    });
    // refact 필요
    while (true) {
        await playRound(rl);
        const restart = await askRestart(rl);
        if (restart === "2") {
            rl.close();
            return;
        }
        if (restart !== "1") {
            console.log("[오류] 1 또는 2를 입력해 주세요.");
        }
    }
}


export class App {
    async run(): Promise<void> {
        await run();
    }
}

if (require.main === module) {
  run().catch((err) => {
    console.error(err);
    process.exit(1);
  });
}
