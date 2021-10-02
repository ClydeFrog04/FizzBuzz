const fizz = [0b1000110, 0b1110101, 0b1100011, 0b1101011];
const buzz = [0b1010100, 0b1101000, 0b1101001, 0b1110011];

const getFizzBuzz = (n) => {
  let out = "";

  let test1 = 3;
  let test2 = 5;

  if (n % test1 === 0) out += String.fromCharCode.apply(null, fizz);
  if (n % test2 === 0) out += String.fromCharCode.apply(null, buzz);

  if (out.length === 0) out = "" + n;

  return out;
};

let limit = 100;

for (let i = 0; i < limit; i++) {
  console.log(getFizzBuzz(i + 1));
}
