cREATE TABLE weather_details (
  id           BIGINT PRIMARY KEY NOT NULL,
  city         VARcHAR(255) NOT NULL,
  tdegc		   VARcHAR(255) NOT NULL,
  tdegf		   VARcHAR(255) NOT NULL,
  twimage	   VARcHAR(255) NOT NULL,
  tplusonedegc		   VARcHAR(255) NOT NULL,
  tplusonedegf		   VARcHAR(255) NOT NULL,
  tplusonewimage	   VARcHAR(255) NOT NULL,
  tplustwodegc		   VARcHAR(255) NOT NULL,
  tplustwodegf		   VARcHAR(255) NOT NULL,
  tplustwowimage	   VARcHAR(255) NOT NULL,
  tplusthreedegc		   VARcHAR(255) NOT NULL,
  tplusthreedegf		   VARcHAR(255) NOT NULL,
  tplusthreewimage	   VARcHAR(255) NOT NULL,
  tplusfourdegc		   VARcHAR(255) NOT NULL,
  tplusfourdegf		   VARcHAR(255) NOT NULL,
  tplusfourwimage	   VARcHAR(255) NOT NULL,
  tplusfivedegc		   VARcHAR(255) NOT NULL,
  tplusfivedegf		   VARcHAR(255) NOT NULL,
  tplusfivewimage	   VARcHAR(255) NOT NULL,
  tplussixdegc		   VARcHAR(255) NOT NULL,
  tplussixdegf		   VARcHAR(255) NOT NULL,
  tplussixwimage	   VARcHAR(255) NOT NULL,
  percipation	   VARcHAR(255) NOT NULL,
  humidity	   VARcHAR(255) NOT NULL,
  wind 	   VARcHAR(255) NOT NULL,

  cONSTRAINT id_unq UNIQUE (id)
);