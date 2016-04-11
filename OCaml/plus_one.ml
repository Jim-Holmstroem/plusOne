open Printf
let () = try while true do printf "%d\n" @@ succ @@ read_int () done with End_of_file -> ()
