import { generateRandomNumbers } from "./NumberGenerator";

describe('generateRandomNumbers', () => {
    it('3개 숫자 생성', () => {
        const numbers = generateRandomNumbers();
        expect(numbers).toHaveLength(3);
    })
})