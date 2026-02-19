import { parseInput } from "./InputValidator"


describe('InputValidator', () => {
    it('3자리 숫자 입력 안함', () => {
        expect(() => parseInput('12')).toThrow("3자리 숫자를 입력해 주세요.")
    })

    it('숫자가 아님', () => {
        expect(() => parseInput('나나나')).toThrow("숫자만 입력해 주세요.")
    })
})

