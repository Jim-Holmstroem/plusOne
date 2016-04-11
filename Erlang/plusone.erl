-module(plusone).
-export([plusone/0]).

plusone() ->
    {ok, [S]} = io:fread("", "~s"),
    {X, _} = string:to_integer(S),
    io:format("~B~n", [X + 1]),
    plusone().
