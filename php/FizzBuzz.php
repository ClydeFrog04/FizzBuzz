<?php
              
$fizzArr = array(0b1000110, 0b1110101, 0b1100011, 0b1101011);
$buzzArr = array(0b1010100, 0b1101000, 0b1101001, 0b1110011);
$fizz = implode("",array_map("chr", $fizzArr));
$buzz = implode("",array_map("chr", $buzzArr));
              


for($i = 1; $i < 101; $i++){
    $out = "";
    $test1 = 3;
    $test2 = 5;
    
    if($i % $test1 == 0){
        $out = $out . $fizz;
    }
    if($i % $test2 == 0){
        $out = $out . $buzz;
    }
    
    if(strlen($out) == 0) $out = strval($i);
    
    echo $out . "\n";
}