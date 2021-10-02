const fizz: number[] = [0b1000110, 0b1110101, 0b1100011, 0b1101011];
const buzz: number[] = [0b1010100, 0b1101000, 0b1101001, 0b1110011];

const getFizzBuzz = (n: number) => {
  let out: String = "";

  let test1: number = 3;
  let test2: number = 5;

  if (n % test1 === 0) out += String.fromCharCode.apply(null, fizz);
  if (n % test2 === 0) out += String.fromCharCode.apply(null, buzz);

  if (out.length === 0) out = "" + n;

  return out;
};

let limit: number = 100;

for (let i = 0; i < limit; i++) {
  console.log(getFizzBuzz(i + 1));
}
